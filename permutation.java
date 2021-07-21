package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class permutation
{
	
	private static void permutate(String s, int i, boolean[] bool, ArrayList<Character> ans)
	{
		if(i==s.length())
		{
			for(int j=0;j<ans.size();j++)
			{
				
				System.out.print(""+ans.get(j));
			
			}
			System.out.println();
			
			return;
		}
		
		for(int t=0;t<s.length();t++)
		{
			if(bool[t]==false)
			{
				bool[t]=true;
				char x=s.charAt(t);
				ans.add(s.charAt(t));
				permutate(s, i+1, bool, ans);
				bool[t]=false;
				ans.remove(new Character(x));
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
			boolean []bool=new boolean [s.length()];
			ArrayList<Character>ans=new ArrayList<Character>();
			permutate(s,0,bool,ans);
			
		}
		
		
	}



}
