package jp.co.task.repository;

import jp.co.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // 例：特定のプロジェクトのタスク一覧を取得
    List<Task> findByProjectId(Long projectId);

    // 例：日付で絞り込む（ダッシュボード表示用）
    List<Task> findByDeadlineBetween(java.time.LocalDateTime from, java.time.LocalDateTime to);
}
