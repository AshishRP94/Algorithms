package cp_algorithms;

import java.util.Scanner;

public class modulo_arithmetic {

  static long mod=1000000007;
	private static long mod(long x)
	{
		return (((x%mod)+mod)%mod);
		
	}
	
	private static long add(long a, long b)
	{
		return mod(mod(a)+mod(b));
		
	}
	
	private static long mul(long a, long b)
	{
		return mod(mod(a)*mod(b));
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		long x=scan.nextLong();
		long y=scan.nextLong();
		long ans=mul(add(x,y),add(x,y));
		
		
	
	}





	

}
