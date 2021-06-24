package com.healthmanager.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.healthmanager.model.validator.DateOfBirthValidator;

@Constraint(validatedBy = DateOfBirthValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Dob {

	String message() default "Date of birth is invalid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	boolean doctor();
}
