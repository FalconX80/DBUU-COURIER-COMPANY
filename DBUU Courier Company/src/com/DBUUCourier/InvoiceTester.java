package com.DBUUCourier;

import java.util.Scanner;

public class InvoiceTester {
	private static Scanner scanner = new Scanner(System.in);

    public static void readInvoiceInfo(SterlingDAO sterlingDAO) {
        Invoice invoice = new Invoice();

        System.out.println("Invoice Generation");
        System.out.println("-------------------------------------");

        System.out.print("Customer Id: ");
        invoice.setCustomerId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Invoice Month: ");
        invoice.setInvoiceMonth(Integer.parseInt(scanner.nextLine()));

        System.out.print("Invoice Year: ");
        invoice.setInvoiceYear(Integer.parseInt(scanner.nextLine()));

        System.out.print("Description: ");
        invoice.setDescription(scanner.nextLine());

        sterlingDAO.saveInvoice(invoice);
    }
}
