package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class lca_trees
{
	
	static int []parents;
	public lca_trees(int n)
	{
		parents=new int[n];
	}
	private static void dfs(ArrayList<Integer>[] trees, int child, int parent)
	{
		parents[child]=parent;
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
			if(subchild==parent)
			{
				
			}
			else
			{
				dfs(trees,subchild,child);
			}
			
		}
		
		
	}
	
	private static ArrayList<Integer> find_path(int[] parents, int node1)
	{
		ArrayList<Integer>path=new ArrayList<Integer>();
		while(true)
		{
			if(node1==1)
			{
				break;
			}
			node1=parents[node1];
			path.add(node1);
			
		}
		
		return path;
		
		
	}
	
	private static void lca(ArrayList<Integer> path1, ArrayList<Integer> path2)
	{
		int len=0;
		if(path1.size()>path2.size())
		{
			len=path1.size();	
		}
		else
		{
			len=path2.size();		
		}
		
		int llca=0;
		for(int i=len-1;i>=0;i--)
		{
			if(path1.get(i)==path2.get(i))
			{
				llca=path1.get(i);
			}
		}
		
		System.out.println(" "+llca);
		
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			lca_trees obj=new lca_trees(n);
			ArrayList<Integer>[]trees=new ArrayList[n];
			
			for(int j=0;j<trees.length;j++)
			{
				trees[j]=new ArrayList<Integer>();
			}
			
			for(int j=0;j<n;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				trees[u].add(v);
			}
			dfs(trees,1,0);
			int node1=scan.nextInt();
			int node2=scan.nextInt();
			ArrayList<Integer> path1=find_path(parents,node1);
			ArrayList<Integer> path2=find_path(parents,node2);
			lca(path1,path2);
		}
		

	}





}
