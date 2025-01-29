import java.util.Scanner;
public class Question14
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
		int arr[] = new int [a.length];
		System.out.println("Enter the element to insert : ");
		int ele = sc.nextInt();
		System.out.println("Enter the position, where to insert : ");
		int pos = sc.nextInt();

		for(int i = 0; i < arr.length; i++)
		{
			if(i == pos-1)
			{
				arr[i] = ele;
			}
			else
			{
				arr[i] = a[i];
			}
		}

		System.out.println("The array elements after inserting new element: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");	
		}
	}
}