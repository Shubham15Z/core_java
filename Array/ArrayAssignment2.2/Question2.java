/*
Q2. Write a Java program to remove the duplicate elements of a given array and print the new length of the array.
    Sample array: [20, 20, 30, 40, 50, 50, 50]
    After removing the duplicate elements the program should return 4 as the new length of the array
*/

public class Question2
{
	public static void main(String arg[])
	{
		int a[] = {20, 20, 30, 40, 50, 50, 50};

		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					a[j] = -1;
				}
			}
		}

		int length=0;
		System.out.println("The unique array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+" ");
				length++;
			}
		}
		System.out.println();
		System.out.println("The length of new array is : "+length);
	}
}