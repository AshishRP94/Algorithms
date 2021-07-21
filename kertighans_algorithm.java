package cp_algorithms;

import java.util.Scanner;

public class kertighans_algorithm {

//	this algo counts number of bits sets in  binary number
	private static void count_no_of_bits(int n)
	{
		int count=0;
		int rsb=0;
		while(true)
		{
			if(n==0)
			{
				break;
			}
			rsb=(n&(-n));//n&(~n+1)
			n-=rsb;
			count+=1;
		}
		System.out.println(""+count);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		count_no_of_bits(n);
	}

	

}
