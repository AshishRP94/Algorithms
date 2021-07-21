package cp_algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class dp_work_break {
	

	static HashMap<String,Integer>hm=new HashMap<String,Integer>();
	private static void init()
	{
		hm.clear();
	}

	
	
	

	
	
	private static int wbreak(HashSet<String> set, String word)
	{
		if(word=="" ||word.length()==0)
		{
			return 1;
		}
		
		if(hm.containsKey(word))
		{
			return hm.get(word);
		}
		
		for(int i=1;i<word.length();i++)
		{
			String temp=word.substring(0,(i+1));
			if(set.contains(temp))
			{
			int ans=wbreak(set, word.substring(i+1));
			if(ans==1)
			{
				hm.put(word, 1);
				return 1;
			}
			}
	
		}
		hm.put(word,0);
		return 0;
		
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			HashSet<String>set=new HashSet<String>();
			scan.nextLine();
			for(int j=0;j<n;j++)
			{
				String s=scan.nextLine();
				set.add(s);
			}
			String word=scan.nextLine();
			init();
			int ans=wbreak(set,word);
			if(ans==1)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
				
			}
		}

	}





}
