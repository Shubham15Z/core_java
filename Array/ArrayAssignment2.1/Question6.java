/* Q6. Wap enter an array and find max and min element. */

public class Question6
{
	public static void main(String arg [])
	{
		int a[] = {9, 15, 10, 12, 5, 8, 4, 2, 3, 7};
		int max = a[0];
		int min = a[0];
	
		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();

		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}

			if(a[i] < min)
			{
				min = a[i];
			}
		}

		System.out.println("The maximum of array element is : "+max);
		System.out.println("the minimum of array element is : "+min);
	}
}