/* Q10.Wap input an array and rotate it in anti clock wise by any no give by user. */

import java.util.Scanner;
public class Question10
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
		System.out.println("Enter the number of anti clock wise rotations : ");
		int r = sc.nextInt();

		for(int j = 1; j <= r; j++)
		{
			int temp = a[0];
			for(int i = 0; i < a.length-1; i++)
			{
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
		} 

		System.out.println("The elements in array after "+r+" rotaion are : ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}