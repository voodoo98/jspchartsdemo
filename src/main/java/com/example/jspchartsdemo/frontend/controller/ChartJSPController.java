package com.example.jspchartsdemo.frontend.controller;

import com.example.jspchartsdemo.frontend.service.DashBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ChartJSPController {

    private final DashBoardService service;

    @GetMapping("/dashboard")
    public String showDashBoard(final Model model) {
        this.service.buildChart(model);
        return "dashboard/view-charts";
    }

}