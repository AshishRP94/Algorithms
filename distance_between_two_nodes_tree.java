package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class distance_between_two_nodes_tree
{
	static int []levels;
	static int [][]parents;
	public distance_between_two_nodes_tree(int n)
	{
		levels=new int[n];
		parents=new int[n][18];
	}
	
	private static void dfs(ArrayList<Integer>[] trees, int child, int parent,int level)
	{
		if(levels[child]!=0)
		{
			levels[child]=level;
		}
		
		for(int i=1;i<18;i++)
		{
			int prevparent=parents[child][i-1];
			parents[child][i]=parents[prevparent][i-1];
		}
		
		
		for(int i=0;i<trees[child].size();i++)
		{
			int subchild=trees[child].get(i);
			if(subchild==parent)
			{
				
			}
			else
			{
				dfs(trees, subchild, child,level+1);
			}
		}
		
	}
	
	private static int kth_parent_node(int[][] parents, int diff, int node)
	{
		int count=0;
		while(true)
		{
			if(diff<=0)
			{
				break;
			}
			
			if((diff&1)==1)
			{
				node=parents[node][count];
			}
			diff=(diff>>1);	
			count+=1;
		}
		
		return node;		
	}
	
	
	private static int lca_bin_lifting(int[] levels, int[][] parents, int node1, int node2)
	{
		int n1l=levels[node1];
		int n2l=levels[node2];
		
		int node;
		
		int diff=0;
		if(n1l>n2l)
		{
			diff=n1l-n2l;
			node=n1l;
			node1=kth_parent_node(parents,diff,node);
			if(node1==node2)
			{
				return node1;
			}
			
			for(int i=17;i>=0;i++)
			{
				if(parents[node1][i]!=parents[node2][i])
				{
					node1=parents[node1][i];
					node2=parents[node2][i];
				}
				
			}
			return parents[node1][0];
		}
		else
		{
			diff=n2l-n1l;
			node=n2l;
			node2=kth_parent_node(parents,diff,node2);
			if(node2==node1)
			{
				return node2;
				
			}
			
			for(int i=17;i>=0;i--)
			{
				if(parents[node1][i]!=parents[node2][i])
				{
					node1=parents[node1][i];
					node2=parents[node2][i];
				}
				
			}
			return parents[node1][0];
		
		}
		
		
		
	
	
	
	
	
	}
	



	
	
	
	

	



	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("i"+i);
			int n=scan.nextInt();
			System.out.println("i"+i);
			distance_between_two_nodes_tree obj=new distance_between_two_nodes_tree(n);
			ArrayList<Integer>[]trees=new ArrayList[n];
			
			for(int j=0;j<trees.length;j++)
			{
				trees[j]=new ArrayList<Integer>();
			}
			
			for(int j=0;j<n-1-1;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				trees[u].add(v);
			}
			System.out.println("i"+i);
			dfs(trees,1,0,1);
			int node1=scan.nextInt();
			int node2=scan.nextInt();
			int ans=lca_bin_lifting(levels,parents,node1,node2);
			System.out.println(""+(levels[node1]+levels[node2]-2*levels[ans]));
			
		}

	}



}
