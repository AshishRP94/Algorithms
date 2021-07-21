package cp_algorithms;

import java.util.Scanner;

public class dp_Vacation_imp_remembering_concept
{
	static int [][]dp;
	private static void init(int length, int length2)
	{
		dp=new int[(length+1)][(length2+1)];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}
	}
	
	
	private static int find(int[][] temp, int i,int flag)
	{
		if(i==temp.length)
		{
			return dp[i][flag]=0;
		}
		
		if(dp[i][flag]!=-1)
		{
			return dp[i][flag];
		}
		
		int cost=Integer.MIN_VALUE;
		if(flag==0)
		{
			cost=Math.max(cost,temp[0][i]+find(temp, i+1,1) );//select task a for first day (i+1 now decide for second day)
			cost=Math.max(cost,temp[1][i]+find(temp, i+1,2) );;//select task b for first day
			cost=Math.max(cost,temp[2][i]+find(temp, i+1,3) );;//select task c for first day
		}
		else if(flag==1)
		{
			cost=Math.max(cost,temp[1][i]+find(temp, i+1,2) );
			cost=Math.max(cost,temp[2][i]+find(temp, i+1,3) );
		}
		else if(flag==2)
		{
			cost=Math.max(cost,temp[0][i]+find(temp, i+1,1) );
			cost=Math.max(cost,temp[2][i]+find(temp, i+1,3) );
			
		}
		else
		{
			cost=Math.max(cost,temp[0][i]+find(temp, i+1,1) );
			cost=Math.max(cost,temp[1][i]+find(temp, i+1,2) );
		}
		
		
		return dp[i][flag]=cost;
	}
	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int days=0;
			int task=0;
			int [][]temp=new int[task][days];
			init(temp.length,temp[0].length);
			for(int j=0;j<temp.length;j++)
			{
				for(int k=0;k<temp[0].length;k++)
				{
					temp[j][k]=scan.nextInt();
				}
			}
			find(temp,0,0);
			
		}

	}





}
