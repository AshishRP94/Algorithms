package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class tree_dfs_height {
	
	static int max_height=Integer.MIN_VALUE;
	private static void dfs(ArrayList<Integer>[] tree, int parent, int node, int height)
	{
		if(height>max_height)
		{
			max_height=height;
			
		}
		System.out.print(" "+node);
		for(int i=0;i<tree[node].size();i++)
		{
			int child=tree[node].get(i);
			if(child==parent)
			{
				
			}
			else
			{
				dfs(tree, node, child,height+1);
//				System.out.print(child+" ");
			}
			
		}
	}
	

	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++) 
		{
			int n=scan.nextInt();
			ArrayList<Integer>[]tree=new ArrayList[n+1];
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
			int svertex=1;
			dfs(tree,0,svertex,1);
			System.out.println(" "+max_height);
			
		}

	}



}

