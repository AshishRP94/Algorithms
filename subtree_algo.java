package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class subtree_algo
{
	
	static long []subtree=new long[100000]; 
	private static void subtree(ArrayList<Integer>[] tree, int node, int parent)
	{
	    long sum=0;
		for(int i=0;i<tree[node].size();i++)
		{
			if(tree[node].get(i)==parent)
			{
				
				
			}
			else
			{
				subtree(tree, tree[node].get(i), node);
				int subchild=tree[node].get(i);
				sum+=subtree[subchild];				
			}
			
		}
		subtree[node]=1+sum;
		
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			ArrayList<Integer>[]tree=new ArrayList[n];
			for(int j=0;j<tree.length;j++)
			{
				tree[j]=new ArrayList<>();
				
			}
			
			for(int j=0;j<n-1;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				tree[u].add(v);
				tree[v].add(u);
				
			}
			subtree(tree,1,0);
			
		}

	}



}
