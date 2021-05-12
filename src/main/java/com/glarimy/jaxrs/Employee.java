package com.glarimy.jaxrs;

public class Employee {
	private int eid;
	private String name;
	private long phone;

	public Employee() {

	}

	public Employee(int eid, String name, long phone) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
