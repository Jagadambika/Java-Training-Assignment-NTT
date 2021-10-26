package com.Association;

import java.util.Scanner;

public class mainStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		UndergradStudent uni=new UndergradStudent();
		System.out.println("Enter Name,Roll no,City,Current year");
		uni.setName(in.nextLine());
		uni.setRollno(in.nextInt());
		in.nextLine();
		uni.setCity(in.nextLine());
		uni.setYear(in.nextInt());
		uni.Details();
        uni.Branch();
        uni.Society();
        System.out.println("Thank you");

	}
	

}
 class san {
	public void hara()
	{
		
	}
}