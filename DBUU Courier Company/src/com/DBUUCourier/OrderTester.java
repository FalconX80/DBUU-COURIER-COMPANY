package com.DBUUCourier;

import java.text.ParseException;
import java.util.*;

public class OrderTester {
	private static Scanner scanner = new Scanner(System.in);

    public static void readOrderInfo(SterlingDAO sterlingDAO) {
        Order order = new Order();

        System.out.println("Courier Order Booking");
        System.out.println("-------------------------------------");

        System.out.print("Customer Id: ");
        order.setCustomerId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Date Of Order(DD-MMM-YYYY): ");
        try {
            order.setOrderDate(DateUtil.parseDate(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MMM-YYYY.");
            return;
        }

        System.out.print("Recipient Name: ");
        order.setRecipientName(scanner.nextLine());

        System.out.print("Recipient Address: ");
        order.setRecipientAddress(scanner.nextLine());

        System.out.print("Recipient City (D, P, B, C): ");
        order.setRecipientCity(scanner.nextLine().charAt(0));

        System.out.print("Courier Weight: ");
        order.setWeight(Double.parseDouble(scanner.nextLine()));

        System.out.print("Description: ");
        order.setDescription(scanner.nextLine());

        sterlingDAO.saveOrder(order);
    }
}