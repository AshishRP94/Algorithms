package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class dp_max_cost_and_path {

//	int dp[n][m]; 
//	int f(int i, int j) {
//	    if(i>=n || j>=m || a[i][j] == 0) return 0; 
//	    if(i==n-1 && j==m-1) return 1; 
//	    if(dp[i][j] != -1) return dp[i][j]; 
//	    return dp[i][j] = f(i, j+1) + f(i+1, j); 
//	}
	static int[][]dp;
	private static void init(int length, int length2)
	{
		dp=new int[length][length2];
	}
	

	private static int max_cost(int[][] arr, int i, int j)
	{
		if(i>arr.length-1 && j>arr[0].length-1)
		{
			return Integer.MIN_VALUE;
			
		}
		
		if(i==arr.length-1 && j==arr[0].length)
		{
			return arr[i][j];
		}
		
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		
		int cost=Integer.MIN_VALUE;
		cost=arr[i][j]+Math.max(max_cost(arr, i+1, j),max_cost(arr, i, j+1));
		return dp[i][j]=cost;
		
	}
	
	private static void findpath(int[][] arr, int[][] dp)
	{
		ArrayList<Integer>path=new ArrayList<Integer>();
		path.add(arr[0][0]);
		for(int i=0;i<dp.length-1;i++)
		{
			for(int j=0;j<dp[0].length-1;j++)
			{
				if(dp[i][j]-arr[i][j]==dp[i+1][j])
				{
					path.add(arr[i+1][j]);
				}
				else if(dp[i][j]-arr[i][j]==dp[i][j+1])
				{
					path.add(arr[i][j+1]);
				}
			}
		}
		for(int i=0;i<path.size();i++)
		{
			System.out.print(path.get(i)+" ");
		}
		
	} 
	
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int [][]arr=new int[n][m];
		init(arr.length,arr[0].length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		max_cost(arr,0,0);
		System.out.println(""+dp[0][0]);
		findpath(arr,dp);
	}











}
