package com.team7.visualization.system;

import javafx.scene.chart.LineChart;

public class RAMUtilizationProvider extends UtilizationProvider {
    public RAMUtilizationProvider(LineChart<String, Number> chart, String title, TimeProvider tp) {
        super(chart, title, tp);
    }

    @Override
    public double getData() {
        return memoryToGb(super.bean.getTotalPhysicalMemorySize() - super.bean.getFreePhysicalMemorySize());
    }

    @Override
    public double getUpperBound() {
        return memoryToGb(super.bean.getTotalPhysicalMemorySize());
    }

    public double memoryToGb(double memory) {
        return memory / Math.pow(1024, 3);
    }
}
