package com.DBUUCourier;
import java.text.ParseException;
import java.util.*;
import java.io.*;

public class CustomerTester {
	private static Scanner scanner = new Scanner(System.in);

    public static void readCustomerInfo(SterlingDAO sterlingDAO) {
        Customer customer = new Customer();

        System.out.println("Customer Registration");
        System.out.println("-------------------------------------");

        System.out.print("Customer Name: ");
        customer.setName(scanner.nextLine());

        System.out.print("Date Of Registration(DD-MMM-YYYY): ");
        try {
            customer.setDateOfRegistration(DateUtil.parseDate(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD-MMM-YYYY.");
            return;
        }

        System.out.print("Address: ");
        customer.setAddress(scanner.nextLine());

        System.out.print("City: ");
        customer.setCity(scanner.nextLine());

        System.out.print("Pin: ");
        customer.setPin(scanner.nextLine());

        System.out.print("Telephone Number: ");
        customer.setTelephoneNumber(scanner.nextLine());

        System.out.print("E-mail Id: ");
        customer.setEmailId(scanner.nextLine());

        sterlingDAO.saveCustomer(customer);
    }
}
