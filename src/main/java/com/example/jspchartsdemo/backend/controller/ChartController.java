package com.example.jspchartsdemo.backend.controller;

import com.example.jspchartsdemo.backend.model.chart.ChartDTO;
import com.example.jspchartsdemo.backend.model.chart.PieChartDTO;
import com.example.jspchartsdemo.backend.service.ChartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ChartController {

    private final ChartService service;

    @GetMapping(value = "/linechartdaily")
    public List<ChartDTO> getDailyLineChart() {
        return this.service.buildSampleDataForLineAndBarCharts();
    }

    @GetMapping(value = "/barchartdaily")
    public List<ChartDTO> getDailyBarChart() {
        return this.service.buildSampleDataForLineAndBarCharts();
    }

    @GetMapping(value = "/piechartdaily")
    public List<PieChartDTO> getDailyPieChart() {
        return this.service.buildSampleDataForPieCharts();
    }

}