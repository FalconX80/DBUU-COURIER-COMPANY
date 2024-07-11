package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Invoice {
	private int customerId;
    private int invoiceMonth;
    private int invoiceYear;
    private String description;

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public int getInvoiceMonth() { return invoiceMonth; }
    public void setInvoiceMonth(int invoiceMonth) { this.invoiceMonth = invoiceMonth; }
    public int getInvoiceYear() { return invoiceYear; }
    public void setInvoiceYear(int invoiceYear) { this.invoiceYear = invoiceYear; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return String.join(",", String.valueOf(customerId), String.valueOf(invoiceMonth), 
                           String.valueOf(invoiceYear), description);
    }

    public static Invoice fromString(String str) {
        String[] parts = str.split(",");
        Invoice invoice = new Invoice();
        invoice.setCustomerId(Integer.parseInt(parts[0]));
        invoice.setInvoiceMonth(Integer.parseInt(parts[1]));
        invoice.setInvoiceYear(Integer.parseInt(parts[2]));
        invoice.setDescription(parts[3]);
        return invoice;
    }
}