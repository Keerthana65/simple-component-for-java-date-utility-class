package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.utils.DateUtils;

@SpringBootApplication
public class SpringBootJavaDateUtilClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavaDateUtilClassApplication.class, args);
		/*
		 * Description : Import the java date util package library and used the method in that package.
		 * Author : Keerthana
		 * Date : 10-01-2023
		 */
		Date date = new Date();
		System.out.println("Date Format with MM/dd/yyyy :" + DateUtils.formatDate(date, "MM/dd/yyyy"));
		System.out.println("Date Format with dd-M-yyyy hh:mm:ss :" + DateUtils.formatDate(date, "dd-M-yyyy hh:mm:ss"));
		System.out.println("Date Format with dd-M-yyyy hh:mm:ss :"
				+ DateUtils.parseDate("Thu, Dec 31 1998 23:37:50", "E, MMM dd yyyy HH:mm:ss"));
	}

}
