package com.example.reports;

public class BIRTReportAdapter implements ReportProvider {
    private BIRTLibrary birtLibrary;

    public BIRTReportAdapter(BIRTLibrary birtLibrary) {
        this.birtLibrary = birtLibrary;
    }

    @Override
    public void printReport() {
        birtLibrary.generateReport();
    }

    @Override
    public void configureParams() {
        birtLibrary.setupParameters();
    }

    @Override
    public void configureOutput() {
        birtLibrary.setupOutputFormat();
    }
}
