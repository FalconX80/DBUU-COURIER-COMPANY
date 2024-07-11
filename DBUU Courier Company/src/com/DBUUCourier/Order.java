package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Order {
	private int customerId;
    private Date orderDate;
    private String recipientName;
    private String recipientAddress;
    private char recipientCity;
    private double weight;
    private String description;

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public String getRecipientName() { return recipientName; }
    public void setRecipientName(String recipientName) { this.recipientName = recipientName; }
    public String getRecipientAddress() { return recipientAddress; }
    public void setRecipientAddress(String recipientAddress) { this.recipientAddress = recipientAddress; }
    public char getRecipientCity() { return recipientCity; }
    public void setRecipientCity(char recipientCity) { this.recipientCity = recipientCity; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return String.join(",", String.valueOf(customerId), DateUtil.formatDate(orderDate), recipientName, recipientAddress, 
                           String.valueOf(recipientCity), String.valueOf(weight), description);
    }

    public static Order fromString(String str) throws ParseException {
        String[] parts = str.split(",");
        Order order = new Order();
        order.setCustomerId(Integer.parseInt(parts[0]));
        order.setOrderDate(DateUtil.parseDate(parts[1]));
        order.setRecipientName(parts[2]);
        order.setRecipientAddress(parts[3]);
        order.setRecipientCity(parts[4].charAt(0));
        order.setWeight(Double.parseDouble(parts[5]));
        order.setDescription(parts[6]);
        return order;
    }
}
