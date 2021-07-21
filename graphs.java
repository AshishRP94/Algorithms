package cp_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class graphs 
{
	static class edge
	{
		int x=0;
		int y=0;
		edge(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	
	}
	
	private static void bfs(ArrayList<edge>[] graphs)
	{
		graphs[0].get(0).x;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int v=scan.nextInt();
			ArrayList<edge>[]graphs=new ArrayList[v];//graphs of array of arraylist of edges
			for(int j=0;j<graphs.length;j++)
			{
				graphs[i]=new ArrayList<edge>();
			
			}
			int e=scan.nextInt();
			for(int j=0;j<e;j++)
			{
				int x=scan.nextInt();
				int y=scan.nextInt();
				graphs[x].add(new edge(x,y));
			}
			
			bfs(graphs);
			
		}
		
	}



	}

}
