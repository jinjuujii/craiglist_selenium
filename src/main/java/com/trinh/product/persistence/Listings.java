package com.trinh.product.persistence;

public class Listings {

	String description;
	String address;
	String URL;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	@Override
	public String toString() {
		return "Listings [description=" + description + ", address=" + address + ", URL=" + URL + "]";
	}

}
