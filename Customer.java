package com.citi.insurance.customerapi.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="Global_Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_Id")
	private int customerId;
	@Column(name="Name",nullable = false,length = 50)
	private String name;
	@Column(name="Email",nullable = false,length = 150)
	private String email;
	@Column(name="PhoneNo")
	private long phoneNo;
	@Column(name="DOB")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dob;

}
