package cp_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class trees_bfs
{
	static class pair
	{
		int node=0;
		int parent=0;
		
		pair(int node,int parent)
		{
			this.node=node;
			this.parent=parent;
		}
	}
	
	private static void bfs(ArrayList<Integer>[] tree)
	{
		 Queue<pair> queue= new LinkedList<>();
		 queue.add(new pair(1,0));
		 
		 
		 while(true)
		 {
			 if(queue.isEmpty()==true)
			 {
				 break;
			 }
			 pair p=queue.poll();
			 System.out.println(" "+p.node);
			 for(int i=0;i<tree[p.node].size();i++)
			 {
				 if(p.parent==tree[p.node].get(i))
				 {
					 
				 }
				 else
				 {
					 queue.add(new pair(tree[p.node].get(i),p.node));
				}
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
			ArrayList<Integer>[]tree=new ArrayList[n+1];//array of arraylist
			for(int j=0;j<n;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				tree[u].add(v);
				tree[v].add(u);
			}
			bfs(tree);
		
		}

	}


}
