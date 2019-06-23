package com.personalloan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customerdetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)


private int customerId;
private String name;
private Long mobile;
private int age;
private String gender;
private String maritalStatus;
private Long creditScore;
/**
 * @return the customerId
 */
public int getCustomerId() {
	return customerId;
}
/**
 * @param customerId the customerId to set
 */
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the mobile
 */
public Long getMobile() {
	return mobile;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the maritalStatus
 */
public String getMaritalStatus() {
	return maritalStatus;
}
/**
 * @param maritalStatus the maritalStatus to set
 */
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
/**
 * @return the creditScore
 */
public Long getCreditScore() {
	return creditScore;
}
/**
 * @param creditScore the creditScore to set
 */
public void setCreditScore(Long creditScore) {
	this.creditScore = creditScore;
}
	
}
