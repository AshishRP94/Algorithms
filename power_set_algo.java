package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

//imp algo
//this algo is mostly used when we want to try all solutions and form all solutions one or more solution satisfy constraints given in the problem 


public class power_set_algo
{
	
	private static void combinations(int[] arr)
	{
		ArrayList<ArrayList<Integer>>combination=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<(1<<arr.length);i++)
		{
			ArrayList<Integer>ans=new ArrayList<Integer>();
			for(int j=0;j<arr.length;j++)
			{
				if((i&(1<<j))==1)
				{
					ans.add(arr[j]);
				}
				
			}
			combination.add(ans);
			
		}
		for(int i=0;i<combination.size();i++)
		{
			ArrayList<Integer>temp=combination.get(i);
			for(int j=0;j<temp.size();j++)
			{
				System.out.print(" "+temp.get(j));
			}
			System.out.println();
			
			
			
		}
		
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		combinations(arr);
		
	}



}
