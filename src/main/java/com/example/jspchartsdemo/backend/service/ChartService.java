package com.example.jspchartsdemo.backend.service;

import com.example.jspchartsdemo.backend.model.chart.ChartDTO;
import com.example.jspchartsdemo.backend.model.chart.PieChartDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
@Data
public class ChartService {

    public List<ChartDTO> buildSampleDataForLineAndBarCharts() {
        return List.of(
                new ChartDTO(LocalDate.of(2024, 3, 24), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 25), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 26), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 27), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 28), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 29), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 30), new Random().nextLong(10)),
                new ChartDTO(LocalDate.of(2024, 3, 31), new Random().nextLong(10)));
    }

    public List<PieChartDTO> buildSampleDataForPieCharts() {
        return List.of(
                new PieChartDTO("Android", new Random().nextLong(20) + 3),
                new PieChartDTO("iOS", new Random().nextLong(20) + 3),
                new PieChartDTO("Desktop", new Random().nextLong(20) + 3));
    }

}
