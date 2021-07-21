package cp_algorithms;

import java.util.Scanner;

public class dp_longest_palindromic_subsequence
{
	static int [][]dp;
	private static void init(int len)
	{
		dp=new int[len][len];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
	}
	

	private static int lps(String s, int start, int end)
	{
		if(start>end)
		{
			return 0;
		}
		
		if(start==end)
		{
			return 1;
		}
		
		if(dp[start][end]!=-1)
		{
			return dp[start][end];
		}
		if(s.charAt(start)==s.charAt(end))
		{
			return dp[start][end]=(2+lps(s, start+1, end+1));
		}
		
		return dp[start][end]=Math.max(lps(s, start+1,end),lps(s, start, end-1));	
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			init(s.length());
			lps(s,0,(s.length()-1));
		}

	}





}
