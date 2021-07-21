package cp_algorithms;

import java.util.HashMap;
import java.util.Scanner;

//n=p^m 
//if n is prime then n-1
//else
//if n=p^m * p^m-1

public class euler_totient_function 
{

	private static void eulertfun(int n)
	{
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=2;(i*i)<n;i++)
		{
			if(n%i==0)
			{
				hm.put(i,1);
				int count=0;
				while(true)
				{
					if(n%i!=0)
					{
						hm.put(i, count);
						break;
					}
					n/=i;
					count+=1;
				}
			}
		}
		
		if(n>=2)
		{
			if(hm.containsKey(n)==true)
			{
				hm.put(n,hm.get(n)+1 );
			}
			else
			{
				hm.put(n,1);
				
			}
		}
		
		long ans=1;
		for(int i:hm.keySet())
		{
			ans*=(Math.pow(i,hm.get(i)))-(Math.pow(i,(hm.get(i)-1)));
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
			eulertfun(n);
		}
		
		
	}


}
