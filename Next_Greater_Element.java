package cp_algorithms;

import java.util.Scanner;
import java.util.Stack;

//imp algo-
//1 2 3 4  5
//2 3 4 5 -1
public class Next_Greater_Element {
	
	private static void find_nge(int[] arr)
	{
		int []nge=new int[arr.length];
		Stack<Integer>st=new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(st.empty()==false)
			{
				while(true)
				{
					if(st.empty()==false && arr[i]<st.peek())
					{
						break;
					}
					st.pop();
				}
			}
			
			if(st.empty()==true)
			{
				nge[i]=-1;
			}
			else
			{
				nge[i]=st.peek();
			}
			st.push(arr[i]);
		}
		
		for(int i=0;i<nge.length;i++)
		{
			System.out.print(" "+nge[i]);
			
		}
		
		
	}

	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int []arr=new int[n];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scan.nextInt();
			}
			find_nge(arr);
		}

	}


}
