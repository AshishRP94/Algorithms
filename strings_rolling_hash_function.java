package cp_algorithms;

import java.util.Scanner;

public class strings_rolling_hash_function
{
	private static int hash_fuction(String s)
	{
		int p=1;
		int mod=Integer.MAX_VALUE;
		int hash=0;
		for(int i=0;i<s.length();i++)
		{
			hash=(hash+(((s.charAt(i)-'a')*p)%mod))%mod;
			p=p*31;
		}
		
		return hash;
		
	}


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			hash_fuction(s);
		}
		

	}

}
