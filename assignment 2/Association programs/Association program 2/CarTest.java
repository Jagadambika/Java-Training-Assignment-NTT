package com.Association;
import java.util.*;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Renault duster=new Renault();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter color and speed");
		duster.setColor(in.nextLine());
		duster.setSpeed(in.nextInt());
		duster.specifications();
		duster.RenaultEngine();
		duster.RenaultMusicPlayer();
		System.out.println("Visit Showroom for a Test Drive");
		
		Renault Triber=new Renault();
		System.out.println("Enter color and speed");
		Triber.setColor(in.nextLine());
		Triber.setSpeed(in.nextInt());
		Triber.specifications();
		Triber.RenaultEngine();
		Triber.RenaultMusicPlayer();
		System.out.println("Visit Showroom for a Test Drive");
		System.out.println("Thanks for your interest");
		
		

	}

}
