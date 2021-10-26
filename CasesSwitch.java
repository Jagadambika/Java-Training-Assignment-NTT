package Training;
import java.util.*;

public class CasesSwitch {
	
	public static void  evenodd(int n)
	{
		 if(n%2==0)
  	        System.out.println("even");
         else 
  	      System.out.println("odd");
	}
	public static void posornot(int g)
	{
		    if(g>0)
       	       System.out.println("Positive");
             else if(g<0)
       	       System.out.println("Negative");
             else
       	        System.out.println("Zero");
	}
	public static void primeornot(int f)
	{
		int prime=1;
        for(int i=2;i<f;i++)
        { 
        	if(f%i==0)
 		     prime=0;
           }
        if(prime==1)
 	       System.out.println("Prime");
          else
 	        System.out.println("Not prime");
	}
	public static int add(int a,int b)
	{
		return (a+b);
	}
	
   public static void main(String[] args)
    {
	 int choice=0;
	 Scanner input=new Scanner(System.in);
	 do {
		 System.out.println("-----MENU--------");
		 System.out.println("1. To add two numbers");
		 System.out.println("2. average of two numbers");
		 System.out.println("3. Check if number is even or odd");
		 System.out.println("4. check if number is positive or negative");
		 System.out.println("5. check prime or not");
		 System.out.println("6. To exit");
		 System.out.println("enter choice");
		 choice=input.nextInt();
		 if(choice>=1&&choice<=6) {
			 switch(choice) {
			 case 1:System.out.println("enter two nos to find sum");
			        int a=input.nextInt();
			        int b=input.nextInt();
			        int res=add(a,b);
			        System.out.println(res);
			        break;
			 case 2:System.out.println("enter two nos to find average");
		          int c=input.nextInt();
		           int d=input.nextInt();
		           int res1=add(c,d);
		           System.out.println(res1/2);
		            break;
			 case 3:System.out.println("enter no to check if  even or odd");
	                int e=input.nextInt();
	                 evenodd(e);
	                 break;
			 case 4:System.out.println("enter no to check if positive or not");
	                int g=input.nextInt();
	                posornot(g);
	               break;
			 case 5:System.out.println("enter no to check if prime or not");
	               int f=input.nextInt();
	                primeornot(f);
			        break;
			 case 6:System.out.println("exiting");
			         System.exit(0);
			         break;
		 }
		 }
	 
    }while(true);
}
}
