package com.java.utils;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);
    System.out.println("Date Format with MM/dd/yyyy :" + DateUtils.formatDate(date, "MM/dd/yyyy"));
    System.out.println(
        "Date Format with dd-M-yyyy hh:mm:ss :" + DateUtils.formatDate(date, "dd-M-yyyy hh:mm:ss"));
    System.out.println("Date Format with dd-M-yyyy hh:mm:ss :"
        + DateUtils.parseDate("Thu, Dec 31 1998 23:37:50", "E, MMM dd yyyy HH:mm:ss"));
  }
}
