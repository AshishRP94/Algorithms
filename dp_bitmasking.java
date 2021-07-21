package cp_algorithms;

import java.util.Scanner;


public class dp_bitmasking
{
	static int [][]dp;
	private static void init()
	{
		dp=new int[21][(1<<21)];	
	}
	
	private static int find(int[][] arr, int day, int mask)
	{
		if(day>arr.length)
		{
			return 0;
		}
		int min=Integer.MAX_VALUE;
		for(int person=1;person<=arr.length;person++)
		{
			if((mask&(1<<person))==0)
			{
				mask=mask|(1<<person);
				min=Math.min(min, arr[person][day]+find(arr,(day+1), mask));
				mask=mask^(1<<person);
				
			}
		}
		
		return dp[day][mask]=min;
		
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
			init();
			find(arr,0,1);
		}

	}






}
