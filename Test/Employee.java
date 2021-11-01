package Test;
import java.util.*;

public class Employee {
	public static int emp_id;
	public static String emp_name;
	public static float basic_salary, special_allowances, hra,transport_allowance,tax = 2500;
	public static double net_salary;
	public Employee(int emp_id,String emp_name,float basic_salary,float special_allowances,float hra){
		emp_id=this.emp_id;
		emp_name=this.emp_name;
		basic_salary=this.basic_salary;
		special_allowances=this.special_allowances;
		hra=this.hra;
		}
	
	public static void CalculateNetSalary()
	{
		if(basic_salary<=10000)
		{
			hra=(20*basic_salary)/100;
			special_allowances=(80*basic_salary)/100;
		}
		else if(basic_salary>10000 && basic_salary<=20000)
		{
			hra=(25*basic_salary)/100;
			special_allowances=(90*basic_salary)/100;
		}
		else if(basic_salary>20000)
		{
			hra=(30*basic_salary)/100;
			special_allowances=(95*basic_salary)/100;
		}
		else
			System.out.println("Invalid values");
		
		net_salary=(basic_salary+hra+special_allowances+transport_allowance-tax);
		System.out.println("hra is "+hra);
		System.out.println("Special Allowances is "+special_allowances);
		System.out.println("Travel allowances is "+transport_allowance);
		System.out.println("tax is "+tax);
		System.out.println("The net Salary is "+net_salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter basic details of employee");
		try {
		System.out.println("Employee id - ");
        emp_id=in.nextInt();
        in.nextLine();
		System.out.println("Employee name - ");
        emp_name=in.nextLine();
        System.out.println("Basic Salary -");
        basic_salary=in.nextFloat();
        transport_allowance=(20*basic_salary)/100;
        }catch(Exception e)
		{
			System.out.println("Exception has occurred"+e);
		}
		Employee e=new Employee(emp_id,emp_name,basic_salary,special_allowances,hra);
		e.CalculateNetSalary();
        System.out.println("Thank you");
	}

}
