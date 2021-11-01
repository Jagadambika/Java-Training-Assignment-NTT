package Test;
import java.util.Scanner;
import java.util.Arrays;

public class Flower_Demo {


		     static void displayFlowers(int choose) 
		     { 
		       
		     
		       
		       switch (choose) {
		       case '1':
		       	 System.out.println("Continent Name : ASIA");
		    		 System.out.println("   Country Name - "+ " National Flower");
		    		 System.out.println("   INDIA  -"+ "   LOTUS");
		    		 System.out.println("   PAKISTAN - "+ " JASMINE");
		    		 System.out.println("   NEPAL - "+ " LALI GURAS");
		    		 System.out.println("_____________\n");
		           break;

		       case '2':
		       	System.out.println("Continent Name : EUROPE");
		      	 
		       	 System.out.println("   Country Name -"+ "      National Flower");
		   		 System.out.println("   GERMANY - "+ " CORN FLOWER");
		   		 System.out.println("   FRANCE  -"+ "  LILY");
		   		 System.out.println("   GREECE -"+ "  ACANTHUS MOLLIS");
		   		System.out.println("_____________\n");
		           break;

		       case '3':
		       	
		       	System.out.println("Continent Name : AFRICA");
		   		 System.out.println("   Country Name -  "+ "   National Flower");
		   		 System.out.println("   EGYPT  -"+ "  BLUE LOTUS");
		   		 System.out.println("   NIGERIA -"+ "  YELLOW TRUMPET");
		   		 System.out.println("   KENYA -"+ "     ORCHID");
		   		 System.out.println("_____________\n");
		           break;


		       case '4':
		    	   System.out.println("Thank you,Visit Again");
		           System.out.println("Exit  \n");
		           System.exit(0);
		           break;

		       default:
		           System.out.println("Choose appropriate values for continentName To be Displayed!");
		           break;
		   }
		     }
		public static void main(String[] args) 
		{ 
			char choose;boolean flag=false;
			char loop;
			Scanner input = new Scanner(System.in);
			do {
		    System.out.println("Choose a continentName To be Displayed: \n 1.) ASIA  \n 2.) EUROPE \n 3.) AFRICA \n 4.) Exit\n");
		    System.out.println("Enter a particular number associated with the continent to view its respective countries and flowers   \n");
		    
		    choose = input.next().charAt(0);
			 Flower_Demo fd = new Flower_Demo(); 
		     Flower_Demo.displayFlowers(choose); 
		     System.out.println("If you want to continue viewing enter yes");
		     loop = input.next().charAt(0);
		     if(Character.compare('y',Character.toLowerCase(loop))==0)
		    	 flag=true;
		     else
		    	 {
		    	 flag=false;
		    	 System.out.println("Thank for Viewing");
		    	 }
		     
		   

			} while (flag);
			
			
		    
		 

	

}
}