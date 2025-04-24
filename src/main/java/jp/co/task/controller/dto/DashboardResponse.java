package jp.co.task.controller.dto;

public class DashboardResponse {
    private String projectName;
    private String taskTitle;
    private String date;
    private String timeRange;
    private String assignee;

    public DashboardResponse(String projectName, String taskTitle, String date, String timeRange, String assignee) {
        this.projectName = projectName;
        this.taskTitle = taskTitle;
        this.date = date;
        this.timeRange = timeRange;
        this.assignee = assignee;
    }
}
