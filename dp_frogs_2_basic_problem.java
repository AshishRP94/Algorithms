package cp_algorithms;

import java.util.Scanner;

public class dp_frogs_2_basic_problem
{
	
    static int []dp;
	private static void init(int n)
	{
		dp=new int[(n+1)];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
	}
	
	private static int frogs(int[] height, int k, int i)
	{
		if(i==height.length-1)
		{
			return dp[i]=0;
		}
		
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		int cost=Integer.MAX_VALUE;
		for(int j=i+1;j<(i+k);j++)
		{
			System.out.println("current stone="+i);
			System.out.println("next stone="+j);
			if(j<height.length)
			{
				cost=Math.min(cost,(Math.abs(height[j]-height[i])+frogs(height, k, j)));			
			}
		}
		return dp[i]=cost;
	}
		
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int k=scan.nextInt();
			int []height=new int[n];
			init(n);
			for(int j=0;j<height.length;j++)
			{
				height[j]=scan.nextInt();
			}
			frogs(height,k,1);
		
			System.out.println(""+dp[1]);
		}
	
	}
}









