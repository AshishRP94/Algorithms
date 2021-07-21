package cp_algorithms;

import java.util.Scanner;

public class Matrix_Exponentiation_Algo
{
	private static void fib(int n)
	{
		int [][]base=new int[1][1];
		base[0][0]=1;
		base[0][1]=1;
		base[1][0]=1;
		base[1][1]=0;
		
		int [][]ans=new int[1][1];
		ans[0][0]=1;
		ans[0][1]=0;
		ans[1][0]=0;
		ans[1][1]=1;
		
		while(true)
		{
			if(n<=0)
			{
				break;
			}
			
			if((n&1)==1)
			{
				int [][]temp=new int[1][1];
//				 base[0][0] * base[0][0] + base[0][0] * base[0][1];
				temp[0][0]=(ans[0][0]*base[0][0])+(ans[0][0]*base[0][1]);
				temp[0][1]=(ans[0][0]*base[0][1])+(ans[0][1]*base[1][1]);
				temp[1][0]=(ans[1][0]*base[0][0])+(ans[1][1]*base[1][0]);
				temp[1][1]=(ans[1][0]*base[1][1])+(ans[0][1]*base[1][1]);
				
				ans=temp;
				n-=1;
				
				
				
			}
			else
			{
				int [][]temp=new int[1][1];
				
				temp[0][0]=(base[0][0]*base[0][0])+(base[0][0]*base[0][1]);
				temp[0][1]=(base[0][0]*base[0][1])+(base[0][1]*base[1][1]);
				temp[1][0]=(base[1][0]*base[0][0])+(base[1][1]*base[1][0]);
				temp[1][1]=(base[1][0]*base[1][1])+(base[0][1]*base[1][1]);
				
				
	            base = temp; 
	            n = n/2; 
			}
				
			
		}
		
		
		
		
		
		System.out.println(""+ans[0][0]);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			fib(n);
			
		}
		
		
	}



}
