package cp_algorithms;

import java.util.Scanner;

public class Binary_Exponentiation 
{
	
//	long long binpow(long long a, long long b) {
//	    long long res = 1;
//	    while (b > 0) {
//	        if (b & 1)
//	            res = res * a;
//	        a = a * a;
//	        b >>= 1;
//	    }
//	    return res;
//	}
	
	
	private static long binarypower(long base, long power) 
	{
		long res=1;
		while(power>0)
		{
			if((power&1)==1)
			{
				//odd
				res=res*base;
				power=power-1;
			}
			else
			{
				base=base*base;
				power=power/2;
			}
			
		
		}
		return res;
		
			
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long base=scan.nextLong();
		long power=scan.nextLong();
		System.out.println(binarypower(base,power));
		
	}



}
