package com.xmlconfig.beans;

public class Address {
	private int add_id;
	private String full_add;
	private String plotNo;
	private int pincode;
	private String city;
	private String state;

	
	@Override
	public String toString() {
		return "\nPlot No - " + plotNo + ", \n" + full_add + " " + city + ", \n" + state + " pincode - " + pincode;
	}

	public Address(int add_id, String full_add, String plotNo, int pincode, String city, String state) {
		super();
		this.add_id = add_id;
		this.full_add = full_add;
		this.plotNo = plotNo;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}

	
	
//	public String getFull_add() {
//		return full_add;
//	}
//
//	public void setFull_add(String full_add) {
//		this.full_add = full_add;
//	}
//
//	public int getAdd_id() {
//		return add_id;
//	}
//
//	public void setAdd_id(int add_id) {
//		this.add_id = add_id;
//	}
//
//	public String getPlotNo() {
//		return plotNo;
//	}
//
//	public void setPlotNo(String plotNo) {
//		this.plotNo = plotNo;
//	}
//
//	public int getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}

}
