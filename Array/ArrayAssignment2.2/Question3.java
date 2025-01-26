/*Q3.Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
   Sample array: [1,2,4,5,6]
   Target value: 6.*/

public class Question3
{
	public static void main(String arg[])
	{
		int a[] = {1,2,4,5,6};
		int target = 6;

		System.out.println("The pairs are : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j] == target)
				{
					System.out.println(a[i]+", "+a[j]);
				}
			}
		}	
	}
}

