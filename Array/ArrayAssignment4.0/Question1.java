/*1.Write a Java program to find maximum product of two integers in a 
given array of integers.
*/

public class Question1
{
	public static void main(String srg[])
	{
		int a[] = {4,8,3,9,2};

		int max = 0, secMax = 0;

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				secMax = max;
				max = a[i];
			}
			else if(a[i] > secMax && secMax != max)
			{
				secMax = a[i];
			}
		}
		System.out.println("The maximum product of two integers is : "+(max*secMax));
	}
}