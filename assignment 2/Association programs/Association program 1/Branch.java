package com.Association;
import java.util.*;
//Composition class
public class Branch {
	
 private String branch;
 Branch()
 {
	 branch="Not defined yet";
 }
 

public void setBranch(String branch) {
	this.branch = branch;
}
public void studiesBranch()
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter branch of student");
	setBranch(in.next());
	System.out.println("student has taken admission in "+branch+" branch");
}
}
