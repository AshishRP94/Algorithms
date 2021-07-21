package cp_algorithms;

import java.util.Scanner;

public class dp_count_ways
{
	static int[]dp;
	private static void init(int n)
	{
		dp=new int[(n+1)];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	
	
	private static int count(int[] coins, int sum, int i)
	{
		if(i>=coins.length)
		{
			return 0;
		}
		
		if(sum==0)
		{
			return 1;
		}
		int pick=0;
		int notpick=0;
		if(coins[i]>=sum)
		{
			pick+=count(coins, sum-coins[i], i+1);
		}
		
		notpick+=count(coins, sum, i+1);
		return pick+notpick;
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int sum=scan.nextInt();
			int n=scan.nextInt();
			int []coins=new int[n];
			init(coins.length);
			for(int j=0;j<coins.length;j++)
			{
				coins[j]=scan.nextInt();
			}
			count(coins,sum,0);
			
		}
		
	}





}
