package cp_algorithms;

import java.util.Scanner;
//imp cp algorithm
public class prefix_sum {
	
	private static int findprefixsum(int[] arr, int left, int right) 
	{
		int sum=0;
		int []prefixarr=new int[arr.length];
		//computate prefixsumarray
		//prefixarr[0]=arr[0];
		for(int i=0;i<prefixarr.length;i++)
		{
			
			sum+=arr[i];
			prefixarr[i]=sum;//prefixarr[i] = prefixarr[i - 1] + arr[i]; 

		}
		
		//print the array
		for(int i=0;i<prefixarr.length;i++)
		{
			System.out.print(prefixarr[i]+" ");
		}
		
		//find the sum in the range left and right(included)
		int ans=0;
		if(left-1>=0)
		{
			
		ans=prefixarr[right]-prefixarr[left-1];
		}
		System.out.println();
		return ans;
		
	
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int size=scan.nextInt();
			int [] arr=new int[size];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			int left=scan.nextInt();
			int right=scan.nextInt();
			
		System.out.println(findprefixsum(arr,left,right));
		}
		
	}

	

}
