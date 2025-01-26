/* Q3. WAP to replace all the 0’s with 1’s in your array. Your array is 
[26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34] */

public class Question3
{
	public static void main(String arg[])
	{
		int a[] = {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == 0)
			{
				a[i] = 1;
			}
		}

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		
	}
}

