package com.DBUUCourier;
import java.text.ParseException;
import java.util.*;

public class DeliveryTester {
	private static Scanner scanner = new Scanner(System.in);

    public static void readDeliveryInfo(SterlingDAO sterlingDAO) {
        Delivery delivery = new Delivery();

        System.out.println("Courier Delivery");
        System.out.println("-------------------------------------");

        System.out.print("Employee Id: ");
        delivery.setEmployeeId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Assigned Courier's : 2001, 2002, 2003");

        System.out.print("Order Id: ");
        delivery.setOrderId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Date Of Delivery(DD-MMM-YYYY): ");
        try {
            delivery.setDeliveryDate(DateUtil.parseDate(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MMM-YYYY.");
            return;
        }

        System.out.print("Status (P, R, D): ");
        delivery.setStatus(scanner.nextLine().charAt(0));

        System.out.print("Remarks: ");
        delivery.setRemarks(scanner.nextLine());

        sterlingDAO.saveDelivery(delivery);
    }
}
