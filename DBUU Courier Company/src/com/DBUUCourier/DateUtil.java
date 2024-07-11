package com.DBUUCourier;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtil {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MMM-yyyy");

    public static String formatDate(Date date) {
        return DATE_FORMAT.format(date);
    }

    public static Date parseDate(String dateString) throws ParseException {
        return DATE_FORMAT.parse(dateString);
    }

    public static boolean isValidDateFormat(String dateString) {
        try {
            DATE_FORMAT.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
