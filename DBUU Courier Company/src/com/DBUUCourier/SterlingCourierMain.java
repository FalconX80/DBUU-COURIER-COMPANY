package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SterlingCourierMain {
	private static Scanner scanner = new Scanner(System.in);
    private static SterlingDAO sterlingDAO = new SterlingDAO();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getChoice();
            processChoice(choice);
        }
    }

    private static void displayMenu() {
        System.out.println("=======================================");
        System.out.println("DBUU Courier Company");
        System.out.println("=======================================");
        System.out.println("1. Customer Registration");
        System.out.println("2. Courier Order Booking");
        System.out.println("3. Courier Dispatch Responsibility Generation");
        System.out.println("4. Courier Delivery");
        System.out.println("5. Invoice Generation");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void processChoice(int choice) {
        switch (choice) {
            case 1:
                CustomerTester.readCustomerInfo(sterlingDAO);
                break;
            case 2:
                OrderTester.readOrderInfo(sterlingDAO);
                break;
            case 3:
                DistributionTester.readDistributionListInfo(sterlingDAO);
                break;
            case 4:
                DeliveryTester.readDeliveryInfo(sterlingDAO);
                break;
            case 5:
                InvoiceTester.readInvoiceInfo(sterlingDAO);
                break;
            case 6:
                System.out.println("Thank you for using DBUU Courier Company. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
