package com.example.jspchartsdemo.frontend.service;

import com.example.jspchartsdemo.backend.service.ChartService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@Slf4j
@Data
public class DashBoardService {

    private ChartService chartService;

    public void buildChart(final Model model) {
        model.addAttribute("linecharttitle", "Sample Line Chart");
        model.addAttribute("linebartitle", "Sample Bar Chart");
    }

}
