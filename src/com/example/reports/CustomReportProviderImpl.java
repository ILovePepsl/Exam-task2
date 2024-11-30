package com.example.reports;

public class CustomReportProviderImpl implements ReportProvider {
    @Override
    public void printReport() {
        System.out.println("Printing report using JasperReport...");
    }

    @Override
    public void configureParams() {
        System.out.println("Configuring parameters for JasperReport...");
    }

    @Override
    public void configureOutput() {
        System.out.println("Configuring output for JasperReport...");
    }
}
