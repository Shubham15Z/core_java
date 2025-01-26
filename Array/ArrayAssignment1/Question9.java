/* Q9. WAP to replace all negative value with its immediate left elements square. Means
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9]
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49] */

public class Question9
{
	public static void main(String arg[])
	{
		int arr[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};

		System.out.println("The given array is : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < 0)
			{
				arr[i] = (arr[i-1]*arr[i-1]);
			}
		}

		System.out.println();
		System.out.println("The new array is : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}

