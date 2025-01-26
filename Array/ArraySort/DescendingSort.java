public class DescendingSort
{
	public static void main(String arg [])
	{
		int a[] = {15, 12, 5, 8, 4, 2, 3, 7};

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}