package com.challenge;

import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

import com.challenge.util.Utils;


public class DateCalculatorExecutor {

	public void run(String dateRange) {
		try {
			String[] dates = Utils.dateSplitter(dateRange);
			Arrays.stream(dates).forEach((date) -> {
				try {
					Utils.validation(date);
				} catch (DateTimeParseException e) {
					System.out.print(e.getMessage());
				}
			});

			Processor process = new Processor(dates);

			System.out.println("Total number of days are: " + process.compute());
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Please supply from date in formatt(yyyy-MM-dd)");
		String dateFrom = inputScanner.next();

		System.out.println("Please supply to date in formatt(yyyy-MM-dd)");
		String dateTo = inputScanner.next();

		DateCalculatorExecutor execute = new DateCalculatorExecutor();
		execute.run(dateFrom + " - " + dateTo);
	}

}
