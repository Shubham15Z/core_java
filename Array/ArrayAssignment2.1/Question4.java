/* Q4. Wap enter an array and find the second max element.*/

public class Question4
{
	public static void main(String arg [])
	{
		int a[] = {9, 15, 10, 12, 5, 8, 4, 2, 3, 7};

		int max = a[0];
		int secMax = a[1];

		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max)
			{
				secMax = max;
				max = a[i];
			}
			else if(a[i] > secMax && a[i] != max)
			{
				secMax = a[i];
			}
		}
		System.out.println("The maximum element is : "+max);
		System.out.println("The second max element is : "+secMax);


		/*
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
		System.out.println("The second max number is "+a[a.length - 2]);
		*/
	}
}