package jp.co.task.controller;

import jp.co.task.model.Task;
import jp.co.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/projects/{projectId}/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks(@PathVariable Long projectId) {
        return taskService.getTasksByProjectId(projectId);
    }

    @PostMapping
    public Task createTask(@PathVariable Long projectId, @Valid @RequestBody Task task) {
        return taskService.createTask(projectId, task);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Long projectId,
                           @PathVariable Long taskId,
                           @Valid @RequestBody Task task) {
        return taskService.updateTask(projectId, taskId, task);
    }
}
