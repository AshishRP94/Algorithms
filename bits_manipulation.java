package cp_algorithms;

import java.util.Scanner;

/*
some theory
if n=8
n>>1  divides it by 2 
n=4


if n=8
n<<1  multipies it by 2 
n=16

_1_    _1_    _0_    _0_    _1_
1*2^4  1*2^3  0*2^2  0*2^1  1*2^0

*/


public class bits_manipulation {

	
	private static void power_of_2(int n)
	{
//		eg 23 can be represented as 2^4 ,2^2,2^1,2^0
		
		int count=-1;
		while(true)
		{
			if(n==0)
			{
				break;
			}
			count+=1;
			if((n&1)==1)
			{
				System.out.println(""+(1<<count));
			}
			n>>=1;
			
		}
		
	}
	
	private static void check_i_bit_is_set_or_not(int n, int i) 
	{
		if((n&(1<<i))==1)
		{
//			bit is set
			System.out.println("bit is set");
		}
		else
		{
//			bit is not set
			System.out.println("bit is not set");
		}
		
	}
	
	

	
	private static void xor_numbers_from_1to_n(int n)
	{
		
/*		N  | ans
		
		1  | 1	
		2  | 3	
		3  | 0	
		4  | 4	
		5  | 1	
		6  | 7	
		7  | 0	
		8  | 8	
		9  | 1	
		10 |11	
		11 | 0	
		12 | 12		*/
		
		
		if(n%4==0)
		{
			System.out.println(""+n);
		}
		else if(n%4==1)
		{
			System.out.println("1");
		}
		else if(n%4==3)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println(""+n+1);
		}
		
		
	}
	
	
	private static void set_i_bit(int n, int i)
	{
		if((n|(1<<i))==1)
		{	
//			bit is set
			System.out.println("bit is set");
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		power_of_2(n);
		int i=scan.nextInt();
		check_i_bit_is_set_or_not(n,i);
		set_i_bit(n,i);
		xor_numbers_from_1to_n(n);
		

		
		
	}






	

}
