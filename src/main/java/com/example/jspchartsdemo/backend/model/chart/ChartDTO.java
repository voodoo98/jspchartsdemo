package com.example.jspchartsdemo.backend.model.chart;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ChartDTO {

    private LocalDate date;
    private Long value;

}
