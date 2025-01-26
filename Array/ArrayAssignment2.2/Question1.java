/*Q1.Write a Java program to check if an array of integers without 0 and -1.*/

public class Question1
{
	public static void main(String arg[])
	{
		int a[] = {23, 5, 4, 7, 2};
		
		boolean present = false;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == 0 || a[i] == -1)
			{
				present = true;
				
			}
		}
		if(present)
		{
			System.out.println("The array of integers contains 0 or -1");
		}
		else
		{
			System.out.println("The array of integers does not contain 0 or -1");
		}	
				

		
	}
}

