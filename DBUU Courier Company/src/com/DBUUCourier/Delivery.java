package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Delivery {
	private int employeeId;
    private int orderId;
    private Date deliveryDate;
    private char status;
    private String remarks;

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public Date getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(Date deliveryDate) { this.deliveryDate = deliveryDate; }
    public char getStatus() { return status; }
    public void setStatus(char status) { this.status = status; }
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    @Override
    public String toString() {
        return String.join(",", String.valueOf(employeeId), String.valueOf(orderId), DateUtil.formatDate(deliveryDate), 
                           String.valueOf(status), remarks);
    }

    public static Delivery fromString(String str) throws ParseException {
        String[] parts = str.split(",");
        Delivery delivery = new Delivery();
        delivery.setEmployeeId(Integer.parseInt(parts[0]));
        delivery.setOrderId(Integer.parseInt(parts[1]));
        delivery.setDeliveryDate(DateUtil.parseDate(parts[2]));
        delivery.setStatus(parts[3].charAt(0));
        delivery.setRemarks(parts[4]);
        return delivery;
    }
}
