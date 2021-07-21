package cp_algorithms;

import java.util.Scanner;

public class scanline 
{
	
	
	private static void scanlinealgo(int[] arr, int l, int r, int x)
	{
		long []prefixsum=new long[(arr.length+1)];
		for(int i=0;i<arr.length;i++)
		{
			prefixsum[i]=0;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			prefixsum[l]+=x;
			prefixsum[r+1]-=x;
		}
		
		long sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=prefixsum[i];
			prefixsum[i]=sum;
		}
		
	
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		int l=scan.nextInt();
		int r=scan.nextInt();
		int x=scan.nextInt();
		scanlinealgo(arr,l,r,x);
		
		

	}


}
