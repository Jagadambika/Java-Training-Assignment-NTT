package com.Association;

public class UndergradStudent extends Student {

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void Details()
	{
		String name=getName();
		int rollno=getRollno();
		String city=getCity();
		year=getYear();
		System.out.println("The details are \n Name:"+name+"\n roll no:"+rollno+"\n City :"+city+"\n year :"+year);
	}
}
