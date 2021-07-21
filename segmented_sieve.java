package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class segmented_sieve {

	static boolean []sieve;
	private static void sieveoe()
	{
		sieve=new boolean[10000000];
		for(int i=2;i*i<sieve.length;i++)
		{
			if(sieve[i]==false)
			{
				
			for(int j=i*i;j<sieve.length;j+=i)
			{
				if(sieve[j]==false)
				{
					sieve[j]=true;
				}
				
			}
			}
			
			
		}
		
	}
	
	private static void countprimes(int l, int r)
	{
		
//		stores all primes till sqrt(r)
		ArrayList<Integer>primes=new ArrayList<Integer>();
		for(int i=2;i*i<r;i++)
		{
			if(sieve[i]==false)
			{
				primes.add(i);
			}
		}
		
//		create array of size difference size i.e r-l
		boolean []diff=new boolean[r-l+1];
		
		for(int i=0;i<primes.size();i++)
		{
			int p=primes.get(i);
			int firstmultiple=(l/p)*p;
			if(l%p==1)
			{
				firstmultiple+=p;
			}
			
			
			for(int j=Math.max(p*p, firstmultiple);j<r;j+=p)
			{
//				l=110
//				 j=110
				//110-110=0
				
				diff[j-l]=true;
			}
		}
		
//		count primes between l and r
		int count=0;
		for(int i=0;i<diff.length;i++)
		{
			if(diff[i]==false)
			{
				count+=1;
			}
				
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args)
	{
		sieveoe();
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int r=scan.nextInt();
		countprimes(l,r);

	}

	



}
