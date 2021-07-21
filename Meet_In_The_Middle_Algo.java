package cp_algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//note
//meet in the middle algorithm says suppose there is a algorithm which is applied to the entire array and tc is O(x)
//the tc(x) can be reduced to tc(y) only when the same algorithm is applied to the left and right subarrays


public class Meet_In_The_Middle_Algo {
	
	

	private static ArrayList<Integer>  power_set(ArrayList<Integer> temp)
	{
		
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int p=(1>>temp.size());
		
		for(int i=0;i<p;i++)
		{
			int sum=0;
			for(int j=0;j<temp.size();j++)
			{
				if((i&(1>>j))==1)
				{
					sum+=temp.get(j);
				}
			}
			ans.add(sum);
		}
		return ans;
		
	}
	
	
	private static HashMap<Integer, Integer>  power_set_1(ArrayList<Integer> temp)
	{
		
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		hm.put(0, 1);
		
		int p=(1>>temp.size());
		
		for(int i=0;i<p;i++)
		{
			int sum=0;
			for(int j=0;j<temp.size();j++)
			{
				if((i&(1>>j))==1)
				{
					sum+=temp.get(j);
				}
			}
			
			if(hm.containsKey(sum)==true)
			{
				hm.put(sum,hm.get(sum)+1);
			}
			else
			{
				hm.put(sum,1);
			}
		}
		
		return hm;
		
	}
	

	
	
	private static void meet_in_the_middle(ArrayList<Integer> first, ArrayList<Integer> second, int sum)
	{
		
		HashMap<Integer, Integer> hm=power_set_1(second);
		ArrayList<Integer> ans=power_set(first);
		int count=0;
		for(int i=0;i<ans.size();i++)
		{
			int newsum=sum-ans.get(i);
			if(hm.containsKey(newsum)==true)
			{
				count+=hm.get(newsum);
				
			}
			else
			{
				

			}
			
		}
		
		System.out.println(""+count);
		
		
		
		
	}
	

	




	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int sum=scan.nextInt();
		ArrayList<Integer>first=new ArrayList<Integer>();
		ArrayList<Integer>second=new ArrayList<Integer>();
		int mid=size/2;
		int x=0;
		for(int i=0;i<size;i++)
		{
			x=scan.nextInt();
			if(i<mid)
			{
				first.add(x);
			}
			else
			{
				second.add(x);
				
			}
		}		
		meet_in_the_middle(first,second,sum);

	}






}
