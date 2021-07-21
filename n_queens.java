package cp_algorithms;

import java.util.Scanner;

public class n_queens {
	
	private static boolean isSafe(int row, int col, int[][] chess)
	{
		
		int i=row;
		int j=col;
		
		while(i>=0 && j>=0)
		{
			if(chess[i][j]==1)
			{
				return false;
			}
			i--;
			j--;
		}
		
		 i=row;
		 j=col;
		
		while(j>=0)
		{
			if(chess[i][j]==1)
			{
				return false;
			}

			j--;
		}
		
		
		i=row;
		j=col;
		
		while(i<chess.length && j>=0)
		{
			if(chess[i][j]==1)
			{
				return false;
			}
			i++;
			j--;
		}
		
		
		
		return true;
	}
	
	
	
	private static void print_queens(int[][] chess, int col,int n)
	{
		
		if(col==n)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(" "+chess[i][j]);
				}
				System.out.println();
			}
			
		}
		
		for(int row=0;row<n;row++)
		{
			if(isSafe(row,col,chess))
			{
				chess[row][col]=1;
				print_queens(chess, col+1,n);
				chess[row][col]=0;
			
			}
			
		}

	
	
	}
	




	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int [][]chess=new int[n][n];
			
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					chess[j][k]=scan.nextInt();
				}
			
			}
			
			print_queens(chess,0,chess.length);
			
			
		}

	}



	

}
