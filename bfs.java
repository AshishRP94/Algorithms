package cp_algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
	static class trio
	{
		int steps;
		int y;
		int z;
		trio(int steps ,int y,int z)
		{
			this.steps=steps;
			this.y=y;
			this.z=z;
		}
		
		
		
	}
	
	private static int _bfs(int[][] puzzle)
	{
		   Queue<trio> queue = new LinkedList<>();
		   
		   boolean [][]visited=new boolean[puzzle.length][puzzle[0].length];
		   queue.add(new trio(0,0,0));
		   int []di= {-1,0,1,0};
		   int []dj= {0,1,0,-1};
		   
		   
		   
		   while(true)
		   {
			   if(queue.isEmpty()==true)
			   {
				   break;
			   }
			   trio t=queue.poll();
			  int i= t.y;
			  int j= t.z;
			  
			  for(int k=0;k<di.length;k++)
			  {
				  int t1=i+di[k];
				  int t2=j+dj[k];
				
				  if( isvalid(t1,t2,puzzle.length,puzzle[0].length,puzzle)==true && (visited[t1][t2]==false))
				  {
					  visited[t1][t2]=true;
					  if(puzzle[t1][t2]==2) 
					  {
						  return t.steps+1;
					  }
					  queue.add(new trio(t.steps+1,t1,t2));
					  
					  
					  
				  }
				  
				  
			  }
			
			   
			   
			   
		   }
		   
		   
		return -1;
		
		
	}
	
	
	private static boolean isvalid(int i, int j, int length, int length2, int[][] puzzle)
	{
		if(i<0 ||i>puzzle.length ||j<0 ||j>puzzle[0].length ||puzzle[i][j]==0)
		{
			return false;
		}
		
		return true;
		
	}


	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			int [][]puzzle=new int[n][m]; 
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<m;k++)
				{
					puzzle[j][k]=scan.nextInt();
				}
			}
			_bfs(puzzle);
		}

	}



}
