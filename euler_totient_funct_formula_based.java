package cp_algorithms;

import java.util.HashSet;
import java.util.Scanner;

//phi(n)=n*mul(1-1/p) where p=prime numbers founded when prime facto n
//36*(1-1/2)*(1-1/3)
//
//
//
//
//

public class euler_totient_funct_formula_based 
{

	private static void euler(int n)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		float ans=n;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				hs.add(i);
				while(true)
				{
					if(n%i!=0)
					{
						break;
					}
					n/=i;
					
				}
				
			}
			
		}
		if(n>=2)
		{
			hs.add(n);
		}
		
		for(int i:hs)
		{
			ans*=(1.0f-(1.0f/i));
		}
		System.out.println(""+ans);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			euler(n);
		}
		
		
	}

	

}
