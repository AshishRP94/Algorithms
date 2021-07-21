package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class pick_and_not_pick {
	
	
//	alterative to power set

//	3 number
//	000
//	001
//	010
//	011
//	100
//	101
//	110
//	111

	
	
	
	private static void pick_and_notpick(int[] arr, ArrayList<Integer> ans, int k, int i)
	{
		
		if(i==arr.length)
		{
			if(k==0)
			{
				for(int j=0;j<ans.size();j++)
				{
					System.out.println(" "+(ans.get(j)));
				}
				System.out.println();
			}
			
		}
		
//		pick the element
		
		if(arr[i]<=k)
		{
			
			ans.add(arr[i]);
			pick_and_notpick(arr, ans, k-arr[i], i+1);
			ans.remove(i);
		
		}
		
		
//		not pick the element
		pick_and_notpick(arr, ans, k, i+1);
		
	
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=scan.nextInt();
			}
			
			int k=scan.nextInt();
			ArrayList<Integer>ans=new ArrayList<Integer>();
			pick_and_notpick(arr,ans,k,0);
		}
		
		
		
	}



}
