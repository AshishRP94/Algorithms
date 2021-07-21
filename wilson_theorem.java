package cp_algorithms;

import java.util.Scanner;

public class wilson_theorem
{

	private static long fact(int n)
	{
		long ans=1;
		for(int i=2;i<=n;i++)
		{
			ans*=i;
			
		}
		
//		System.out.println(""+ans);
		return ans;
	}
	
	
	private static void wilson(int n)
	{
		// wilson theroem states that n should be  prime number so question boils down to checking wheather a number is prime or not
		if((fact(n-1)%n)==(n-1))
		{
			System.out.println("yes ,satisfies condition if n is prime number");
		}
		else
		{
			
			System.out.println("no ,does no satisfies condition if n is prime number");
		}
	
	}
	
	
	public static void main(String args[])
	{	
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		wilson(n);
		
	}




	

}
