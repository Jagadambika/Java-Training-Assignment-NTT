package Test;
import java.util.*;

public class EnjoyRide {
	public static int Adult_Fare,Child_Fare,Total_Amount;
	public static void FairPrices(String ride,int no_adults,int no_children)
	{
		if(no_adults!=0 || no_children!=0)
		{
	      if(ride.compareToIgnoreCase("Alibaba")==0)
	       {
		       Adult_Fare+=(no_adults)*50;
		       Child_Fare+=(no_children)*40;
		  
	       }
	      else if(ride.compareToIgnoreCase("Alipine slide")==0)
	      {
		       Adult_Fare+=(no_adults)*60;
		       Child_Fare+=(no_children)*30;
		  
	       }
	      else if(ride.compareToIgnoreCase("Bumpper Cars")==0)
	      {
		       Adult_Fare+=(no_adults)*45;
		       Child_Fare+=(no_children)*25;
		  
	       }
	      else if(ride.compareToIgnoreCase("Baloon Race")==0)
	      {
		       Adult_Fare+=(no_adults)*70;
		       Child_Fare+=(no_children)*60;
		  
	       }
	      else
	      {
	    	  System.out.println("There is no such ride please enter correctly");
	    	  System.out.println("Please start over");
	    	  System.exit(0);
	      }
	      
	    
		}
		else
		{
			System.out.println("Need to enter correct values");
			System.out.println("Please start over");
	    	  System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hrs=0,no_of_adults=0,no_of_children=0,adult_ride,children_ride;
		boolean flag=false;
		String type_of_ride=null;
		int i=0;
		Scanner in=new Scanner(System.in);
		  System.out.println("Welcome to our Fair");
		  do {
			System.out.println("The list of rides available and the prices per hour go as follows: \n Ride \t Adult Price \t child price\n Alibaba \t $50 \t $40  \n Alpine Slide \t $60 \t $30  \n Bumpper Cars \t $45 \t $25  \nBaloon Race \t $70 \t $60");
			try {
			
			System.out.println("Please Enter the ride you want to get on");
			type_of_ride=in.nextLine();
			in.nextLine();
			System.out.println("Please enter Number of Adults");
			no_of_adults=in.nextInt();
			System.out.println("Enter Number of children");
			no_of_children=in.nextInt();
			System.out.println("Enter Number of Hours");
			hrs=in.nextInt();
			in.nextLine();
			}catch(Exception e)
			{
				System.out.println("Enter Proper values");
				System.out.println("Begin from first, exiting");
				System.out.println(e);
				System.exit(0);
			}
			while(i<hrs)
			{
				
				FairPrices(type_of_ride,no_of_adults,no_of_children);
				i++;
			}
			System.out.println("Adult Fare Price "+Adult_Fare);
			System.out.println("Child Fare Price "+Child_Fare);
			System.out.println("Total no of hours for ride "+type_of_ride+"is "+hrs);
			Total_Amount=Adult_Fare+Child_Fare;
			System.out.println("Total Payable Amount Currently "+Total_Amount);
			System.out.println("Do you want to continue with more rides? \n If so enter yes");
			if(in.next().compareToIgnoreCase("yes")==0)
				flag=true;
			else
			{
				System.out.println("Please pay "+Total_Amount);
				System.out.println("Thank you");
			}
			in.nextLine();
			
		  }while(flag);
			
	}

}
