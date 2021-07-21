package cp_algorithms;

import java.util.Scanner;

public class fermets_little_theorem 
{
	private static int fermets(int base, int power, int mod)
	{
		int res=1;
		while(power>0)
		{
			if((power&1)==1)
			{
				res=(res*base)%mod;
				power-=1;
			}
			else
			{
				base=(base*base)%mod;
				power/=2;
			}
		}
		return res;
	}
	
	
	public static void main(String args[])
	{
		//note:ferments little theorem is used while dividing two number in modular arthmetic
		Scanner scan=new Scanner(System.in);
		int mod=1000000007;//or 1e9+7;
		int y=scan.nextInt();
		int z=scan.nextInt();
		int ans=(fermets(z,mod-2,mod));
		System.out.println(" "+ans);
		int x=(y/ans);
		System.out.println(" "+x);
	}



}
