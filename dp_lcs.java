package cp_algorithms;

import java.util.Scanner;

public class dp_lcs
{
	
	static int [][]dp;
	private static void init(int l1, int l2)
	{
		dp=new int[l1][l2];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp.length;j++)
			{
				dp[i][j]=-1;
			}
		}
		
	}
	
	
	private static int lcs(String a, String b, int i, int j)
	{
		if(i>=a.length() || j>b.length())
		{
			return 0;
		}
		
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		
		if(a.charAt(i)==b.charAt(j))
		{
			return dp[i][j]=1+lcs(a, b, i+1, j+1);
		}
		else
		{
			int left=lcs(a, b, i+1, j);
			int right=lcs(a, b, i, j+1);
			return dp[i][j]=Math.max(left,right);
		}
		
	}

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String a=scan.nextLine();
			String b=scan.nextLine();
			init(a.length(),b.length());
			lcs(a,b,0,0);
			
		}

	}





}
