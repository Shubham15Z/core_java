/*
Q2.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
   the element that occurs more than once and whose index of the first occurrence is the smallest.
*/

public class Question2
{
	public static void main(String arg[])
	{
		int a[] = {1,3,83,45,6,7,9,2,6,7,2};
		int c = 0;

		System.out.println("The index of 1st reapeting element is : ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(i);
					c++;
					break;
				}
			}
			if(c > 0)
			{
				break;
			}
		}
	}
}