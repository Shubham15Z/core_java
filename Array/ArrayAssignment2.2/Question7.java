/*
Q7.Write a java program to find prime number between an array of element.
*/
public class Question7
{
	public static void main(String arg[])
	{
		int a [] = {2,7,31,23,9,8,70,47};
		
		System.out.println("The prime numbers in array are : ");
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = 1 ; j <= a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}