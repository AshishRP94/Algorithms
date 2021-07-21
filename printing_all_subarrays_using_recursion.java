package cp_algorithms;

import java.util.Scanner;

public class printing_all_subarrays_using_recursion {
	
	private static int subarray(int[] arr, int start, int end)
	{
		if(end>=arr.length)
		{
			return 0;
		}
		
		if(start>end)
		{
			subarray(arr, 0, end+1);
		}
		
		for(int i=start;i<end;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[end]+" ");
		subarray(arr, start+1, end);
		return 0;
		
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			subarray(arr,0,0);
		}

	}



}
