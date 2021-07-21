package cp_algorithms;

import java.util.Scanner;

public class dp_frogs_basic_problem {
	
    static int []dp;
	private static void init(int n)
	{
		dp=new int[n];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		
	}

	
	private static int frogs(int[] stones, int i)
	{
		if(i==stones.length-1)
		{
			return dp[i]=0;
		}
		
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		
		int jump1=Integer.MAX_VALUE;
		int jump2=Integer.MAX_VALUE;
		
		jump1=Math.abs(stones[i]-stones[i+1])+frogs(stones, i+1);
		jump2=Math.abs(stones[i]-stones[i+2])+frogs(stones, i+2);
		
		return  dp[i]=Math.min(jump1,jump2);	
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []stones=new int[n];
			init(n);
			for(int j=0;j<stones.length;j++)
			{
				stones[j]=scan.nextInt();
			}
			frogs(stones,0);
		}

	}





}
