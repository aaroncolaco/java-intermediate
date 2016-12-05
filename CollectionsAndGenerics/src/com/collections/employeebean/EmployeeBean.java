package com.collections.employeebean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeBean implements Comparable<EmployeeBean> {
	private int id;
	private String name;
	private Date dateOfJoining;

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyy");

	public EmployeeBean() {
	}

	public EmployeeBean(int id, String name, String dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		try {
			this.dateOfJoining = simpleDateFormat.parse(dateOfJoining);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		try {
			this.dateOfJoining = simpleDateFormat.parse(dateOfJoining);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoining="
				+ dateOfJoining + "]";
	}

	@Override
	public int compareTo(EmployeeBean employee2) {
		return this.getId() - employee2.getId();
	}
	
}
