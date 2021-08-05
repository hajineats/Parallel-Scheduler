package com.team7.visualization.system;

import javafx.scene.chart.LineChart;

public class CPUUtilizationProvider extends UtilizationProvider {
    public CPUUtilizationProvider(LineChart<String, Number> chart, String title, TimeProvider tp) {
        super(chart, title, tp);
    }

    @Override
    public double getData() {
//        return (int) (this.bean.getProcessCpuLoad() * 100);
        return this.bean.getProcessCpuLoad() * 100;
    }

    @Override
    public double getUpperBound() {
        return 100;
    }
}
