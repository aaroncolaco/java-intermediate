package com.contacts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactDriver {

	public static void main(String[] args) {
		List<Contact> contactList = new ArrayList<Contact>();
		Contact contact = new Contact();
		char gender = 'M';
		
		for (int i = 0; i < 10; i++) {
			
			gender = Math.ceil(Math.random() * 3)  >= 2 ? 'M' : 'F'; 
			
			contact.setAddress("Address: " + i);
			contact.setAnniversary(new Date());
			contact.setArea("Area: " + i);
			contact.setCity("City: " + i);
			contact.setCountry("Country: " + i);
			contact.setDob(new Date());
			contact.setEmail("email" + i + "@google.com");
			contact.setfName("FirstName: " + i);
			contact.setlName("LastName: " + i);
			contact.setmName("MiddleName: " + i);
			contact.setGender(gender);
			contact.setMobile("7798629845");
			contact.setPincode("403986");
			contact.setState("Goa");
			contact.setTelephone("2897415");
			contact.setWebsite("website" + i + ".com");
			
			try {
				contact.validate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			contactList.add(contact);
		}
		System.out.println("Number of contacts : " + contactList.size());
	}
}
