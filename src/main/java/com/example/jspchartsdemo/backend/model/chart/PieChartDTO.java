package com.example.jspchartsdemo.backend.model.chart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class PieChartDTO implements Serializable {

    private String x;
    private Long y;

}
