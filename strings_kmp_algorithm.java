package cp_algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class strings_kmp_algorithm {
	
	static class FastReader
	{
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	static int []lps;
	
	private static void prefix(String s)
	{
		lps=new int[s.length()];
		int len=0;
		int i=1;//beacause first element is always 0 ie lps[0]=0
		while(true)
		{
			if(i>=s.length())
			{
				break;
			}
			
			if(s.charAt(i)==s.charAt(len))
			{
				len+=1;
				lps[i]=len;
				i+=1;
			}
			else
			{
				if(len!=0)
				{
					len=lps[(len-1)];//twister line ,rest is easy
					
				}
				else
				{
					lps[i]=0;
					i+=1;
					
				}
			}
			
			
		}
		
	}

	
	
	private static void kmp(String s, String p)
	{
		prefix((p+"$"+s));
		int count=0;
		ArrayList<Integer>index =new ArrayList<Integer>();
		for(int i=0;i<lps.length;i++)
		{
			if(lps[i]==p.length())
			{
				count+=1;
				index.add((i-(p.length()-1)));
			}
		}
		
		if(count==0)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println(count);
			for(int i=0;i<index.size();i++)
			{
				System.out.println((index.get(i)+1)+" ");
			}
		}
		
	}

	




	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=scan.nextLine();
			String p=scan.nextLine();
			kmp(s,p);
		}
		

	}
	
//	1/*
//	ababab 
//	ab*/
	
	
}
