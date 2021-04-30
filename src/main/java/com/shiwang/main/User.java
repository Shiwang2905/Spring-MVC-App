package com.shiwang.main;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.*;

import com.shiwang.validator.CourseCode;

public class User {

    @Pattern(regexp="^[a-zA-Z]*$", message="Only alphabets")
	@NotNull(message = "atleast one character")
	@Size(min = 1, message = "atleast one character")
	private String firstName;

    @Pattern(regexp="^[a-zA-Z]*$", message="Only alphabets")
	private String lastName;

	@NotNull(message = "Must contain @ character")
	@Size(min = 1, message = "Must contain @ character")
	private String email;

	@NotNull(message = "Please select country from dropdown list")
	private String country;

	@NotNull(message = "choose one language")
	private String preferredLanguage;

	@NotNull(message = "choose one Operating System")
	private String operatingSystem;
	
	@CourseCode(value="SK", message="Must start with SK")
	private String customCourseCode;
	

	public String getCustomCourseCode() {
		return customCourseCode;
	}

	public void setCustomCourseCode(String customCourseCode) {
		this.customCourseCode = customCourseCode;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	private Map<String, String> countryMap;

	public User() {
		countryMap = new HashMap<>();
		countryMap.put("IND", "India");
		countryMap.put("BR", "Brazil");
		countryMap.put("US", "United-States");
		countryMap.put("UK", "United-Kingdom");
		countryMap.put("DE", "Germany");

	}

	public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
