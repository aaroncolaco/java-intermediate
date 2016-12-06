package com.contacts;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
	private String fName, mName, lName;
	private Date dob, anniversary;
	private char gender;
	private String address, area, city, pincode, state, country;
	private String telephone, mobile, email, website;
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	Matcher matcher = null;
	
	public void validate() throws Exception {
		if (this.fName == null || this.lName == null || this.dob == null || this.email == null) {
			throw new Exception("One of the fields is null");
		} else if (this.fName.isEmpty() || this.lName.isEmpty() || this.email.isEmpty()) {
			throw new Exception("One of the fields is empty");
		}
		matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(this.email);
		if (!matcher.matches()) {
			throw new Exception("Email pattern does not match. Patterm : userId@domainName");
		}
		
		if (telephone == null && mobile == null) {
			throw new Exception("Either Telephone or Mobile must be specified");
		} else if (telephone == null && mobile.isEmpty()) {
			throw new Exception("Either Telephone or Mobile must be specified");
		} else if (telephone.isEmpty() && mobile == null ) {
			throw new Exception("Either Telephone or Mobile must be specified");
		} else if (telephone.isEmpty() && mobile.isEmpty()) {
			throw new Exception("Either Telephone or Mobile must be specified");
		}
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getAnniversary() {
		return anniversary;
	}
	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", mName=" + mName + ", lName="
				+ lName + ", dob=" + dob + ", anniversary=" + anniversary
				+ ", gender=" + gender + ", address=" + address + ", area="
				+ area + ", city=" + city + ", pincode=" + pincode + ", state="
				+ state + ", country=" + country + ", telephone=" + telephone
				+ ", mobile=" + mobile + ", email=" + email + ", website="
				+ website + "]";
	}
}
