package com.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Processor {

	private String[] dates = null;
	private DateTimeFormatter[] formatter = {
			new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd").parseStrict().toFormatter() };

	public Processor(String[] dates) {
		this.dates = dates;
	}

	public Long compute() {

		LocalDate fromDate = LocalDate.parse(dates[0], formatter[0]);
		LocalDate toDate = LocalDate.parse(dates[1], formatter[0]);

		Long days = null;
		if (fromDate.isBefore(toDate)) {
			days = ChronoUnit.DAYS.between(fromDate, toDate) - 1;
		} else {
			days = ChronoUnit.DAYS.between(toDate, fromDate) - 1;
		}

		return days;
	}
}
