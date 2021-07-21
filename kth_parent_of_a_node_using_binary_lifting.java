package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class kth_parent_of_a_node_using_binary_lifting
{
	
	static int [][]parents;
	public kth_parent_of_a_node_using_binary_lifting(int n)
	{
		parents=new int[n][18];
	}
	
	private static void dfs(ArrayList<Integer>[] tree, int child, int parent)
	{
		for(int i=0;i<18;i++)
		{
			parents[child][i]=parents[parents[child][i-1]][i-1];//we are using previous parent to find current parent
		}
		
		for(int i=0;i<tree[child].size();i++)
		{
			int subchild=tree[child].get(i);
			if(subchild==parent)
			{
				
			}
			else
			{
				dfs(tree, subchild, child);
			}
		}
		
		
	}
	
	private static void find_kth_parent(int[][] parents, int k, int child)
	{
		int count=0;
		while(true)
		{
			if(k<=0)
			{
				break;
			}
			if((k&1)==1)
			{
				child=parents[child][count];
			}
		
				k=(k<<1);
				count+=1;
				
			
			
		}
		System.out.println(" "+child);
		
		
		
		
	}

	
	
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			kth_parent_of_a_node_using_binary_lifting  obj=new kth_parent_of_a_node_using_binary_lifting (n+1);
			ArrayList<Integer>[]tree=new ArrayList[n+1];
			for(int j=0;j<tree.length;j++)
			{
				tree[j]=new ArrayList<Integer>();
			}
			for(int j=0;j<n-1;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				tree[u].add(v);
			}
			dfs(tree,1,0);
			int k=scan.nextInt();
			int child=scan.nextInt();
			find_kth_parent(parents,k,child);
		}
		
	}




}
