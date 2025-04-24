package jp.co.task.service;

import jp.co.task.controller.dto.DashboardResponse;
import jp.co.task.model.Task;
import jp.co.task.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashboardService {

    private final TaskRepository taskRepository;

    public DashboardService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<DashboardResponse> getDashboardItems() {
        List<Task> tasks = taskRepository.findAll(); // 後でtodayだけに絞る
        return tasks.stream().map(task -> new DashboardResponse(
                task.getProject().getName(),
                task.getTitle(),
                task.getDeadline().toLocalDate().toString(),
                classifyTimeRange(task.getDeadline()),
                task.getAssignee()
        )).collect(Collectors.toList());
    }

    private String classifyTimeRange(LocalDateTime deadline) {
        int hour = deadline.getHour();
        if (hour < 12) return "午前";
        if (hour < 18) return "午後";
        return "夜間";
    }
}

