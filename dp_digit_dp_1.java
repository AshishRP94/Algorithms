package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class dp_digit_dp_1 {
	
	private static ArrayList<Long> convert(long l)
	{
		ArrayList<Long>ans=new ArrayList<Long>();
		while(true)
		{
			if(l<=0)
			{	
				break;
			}
			long temp=(l%10);
			ans.add(temp);
			l/=10;
		}
		return ans;
	}
	
	static Integer [][][][]dp=new Integer[19][2][10][10];

	private static long find(ArrayList<Long> larr, int i, int flag, int f,int l)
	{
		if(i==larr.size())
		{
			if(f==l)
			{
				return 1;
			}
			else
			{
				
				return 0;
			}
		}
		
		long limit=0;
		if(flag==0)
		{
			limit=larr.get(i);
		}
		
		int counts=0;
		if( dp[i][flag][f][l]!=null)
		{
			return  dp[i][flag][f][l];
			
		}
		for(int nums = 0;nums<limit;nums++)
		{
			if(nums<larr.get(i))
			{
				if(f==0)
				{
					counts+=find(larr, i+1, 1, nums, nums);
				}
				else
				{
					counts+=find(larr, i+1, 1, f, nums);
					
				}
				
			}
			else
			{
				if(f==0)
				{
					counts+=find(larr, i+1, flag, nums, nums);
				}
				else
				{
					counts+=find(larr, i+1, flag, f, nums);
					
				}
			
			}
		}
		
		
		
		
		return dp[i][flag][f][l]=counts;
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long l=scan.nextLong();
			ArrayList<Long>larr=convert(l-1);
			long r=scan.nextLong();
			ArrayList<Long>rarr=convert(r);
			long ans2=find(larr,0,0,0,0);
			long ans1=find(rarr,0,0,0,0);
			System.out.println(""+(ans1-ans2));
			
		}

	}


	



}
