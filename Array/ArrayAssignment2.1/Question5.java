/* Q5. Wap enter an array and find the second min element. */

public class Question5
{
	public static void main(String arg [])
	{
		int a[] = {9, 15, 10, 12, 5, 8, 4, 2, 3, 7};
		/*
		int min = a[0];
		int secMin = a[1];

		for(int i = 1; i < a.length; i++)
		{
			if(a[i] < min)
			{
				secMin = min;
				min = a[i];
			}
			else if(a[i] < secMin && a[i] != min)
			{
				secMin = a[i];
			}
		}
		System.out.println("The minimum element is : "+min);
		System.out.println("The second minimum element is : "+secMin);
		
		*/
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("The second min number is "+a[1]);	
	}
}