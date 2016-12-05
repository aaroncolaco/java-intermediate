package com.collections.employeebean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDataManager {

	private Set<EmployeeBean> employeeSet = new TreeSet<>();

	// anonymous inner type comparator
	public void sortByJoining(List<EmployeeBean> employeeList) {
		
		Comparator<EmployeeBean> comparator = new Comparator<EmployeeBean>() {

			@Override
			public int compare(EmployeeBean emp1, EmployeeBean emp2) {
				return emp1.getDateOfJoining().compareTo(emp2.getDateOfJoining());
			}
		};
		Collections.sort(employeeList, comparator);
	}
	
	
	

	public void populateList() {
		EmployeeBean employee;

		employee = new EmployeeBean(5, "John", "07-JUN-2013");
		employeeSet.add(employee);

		employee = new EmployeeBean(2, "Aaron", "23-NOV-2016");
		employeeSet.add(employee);

		employee = new EmployeeBean(9, "Jane", "03-JUL-2016");
		employeeSet.add(employee);
	}
	
	
	

	public List<EmployeeBean> joinedBefore(Date date) {
		List<EmployeeBean> employeeList = new ArrayList<>();

		for (EmployeeBean employee : employeeSet) {
			if (employee.getDateOfJoining().before(date)) {
				employeeList.add(employee);
			}
		}
		return employeeList;
	}
	
	/*
	 * if join is after now, skip element
	 * 
	 * if difference in years >= 1, add to List
	 * else:
	 * 	if difference in months >= 6, add to List
	 * 	else if difference in months == 5, check if day of joining month is before current day. 
	 * 		if it is, add. eg --> 20 JUN - 21 Nov is 6 months
	 * 	else: 
	 * 	  skip element
	 */

	public List<EmployeeBean> joinedSixMonthsBefore() {
		List<EmployeeBean> employeeList = new ArrayList<>();

		Calendar now = Calendar.getInstance();
		Calendar join = Calendar.getInstance();

		for (EmployeeBean employee : employeeSet) {

			join.setTime(employee.getDateOfJoining());

			if (join.after(now)) {
				continue;
			}

			int joinYear = join.get(Calendar.YEAR), nowYear = now.get(Calendar.YEAR);
			int yearDifference = nowYear - joinYear;
			
			
			if (yearDifference >= 1) {
				employeeList.add(employee);
			} else {
				int joinMonth = join.get(Calendar.MONTH), nowMonth = now.get(Calendar.MONTH);
				int monthDifference = nowMonth - joinMonth;

				if (monthDifference >= 6) {
					employeeList.add(employee);
				} else if (monthDifference == 5) {
					int joinDay = join.get(Calendar.DAY_OF_MONTH), nowDay = now.get(Calendar.DAY_OF_MONTH);
					
					if (joinDay <= nowDay) {
						employeeList.add(employee);
					}
					
				} else {
					continue;
				}
			}
		}
		return employeeList;
	}

	
	public Set<EmployeeBean> getEmployeeSet() {
		return employeeSet;
	}
}
