package cp_algorithms;

import java.util.Scanner;

public class dp_probailty
{
	static double[][] dp;
	private static void init(int i, int j)
	{
		dp=new double[i][j];
		for(i=0;i<dp.length;i++)
		{
			for(j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
	}
	
	private static double findprob(double[] heads, int i, int count)
	{
		if(i==heads.length)
		{
			if(count>(heads.length-count))
			{
				return 1.0;
			}
			else
			{
				return 0;
			}
		}
		
		double pheads=(heads[i]*findprob(heads, i+1, count+1));
		double ptails=(1-heads[i]*findprob(heads, i+1, count));
		
		return dp[i][count]=pheads+ptails;
		
	}

	
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		init(3000,3000);
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			double []heads=new double[n];
			for(int j=0;j<heads.length;j++)
			{
				heads[j]=scan.nextDouble();
			}
			double ans=findprob(heads,0,0);
			System.out.println(""+ans);
		}
		
		
	}



}
