package cp_algorithms;

import java.util.Scanner;

public class strings_rabin_karp_algo
{
	
	private static int commpute_hash(String s)
	{
		int hash=0;
		int mod=Integer.MAX_VALUE;
		int p=1;
		for(int i=0;i<s.length();i++)
		{
			hash=(hash+(((s.charAt(i)-'a')*p)%mod))%mod;
			p=(p*31)%mod;
		}
		
		return hash;
		
	}




	private static void rabinkarp(String s, String p)
	{
		int hashpattern=commpute_hash(p);
		int ps=p.length();
		int ss=s.length();
		
		int hashstring=commpute_hash(s.substring(0,ps));
		int count=0;
		int left=0;
		int right=ps-1;
		int pr=31;
		int pl=1;
		int mod=Integer.MAX_VALUE;
		if(hashpattern==hashstring)
		{
			count+=1;
		}
		
		while(true)
		{
			if(right>ss-1)
			{
				break;
			}
			right+=1;
			hashstring=(hashstring+((s.charAt(right)-'a')*pr)%mod)%mod;
			pr=pr*31;
			hashstring=(hashstring-((s.charAt(left)-'a')*pl)%mod)%mod;
			pl=pl*31;
			hashpattern=((hashpattern*31)%mod);
			if(hashpattern==hashstring)
			{
				count+=1;
			}
		}
	}
	
	


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			String p=scan.nextLine();
			rabinkarp(s,p);
		}

	}



}
