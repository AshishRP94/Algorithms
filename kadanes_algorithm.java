package cp_algorithms;

import java.util.Scanner;

public class kadanes_algorithm
{
	//we keep on adding numbers untill we encounter a negative sum;
	//this is the main idea of kandanes algo
	//it is used to find maximum sum in subarray (subarray consists of negative numbers)
	private static void kadanes(int[] arr)
	{
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum>max)
			{
				max=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		}
		System.out.println(""+max);
		
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
		kadanes(arr);
		
	}


}
