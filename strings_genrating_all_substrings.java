package cp_algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class strings_genrating_all_substrings
{
	
	private static void substrings(String s)
	{
		HashSet<Integer>set=new HashSet<Integer>();
		int mod=Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++)
		{
			int hash=0;
			int p=1;
			for(int j=i;j<s.length();j++)
			{
				hash=(hash+(((s.charAt(j)-'a')*p)%mod))%mod;
				p=(p*31)%mod;
				set.add(hash);
			}
		}
		
		System.out.println(""+set.size());
		
		
	}

	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			substrings(s);
		}
	}

}
