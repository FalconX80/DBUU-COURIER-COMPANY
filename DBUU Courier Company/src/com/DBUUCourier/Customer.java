package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Customer {
	private String name;
    private Date dateOfRegistration;
    private String address;
    private String city;
    private String pin;
    private String telephoneNumber;
    private String emailId;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Date getDateOfRegistration() { return dateOfRegistration; }
    public void setDateOfRegistration(Date dateOfRegistration) { this.dateOfRegistration = dateOfRegistration; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }
    public String getTelephoneNumber() { return telephoneNumber; }
    public void setTelephoneNumber(String telephoneNumber) { this.telephoneNumber = telephoneNumber; }
    public String getEmailId() { return emailId; }
    public void setEmailId(String emailId) { this.emailId = emailId; }

    @Override
    public String toString() {
        return String.join(",", name, DateUtil.formatDate(dateOfRegistration), address, city, pin, telephoneNumber, emailId);
    }

    public static Customer fromString(String str) throws ParseException {
        String[] parts = str.split(",");
        Customer customer = new Customer();
        customer.setName(parts[0]);
        customer.setDateOfRegistration(DateUtil.parseDate(parts[1]));
        customer.setAddress(parts[2]);
        customer.setCity(parts[3]);
        customer.setPin(parts[4]);
        customer.setTelephoneNumber(parts[5]);
        customer.setEmailId(parts[6]);
        return customer;
    }
}