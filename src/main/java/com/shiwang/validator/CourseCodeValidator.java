package com.shiwang.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {

	public String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String userCourseCode, ConstraintValidatorContext arg1) {

		boolean status;

		if (userCourseCode != null) {
			status = userCourseCode.startsWith(coursePrefix);
		} else {
			return true;
		}
		return status;
	}

}