package cp_algorithms;

import java.util.Scanner;

public class Generate_Submatrix
{
	

	private static void print_submatrix(long[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				
				
			}
		}
		
	}
	

	public static void main(String[] args)throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
				int n=scan.nextInt();
				int m=scan.nextInt();
				long[][]arr=new long[n][m];
				for(int j=0;j<arr.length;j++)
				{
					for(int k=0;k<arr[0].length;k++)
					{
						arr[j][k]=scan.nextLong();
					}
				}
				print_submatrix(arr);
		}
		

	}


}
