package com.example.reports;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select:\n1 - JasperReport \n2 - BIRTReport)\nEnter:");
        int choice = scanner.nextInt();

        ReportProvider reportProvider;

        if (choice == 1) {
            reportProvider = new CustomReportProviderImpl();
        } else if (choice == 2) {
            reportProvider = new BIRTReportAdapter(new BIRTLibrary());
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        reportProvider.configureParams();
        reportProvider.configureOutput();
        reportProvider.printReport();
    }
}
