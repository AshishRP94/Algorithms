package cp_algorithms;

import java.util.Scanner;
import java.util.Stack;



public class bits_traversal 
{
	private static int bit_traversal(int num)
	{
		int ones=0;
		Stack<Integer>st=new Stack<Integer>();
		int temp=num;
		while(true)
		{
			if(temp==0)
			{
				break;
			}
			
			if((temp&1)==0)
			{
				
			}
			else
			{
				ones+=1;
			}
			temp=(temp>>1);
		}
		return ones;
		
	}
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int num=scan.nextInt();
			int ones=bit_traversal(num);
			System.out.println(""+ones);
		}

	}



}
