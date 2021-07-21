package cp_algorithms;

import java.util.Scanner;

public class dp_find_number_of_paths
{
	
	static int [][]dp;
	private static void init(int length, int length2) 
	{
		dp=new int[length][length2];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				dp[i][j]=-1;
			}
		}

	}
	
	
	private static int path(int[][] arr, int i,int j) 
	{
		if(i>=arr.length || j>=arr[0].length ||arr[i][j]==0)
		{
			return 0;
		}
		
		if(i==arr.length-1 && j==arr[0].length)
		{
			return 1;
		}
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		
		return dp[i][j]=(path(arr,i+1,j)+path(arr, i, j+1));
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int [][]arr=new int[n][m];
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr[0].length;k++)
				{
					arr[j][k]=scan.nextInt();
				}
			}
			init(arr.length,arr[0].length);
			path(arr,0,0);
		}
		



	}




}
