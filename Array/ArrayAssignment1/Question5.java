/* Q5.WAP to check if an array of integers contains two specified elements. */

import java.util.Scanner;
public class Question5
{
	public static void main(String arg[])
	{
		int a[] = {55, 45, 60, 35, 50, 60, 20};
		Scanner sc = new Scanner(System.in);

		System.out.println("The array elements are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		System.out.println("Enter the 1st element to search : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd element to search : ");
		int n2 = sc.nextInt();

		boolean found1 = false;
		boolean found2 = false;

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == n1)
			{
				found1 = true;
			}
			if(a[i] == n2)
			{
				found2 = true;
			}
			if(found1 && found2)
			{
				break;
			}
		}

		if(found1 && found2) 
		{
            		System.out.println("Both the specified numbers i.e. "+n1+" and "+n2+" are present in the array.");
        	} 
		else if(found1) 
		{
            		System.out.println("Only the first number "+n1+" is present in the array.");
        	} 
		else if(found2) 
		{
            		System.out.println("Only the second number "+n2+" is present in the array.");
        	} 
		else 
		{
            		System.out.println("Both the specified numbers are not present in the array.");
        	}	
	}
}

