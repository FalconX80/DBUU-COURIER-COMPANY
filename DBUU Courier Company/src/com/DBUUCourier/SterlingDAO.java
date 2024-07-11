package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SterlingDAO {
	private static final String CUSTOMER_FILE = "customers.txt";
    private static final String ORDER_FILE = "orders.txt";
    private static final String DELIVERY_FILE = "deliveries.txt";
    private static final String INVOICE_FILE = "invoices.txt";
    private static final String DISTRIBUTION_FILE = "distributions.txt";

    public int saveCustomer(Customer customer) {
        try (PrintWriter out = new PrintWriter(new FileWriter(CUSTOMER_FILE, true))) {
            out.println(customer.toString());
            System.out.println("Customer is saved.");
            return 1;
        } catch (IOException e) {
            System.out.println("Error saving customer: " + e.getMessage());
            return 0;
        }
    }

    public int saveOrder(Order order) {
        try (PrintWriter out = new PrintWriter(new FileWriter(ORDER_FILE, true))) {
            out.println(order.toString());
            System.out.println("Order is saved.");
            return 1;
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
            return 0;
        }
    }

    public int saveDistribution(String date) {
        try (PrintWriter out = new PrintWriter(new FileWriter(DISTRIBUTION_FILE, true))) {
            out.println(date);
            System.out.println("Distribution list is generated.");
            return 1;
        } catch (IOException e) {
            System.out.println("Error saving distribution: " + e.getMessage());
            return 0;
        }
    }

    public int saveDelivery(Delivery delivery) {
        try (PrintWriter out = new PrintWriter(new FileWriter(DELIVERY_FILE, true))) {
            out.println(delivery.toString());
            System.out.println("Delivery information is saved.");
            return 1;
        } catch (IOException e) {
            System.out.println("Error saving delivery: " + e.getMessage());
            return 0;
        }
    }

    public int saveInvoice(Invoice invoice) {
        try (PrintWriter out = new PrintWriter(new FileWriter(INVOICE_FILE, true))) {
            out.println(invoice.toString());
            System.out.println("Invoice is generated.");
            return 1;
        } catch (IOException e) {
            System.out.println("Error saving invoice: " + e.getMessage());
            return 0;
        }
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    customers.add(Customer.fromString(line));
                } catch (ParseException e) {
                    System.out.println("Error parsing customer data: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading customers: " + e.getMessage());
        }
        return customers;
    }
}
