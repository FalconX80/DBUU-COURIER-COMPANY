package com.DBUUCourier;

import java.util.Scanner;

public class DistributionTester {
	private static Scanner scanner = new Scanner(System.in);

    public static void readDistributionListInfo(SterlingDAO sterlingDAO) {
        System.out.println("Courier Dispatch Responsibility Generation");
        System.out.println("----------------------------------------------------");

        System.out.print("Date Of Distribution (DD-MMM-YYYY): ");
        String date = scanner.nextLine();

        if (DateUtil.isValidDateFormat(date)) {
            sterlingDAO.saveDistribution(date);
        } else {
            System.out.println("Invalid date format. Please use DD-MMM-YYYY.");
        }
    }
}