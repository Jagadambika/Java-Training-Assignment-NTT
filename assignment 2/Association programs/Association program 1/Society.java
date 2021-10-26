package com.Association;
import java.util.*;
//Aggregate class
public class Society {
	private String SocietyName;

	public void setSocietyName(String societyName) {
		SocietyName = societyName;
	}
  public void collegeSociety() {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter Society Name");
	  setSocietyName(in.nextLine());
	  System.out.println("student has joined "+SocietyName+" society in college");
	  
  }

}
