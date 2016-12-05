package com.collections.employeebean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
	public static void main(String[] args) throws ParseException {
		EmployeeDataManager employeeDataManager= new EmployeeDataManager();
		List<EmployeeBean> employeeList = new ArrayList<>();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyy");

		employeeDataManager.populateList();
		System.out.println("\nAfter populating: " + employeeDataManager.getEmployeeSet());

		employeeList = employeeDataManager.joinedBefore(simpleDateFormat.parse("23-OCT-2016"));
		System.out.println("\nBefore a date: " + employeeList);
		
		employeeList = employeeDataManager.joinedSixMonthsBefore();
		System.out.println("\nJoined 6 months before: " + employeeList);
		
		employeeList = new ArrayList<EmployeeBean>(employeeDataManager.getEmployeeSet());
		employeeDataManager.sortByJoining(employeeList);
		System.out.println("\nOrdering by Joining date: " + employeeList);

	}
}
