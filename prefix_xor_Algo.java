package cp_algorithms;

import java.util.Scanner;

public class prefix_xor_Algo {

	private static void prefix_xor(int l, int r)
	{
//		l=3 r=7
//		x=1^2^3^4^5^6^7
//		xor=x
//		ans=(1^2^3^4^5^6^7)^(1^2)
		int []prefix=new int[r+1];
		int xor=0;
		for(int i=0;i<=r;i++)
		{
			xor^=i;
			prefix[i]=xor;
		}
		
		int ans=0;
		if((l-1)>=0)
		{
		 ans=(xor^(prefix[l-1]));
			
		}
		System.out.println(""+ans);
		
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int r=scan.nextInt();
		prefix_xor(l,r);

	}



}
