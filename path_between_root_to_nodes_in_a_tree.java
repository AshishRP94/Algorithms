package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class path_between_root_to_nodes_in_a_tree 
{
	static int []parents;
	public path_between_root_to_nodes_in_a_tree(int n)
	{
		parents=new int[n];
	}
	
	
	private static void dfs(ArrayList<Integer>[] trees, int child, int parent)
	{
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
			parents[subchild]=child;
			if(subchild==parent)
			{
			
			
			}
			else
			{
				dfs(trees,subchild,child);
			}
		}
		
		
		
	}
	
	
	private static void find_path(int[] parents, int node1) 
	{
		ArrayList<Integer>path=new ArrayList<Integer>();
		while(true)
		{
//			System.out.println("node1="+node1);
			if(node1==1)
			{
				break;
			}
			int newnode=parents[node1];
//			System.out.println("newnode="+newnode);
			path.add(newnode);
			node1=newnode;
		}
		
		for(int i=path.size()-1;i>=0;i--)
		{
			System.out.println(" "+path.get(i));
		}
	
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			ArrayList<Integer>[]trees=new ArrayList[n+1];
			for(int j=0;j<trees.length;j++)
			{
				trees[j]=new ArrayList<Integer>();
			}
			
			path_between_root_to_nodes_in_a_tree obj=new path_between_root_to_nodes_in_a_tree(n+1);
			for(int j=0;j<n-1;j++)
			{
			int u=scan.nextInt();
			int v=scan.nextInt();
			trees[u].add(v);
			}
			dfs(trees,1,0);
			System.out.println("tree created");
			for(int j=0;j<parents.length;j++)
			{
				System.out.print(" "+parents[j]);
			}
			
			int queries=scan.nextInt();
			for(int j=0;j<queries;j++)
			{
				int node1=scan.nextInt();
				find_path(parents,node1);
			}
		}

	}






}
