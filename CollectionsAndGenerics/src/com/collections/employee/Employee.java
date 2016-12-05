package com.collections.employee;

import java.util.ArrayList;
import java.util.List;


public class Employee {
	private int id;
	private String name;
	private List<String> vehicle;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.vehicle = new ArrayList<>();
	}

	public List getVehicles() {
		return vehicle;
	}

	public void addVehicle(String vehicle) {
		this.vehicle.add(vehicle);
	}
	
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "John Doe");
		emp1.addVehicle("Car");
		System.out.println(emp1.getVehicles());
		
		emp1.addVehicle("Bike");
		System.out.println(emp1.getVehicles());
		
		emp1.addVehicle("Cycle");
		System.out.println(emp1.getVehicles());
	}
}
