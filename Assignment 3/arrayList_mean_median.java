package TrainingDay5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class arrayList_mean_median {
	
	public static  int sum(ArrayList<Integer> num)
	{
		int sum=0;
	
		for(int j:num)//for each i in j
		{
			sum+=j;
	}
		return sum;
}
	
	public static float mean(ArrayList<Integer> num)
	{
		return ((float)(sum(num))/(num.size()));
	}
	
	public static float median(ArrayList<Integer> num)
	{
		Collections.sort(num);
		System.out.println("Sorted list for Median"+num);
		int odd=(int)((num.size()/2)+0.5);
		
		if((num.size()%2)!=0)
			return num.get(odd);
		else
		{
			System.out.println(num.get((num.size())/2)-1);
			System.out.println(num.get((num.size()/2)));
			return ((float)((num.get((num.size())/2)-1)+(num.get((num.size()/2))))/2);
		}
		
	}
	public static void mode(ArrayList<Integer> num)
	{
		int mode=0;
		int maxValue = 0, maxCount = 0, i, j,flag=0;

	      for (i = 0; i < num.size(); ++i) {
	         int count = 0;
	         for (j = 0; j < num.size(); ++j) {
	            if (num.get(j) == num.get(i))
	            {
	            ++count;
	            
	         }

	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = num.get(i);
	            if(maxCount>=2)
	            flag=1;
	         }
	      }
	      }
	    if(flag==1)
	    {
	    mode=maxValue;
		 System.out.println("The mode is "+mode);
	    }
	    else
	    {
	    	System.out.println("There is no max frequency");
	    	for( j=0;j<num.size();j++)
	    	System.out.println(num.get(j));
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the list");
		int n=in.nextInt();
		ArrayList<Integer> num=new ArrayList(n);
		System.out.println("Enter elements of list");
		for(int j=0;j<n;j++)
			num.add(in.nextInt());
		System.out.println(num);
		int sum=0;
		sum=sum(num);
		float median=0f,mean=0f;
		mean=mean(num);
		median=median(num);
		System.out.println("The sum is "+sum);
		System.out.println("The mean is "+mean);
		System.out.println("The median is "+median);
		mode(num);

	}

}
