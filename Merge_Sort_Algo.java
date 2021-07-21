package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge_Sort_Algo 
{
	static int count=0;
	private static void merge(int low, int mid, int high, int[] arr)
	{
		ArrayList<Integer> temp=new ArrayList<Integer>();
		int left=low;
		int right=mid+1;
		
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				count+=1;
				temp.add(arr[left]);
				left+=1;
			}
			else
			{
				count+=1;
				temp.add(arr[right]);
				right+=1;
			}
			
		}
		
		while(left<=mid)
		{
			temp.add(arr[left]);
			left+=1;
			
		}
		
		while(right<=high)
		{
			temp.add(arr[right]);
			right+=1;
		}
		
//		imaginary array
		for(int i=low;i<=high;i++)
		{
			arr[i-low]=temp.get(i);
			
		}
	}
	
	private static void merge_sort(int low, int high, int[] arr, int n) 
	{
		while(low<=high)
		{
			
	
		
		int mid=((low+high)>>1);
		merge_sort(low,mid,arr,n);
		merge_sort(mid+1,high,arr,n);
		merge(low,mid,high,arr);
		}
				
		
		
	}
	
	

	public static void main(String args[])
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
			int low=0;
			int high=arr.length-1;
			merge_sort(low ,high,arr,n);
			System.out.println(""+count);
			
			
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[j]);
			}
		}
		
		
		
		
	}



}
