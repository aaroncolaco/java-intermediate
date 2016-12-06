package com.contacts;

import java.util.Date;
import java.util.Stack;

public class ContactStack {
	private Stack<Contact> contactStack;
	private int stackSize = 2;

	public ContactStack() {
		contactStack = new Stack<>();
	}

	public Stack<Contact> pushContact(Contact contact) throws Exception {

		if (contactStack.size() >= stackSize) {
			throw new Exception("Stack Full");
		}

		this.contactStack.add(contact);
		return this.contactStack;
	}

	public Contact popContact() throws Exception {
		if (contactStack.size() == 0 ) {
			throw new Exception("Stack empty");
		}
		return this.contactStack.pop();
	}

	public static void main(String[] args) throws Exception {
		
		ContactStack contactStack = new ContactStack();

		Contact contact;

		for (int i = 0; i < 2; i++) {
			contact = new Contact();

			char gender = Math.ceil(Math.random() * 3) >= 2 ? 'M' : 'F';

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

			contactStack.pushContact(contact);
		}
		
		System.out.println("After adding: " + contactStack.getContactStack());
		
		for (int i = 0; i < 10; i++) {
			contact = new Contact();
			
			contact = contactStack.popContact();
			
			System.out.println(contact);
		}

	}

	public Stack<Contact> getContactStack() {
		return contactStack;
	}
}
