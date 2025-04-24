package jp.co.task.controller;

import jp.co.task.controller.dto.DashboardResponse;
import jp.co.task.service.DashboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public List<DashboardResponse> getDashboard() {
        return dashboardService.getDashboardItems();
    }
}
