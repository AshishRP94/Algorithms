package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class possible_ways_a_number_can_be_formed
{
	
	private static void possible_ways(int n, ArrayList<Integer> list)
	{
		if(n==0)
		{
			for(int i=0;i<list.size();i++)
			{
				System.out.print(" "+list.get(i));
				
			}
			System.out.println();
			return;
			
		}
		
		for(int i=1;i<=n;i++)
		{
			list.add(i);
			possible_ways(n-i,list);
			list.remove(list.size()-1);
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			ArrayList<Integer>list=new ArrayList<Integer>();
			possible_ways(n,list);
		}
		
		
		
		
	}



}
