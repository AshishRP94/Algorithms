package cp_algorithms;

import java.util.Scanner;

public class more_vote_algorithm {
	/*
	1:this algorithm is used to find element which is appearing the maximum number of times in the array
	2:this algo is based on the principle of voting 
	3:if the current candiate and arr[i] are equal we will in in the count by 1
	otherwise will dec the count by 1
	4:if the count becomes 0 it means the current cand is changed and the new cand is arr[i]
	5:time complexity O(N)
	*/
	private static void morevote(int[] majorityelement)
	{
		int count=0;
		int candiate=0;
		for(int i=0;i<majorityelement.length;i++)
		{
			if(count==0)
			{
				candiate=majorityelement[i];
			}
			
			if(candiate==majorityelement[i])
			{
				count+=1;
				
			}
			else
			{
				count-=1;
				
			}
			
		}
		
		System.out.println(" "+candiate);
		
	
	
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []majorityelement=new int[n];
			for(int j=0;j<majorityelement.length;j++)
			{
				majorityelement[j]=scan.nextInt();
			}
			morevote(majorityelement);
		
		}
		
		
	}



}
