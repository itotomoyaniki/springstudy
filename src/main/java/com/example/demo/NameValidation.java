package com.example.demo;

import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

public class NameValidation implements ConstraintValidator<Validation, String>{

	@Autowired
	HomePageRepository homepageRepo;
	
	public void initialize(Validation constraintAnnotation) {
		
	}
	public boolean isValid(String name, ConstraintValidatorContext context) {
		
		if(homepageRepo==null) {
			System.out.println("nullです");
		}
		else {
			System.out.println("elseです");
		}
//		Optional<HomePageData> homepagedata=homepageRepo.findByName(name);
//		
//		System.out.println(homepagedata);
//		if(homepagedata==null) {
//			System.out.println(true);
//			return true;
//		}
//		System.out.println(false);
		return true;
	}
	
}
