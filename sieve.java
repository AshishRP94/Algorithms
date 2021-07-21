package cp_algorithms;

import java.util.Scanner;

public class sieve
{
	static int []eratosthenes=new int[10000];
	//1-is prime 
	//0-not prime
	private static void sieve_of_eratosthenes()
	{
		
		for(int i=2;i<eratosthenes.length;i++)
		{
			eratosthenes[i]=1;
		}
		
		int c=0;
		for(int i=2;(i*i)<eratosthenes.length;i++)
		{
			if(eratosthenes[i]==1)
			{
				c+=1;
				for(int p=i*i;p<eratosthenes.length;p=p+i)
				{
					if(eratosthenes[p]==1)
					{
						
						eratosthenes[p]=0;
					}
					
				}
			}
		}
		
		System.out.print(" c="+c);
		for(int i=0;i<eratosthenes.length;i++)
		{
			System.out.print(" "+eratosthenes[i]);
		}
		
	}


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		sieve_of_eratosthenes();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			if(eratosthenes[n]==0)
			{
				System.out.println(n+" is not a prime number");
			}
			else
			{
				System.out.println(n+" is a prime number");
			}
			
		}
		
	}

	
}
