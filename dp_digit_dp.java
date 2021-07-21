package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class dp_digit_dp {
	
	
	private static ArrayList<Long> convert(long l)
	{
		ArrayList<Long> ans=new ArrayList<Long>();
		while(true)
		{
			if(l<=0)
			{
				break;
			}
			long t=(l%10);
			ans.add(t);
			l/=10;
		}
		
		
		
		return ans;
	}
	
	static Integer [][][]dp=new Integer[19][2][19];
	private static int find(ArrayList<Long> larr,int ind, int flag, int count )
	{
		if(ind==larr.size())
		{
			if(count==k)
			{
				return 1;
			}
			else
			{
				return 0;				
			}
			
			
		}
		
		long limit= 9;
		if(flag==0)
		{
			limit=larr.get(ind);
		}
		
		if(dp[ind][flag][count]!=null)
		{
			return dp[ind][flag][count];
		}
		
		int counts=0;
		for(int nums=0;nums<limit;nums++)
		{
			if(nums<larr.get(ind))
			{
				if(nums==d)
				{
					counts+=find(larr, ind+1, 1, count+1);
				}
				else
				{
					counts+=find(larr, ind+1, 1, count+1);
				}
			}
			else
			{
				
				if(nums==d)
				{
					counts+=find(larr, ind+1, flag, count+1);
				}
				else
				{
					counts+=find(larr, ind+1, flag, count+1);
				}
				
			}	
		}
		
		return dp[ind][flag][count]=counts;
	}
	
	static long d=0,k=0;

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			long l=scan.nextLong();
			ArrayList<Long>larr=convert((l-1));
			long r=scan.nextLong();
			ArrayList<Long>rarr=convert(r);
			 d=scan.nextLong();
			 k=scan.nextLong();
			long ansr=find(larr,0,0,0);
			long ansl=find(rarr,0,0,0);
			System.out.println(""+(ansr-ansl));
		}
		
	}





}
