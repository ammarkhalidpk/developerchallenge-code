package com.challenge.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class Utils {
	public static void validation(String dateToValidate) throws DateTimeParseException {

		DateTimeFormatter[] formatter = {
				new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd").parseStrict().toFormatter() };

		Arrays.stream(formatter).forEach((format) -> {
			try {
				LocalDate.parse(dateToValidate, format);
			} catch (DateTimeParseException ex) {
				throw new DateTimeParseException("Date input is not valid: " + ex.getMessage(), dateToValidate, 0);
			}
		});
	}

	public static String[] dateSplitter(String dateRange) throws Exception {
		if (dateRange.isEmpty() || dateRange == null) {
			throw new Exception("No input provided");
		}
		return dateRange.split(" - ");
	}
}
