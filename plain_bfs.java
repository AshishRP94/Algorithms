package cp_algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class plain_bfs
{
	static class pair
	{
		int x;
		int y;
		pair(int x,int y)
		{
			this.x=x;
			this.y=y;
			
		}
	}
	
	
	private static void bfs(int[][] graphs)
	{
		Queue<pair> queue = new LinkedList<>();
		boolean [][]vgraphs=new boolean[graphs.length][graphs[0].length];
		queue.add(new pair(0,0));
		while(true)
		{
			if(queue.isEmpty()==true)
			{
				break;
			}
			
			pair p=queue.poll();
			System.out.println(""+p.x+" "+p.y);
			
			if((p.x+1>=0 && p.y>=0) &&(p.x+1<graphs.length && p.y<graphs[0].length) && vgraphs[p.x+1][p.y]==false)
			{
				queue.add(new pair(p.x+1,p.y));
				vgraphs[p.x+1][p.y]=true;
			}
			else if((p.x>=0 && p.y+1>=0) &&(p.x<graphs.length && p.y+1<graphs[0].length)  && vgraphs[p.x][p.y+1]==false)
			{
				queue.add(new pair(p.x,p.y+1));
				vgraphs[p.x][p.y+1]=true;
			
			}
			else if((p.x-1>=0 && p.y>=0) &&(p.x-1<graphs.length && p.y<graphs[0].length)&& vgraphs[p.x-1][p.y+1]==false)
			{
				queue.add(new pair(p.x-1,p.y));
				vgraphs[p.x-1][p.y]=true;
			
			}
			else
			{
				if((p.x>=0 && p.y-1>=0) &&(p.x<graphs.length && p.y-1<graphs[0].length)&& vgraphs[p.x][p.y-1]==false)
				{
					queue.add(new pair(p.x,p.y-1));
					vgraphs[p.x][p.y-1]=true;
				}

			}
			
			
		}
		
		
	}
	
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		int [][] graphs=new int[h][w];
		for(int i=0;i<h;i++)
		{
			
			for(int j=0;j<w;j++)
			{
				graphs[i][j]=scan.nextInt();
			}
		
		}
		
		bfs(graphs);
		
		
	}



}
