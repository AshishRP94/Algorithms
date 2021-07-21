package cp_algorithms;

import java.util.Scanner;

public class modular_Exponentiation
{
	private static long modularexpo(int base, int power, int mod)
	{
		
		long res=1;
		while(true)
		{
			if(power<=0)
			{
				break;
			}
			
			if((power&1)==1)
			{
				//odd
				res=((res*base)%mod);
				power-=1;
			}
			else
			{
				//even
				base=(base*base)%mod;
				power/=2;
			}
			
		}
		return res;
		
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int mod = 1000000007;//or 1e9+7
		int n=scan.nextInt();
		int base=scan.nextInt();
		long res=modularexpo(n,base,mod);
		System.out.println(" "+res);
		
		
		

	}



}
