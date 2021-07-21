package cp_algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class find_max_subarray_with_sum_0
{
	
	private static void find_longest_subarray(int[] arr)
	{
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum==0)
			{
				if(max<i+1)
				{
					max=i+1;
				}
				
			}
			else
			{
				if(hm.containsKey(sum)==true)
				{
					int ind=hm.get(sum);
					if(max<(i-ind))
					{
						max=i-ind;
					}
				}
				else
				{
					hm.put(sum, i);
				}
				
				
				
			}
			
			
		}
		
		
		System.out.println(""+max);
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		find_longest_subarray(arr);
	}

	

	

}
