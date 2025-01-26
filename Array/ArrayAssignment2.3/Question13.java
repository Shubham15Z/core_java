/*
Q13. Write a Java program to find max number in an array.
*/


public class Question13
{
	public static void main(String arg[])
	{
		int [] a={9,1,3,5,6,11,22,66,10,19};
		int max = a[0];
		System.out.println("The array elements are : ");
		for(int j = 0; j < a.length; j++)	
		{
			System.out.print(a[j]+" ");
		}

		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}

		System.out.println();
		System.out.println("The max array element is : "+max);	
	}
}

