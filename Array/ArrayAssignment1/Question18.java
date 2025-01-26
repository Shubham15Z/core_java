/* Q18 Wap enter an array and print element present at even position and also find count.*/

import java.util.Scanner;
public class Question18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int a[] = new int [size];

		System.out.println("Enter the elements : ");

		for(int i = 0; i <= a.length - 1; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("The elements in array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The even position elements in array are :");
		int evenPosCount = 0;
		for(int i = 0; i <= a.length - 1; i++)
		{
			int pos = i+1;
			if(pos % 2 == 0)
			{
				System.out.print(a[pos-1]+" ");
				evenPosCount++;
			}
		}
		System.out.println();
		System.out.println("The count of even position numbers in array is : "+evenPosCount);		
	}
}