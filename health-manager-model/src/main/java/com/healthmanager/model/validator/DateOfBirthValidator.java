package com.healthmanager.model.validator;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.healthmanager.model.annotation.Dob;
import com.healthmanager.model.utils.DateUtils;

public class DateOfBirthValidator implements ConstraintValidator<Dob, Date> {

	private boolean doctor;

	@Override
	public void initialize(Dob dob) {
		doctor = dob.doctor();
	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		return Optional.ofNullable(value).map(new Function<Date, Boolean>() {
			@Override
			public Boolean apply(Date dob) {
				return isAgeValid(dob);
			}
		}).get();
	}

	private boolean isAgeValid(Date dob) {
		return !isDobFuture(dob) && (doctor ? isAgeGreaterThan21(dob) : true);
	}

	private boolean isDobFuture(Date dob) {
		return dob.after(new Date());

	}

	private boolean isAgeGreaterThan21(Date dob) {
		return DateUtils.getAge(dob) > 21;
	}
}
