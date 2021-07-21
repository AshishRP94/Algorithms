package cp_algorithms;

//class Main 
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class binary_search_algo {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int j;
		int max = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
			if (max < arr[i]) 
			{
				max = arr[i];
			}

		}

		int low = 0;
		int high = max;
		long s = 0;
		int y = 0;
		while (low <= high) 
		{
			int mid = (low + high) / 2;
			int q = 0;
			s = 0;

			for (int i = 0; i < n; i++) 
			{
				s += Math.ceil((arr[i] / mid));
			}
			if (s <= k) 
			{
				q = 1;
				if (y < mid) 
				{
					y = mid;
				}
			}

			if (q == 0) 
			{
				low = mid + 1;

			} else {
				high = mid - 1;
			}

		}
		System.out.println(y);

	}
}
