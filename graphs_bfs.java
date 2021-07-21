package cp_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graphs_bfs
{
	static boolean []graphsv;
	
	private static void init(int n)
	{
		graphsv=new boolean[n];
		
	}
	
	private static void graph_bfs(ArrayList<Integer>[] graphs, int nodep)
	{
        Queue<Integer> queue = new LinkedList<Integer>(); 
		queue.add(nodep);
		graphsv[1]=true;
        while(true)
		{
			if(queue.size()==0)
			{
				break;
			}
			int childp=queue.poll();
			for(int i=0;i<graphs[childp].size();i++)
			{
				
				int subchild=graphs[nodep].get(i);
				if(graphsv[subchild]==true)
				{
					
				}
				else
				{
					queue.add(subchild);
					graphsv[i]=true;
				}
			}
			
		}
		
	}
	
	private static void driver(ArrayList<Integer>[] graphs)
	{
		for(int i=1;i<graphs.length;i++)
		{
			if(graphsv[i]==false)
			{
				graph_bfs(graphs, i);
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
			init(n);
			ArrayList<Integer>[]graphs=new ArrayList[n+1];
			for(int j=0;j<graphs.length;j++)
			{
				graphs[j]=new ArrayList<Integer>();	
			}
			int connections =scan.nextInt();
			for(int j=0;j<connections;j++)
			{
				int u=scan.nextInt();
				int v=scan.nextInt();
				graphs[u].add(v);
				driver(graphs);
				
			}
		}

	}





}
