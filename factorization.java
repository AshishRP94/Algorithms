package cp_algorithms;

import java.util.Scanner;

public class factorization 
{
	static int[] sieve=new int[100000];
	
	
	
	private static void constructseive_primef()
	{// sieve[i]=we are storing the smallest prime factor that is dividing the number
	 // no of factors<log2n
		for(int i=2;i<sieve.length;i++)
		{
			sieve[i]=i; 
		}
		
		
		
		for(int i=2;(i*i)<sieve.length;i++)
		{
			if(sieve[i]==i)
			{
				for(int f=(i*i);f<sieve.length;f=f+i)
				{
					if(sieve[f]==f)
					{
						sieve[f]=i;
					}
					
				
				}
			}
			
		}
		
	}


	public static void main(String[] args)
	{
		constructseive_primef();
		Scanner scan=new Scanner(System.in);
		int primefact=scan.nextInt();
		while(true)
		{
			if(primefact==1)
			{
				System.out.println("1");
				break;
			}
			
			int d=sieve[primefact];
			System.out.print(" "+d);
			primefact/=d;
		
		}
		
		
		

	}


}
