package com.Association;

public class Student {
	private String name;
	private int rollno;
	private String city;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  void Branch()
	{
		Branch b=new Branch();
		b.studiesBranch();
		
	}
	public void Society()
	{
		Society s=new Society(); 
		s.collegeSociety();
	}
}
