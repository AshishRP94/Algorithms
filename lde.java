package cp_algorithms;

import java.util.Scanner;

//The algorithm is based on the below facts. 
//If we subtract a smaller number from a larger (we reduce a larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
//Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0.

public class lde
{
	
	private static int gcd(int a, int b)
	{
		  if (a == 0)
		  {
			  return b;
			  
		  }
	      return gcd(b%a, a);
		
	}
	
	
	private static void lide(int a, int b, int c)
	{
		if(c%gcd(a,b)==0)
		{
			System.out.println("YES ,solution exits(+,-)");
			
		}
		else
		{
			System.out.println("NOT ,solution does not exits(+,-)");
			
		}
		
	}
	


	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		lide(a,b,c);
		
	}

	
	

}
