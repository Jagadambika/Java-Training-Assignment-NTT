package com.Association;
import java.util.*;

public class CarEngine {

	private String engineNo;
	
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void EngineStarts() {
		System.out.println("The engine is running");
	}
	public void EngineChasisNo() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter chasis no");
		setEngineNo(in.next());
		System.out.println("Engine number is"+engineNo);
	}
}
