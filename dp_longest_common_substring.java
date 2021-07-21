package cp_algorithms;

import java.util.Scanner;

public class dp_longest_common_substring
{
	
	static int [][]dp;
	private static void init(int l, int k)
	{
		dp=new int [l][k];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
		
	}


	
	private static int lcs(String s, String s2, int n, int m, int count)
	{
		if(n==0||m==0)
		{
			return count;
		}
		
		int count1=0;
		if(dp[n][m]!=-1)
		{
			return dp[n][m];
		}
		if(s.charAt(n)==s.charAt(m))
		{
			count1=lcs(s, s2, n-1, m-1, count);
		}
		
		int count2=lcs(s, s2, n-1, m, 0);
		int count3=lcs(s, s2, n, m-1, 0);
		
		return dp[n][m]=Math.max(count1,Math.max(count2, count3));
		
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s1=scan.nextLine();
			String s2=scan.nextLine();
			
			init(s1.length(),s2.length());
			lcs(s1,s2,(s1.length()-1),s2.length()-1,0);
		}

	}





}
