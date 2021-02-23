package com.example.demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy= {NameValidation.class})
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface Validation {
	String message() default "すでに登録済みの名前です";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	@Target(ElementType.FIELD)
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	public @interface List{
		Validation[] value();
	}

}
