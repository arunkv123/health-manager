package com.healthmanager.model.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

	public static int getAge(Date dob) {

		LocalDate dobLocal = (null == dob) ? LocalDate.now()
				: dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return Period.between(dobLocal, LocalDate.now()).getYears();
	}

	public static int getAge(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears();
	}
}
