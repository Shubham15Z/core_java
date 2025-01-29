/*Q9.Wap input an array now delete  element from array, position is taken from user.*/

import java.util.Scanner;
public class Question9
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int a[] = new int [size];
		System.out.println("Enter the elements in array : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("The elements in array are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("Enter the element position to delete from the given array: ");
		int pos = sc.nextInt();
		for(int i = 0; i < a.length; i++)
		{
			if(i == pos-1)
			{
				a[i] = -1;
			}
		}

		System.out.println("The array after deleting element from given position is : ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}