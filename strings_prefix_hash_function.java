package cp_algorithms;

import java.util.Scanner;

public class strings_prefix_hash_function {

	
	
	static int[]phash;
	private static void compute_prefix_hash(String s)
	{
		phash=new int[(s.length())];
		int hash=0;
		int mod=Integer.MAX_VALUE;
		int p=1;
		for(int i=0;i<phash.length;i++)
		{
			hash=(hash+(((s.charAt(i)-'a')*p)%mod)%mod);
			phash[i]=hash;
			p=p*31;
		}
	}
	

	private static int pow(int base, int power, int mod)
	{
		
		int res=1;
		while(power>0)
		{
			if((power&1)==1)
			{
				//odd
				res=(res*base)%mod;
				power=power-1;
			}
			else
			{
				base=(base*base)%mod;
				power=power/2;
			}
			
		
		}
		return res;
		
		
		
	}
	
	private static  int computehash(int l, int r, String s)
	{
		int mod=Integer.MAX_VALUE;
		int hash=phash[r];
		if(l>0)
		{
			hash=(hash-(phash[l-1]+mod))%mod;
//			divide
			hash=hash*pow(pow(31,l,mod),mod-2 ,mod);
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
			compute_prefix_hash(s);
			int q=scan.nextInt();
			for(int j=0;j<q;j++)
			{
				int s1=scan.nextInt();
				int e1=scan.nextInt();
				int s2=scan.nextInt();
				int e2=scan.nextInt();
				int hash1=computehash(s1,e1,s);
				int hash2=computehash(s2,e2,s);
				if(hash1==hash2)
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
				
			}
		}

	}


	



}
