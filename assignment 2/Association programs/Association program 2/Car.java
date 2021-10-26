package com.Association;

public class Car {
	private String color;
	private int speed;
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
   public void specifications()
   {
	   System.out.println("The car speed is "+speed+" and the colour is "+color);
   }
}
