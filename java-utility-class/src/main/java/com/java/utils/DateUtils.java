package com.java.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * Description : Customize the Date and Time using Java Utils class
 *  Author : Keerthana 
 *  Date : 2023-01-09
 */

public class DateUtils {
  private String date;
  private String dateFormat;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public DateUtils(String date, String dateFormat) {
    super();
    this.date = date;
    this.dateFormat = dateFormat;
  }

  public static String formatDate(Date date, String dateFormat) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
    String result = null;
    result = simpleDateFormat.format(date);
    return result;
  }

  public static Date parseDate(String date, String dateFormat) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
    Date result = null;
    try {
      result = simpleDateFormat.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return result;
  }
}
