/*Q9.Union and Intersection of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output: Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10}
Output: Union : {2, 4, 5, 6, 8, 10}
         Intersection : {6}
*/

public class Question9
{
	public static void main(String arg[])
	{
		int arr1[] = {1, 3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6};
		int i = 0, j = 0;
		
		System.out.println("The Union  elements are : ");
		while(i < arr1.length && j <arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				System.out.print(arr2[j]+" ");
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}		
		}
		while(i < arr1.length)
		{
			System.out.print(arr1[i]+" ");
			i++;
		}
		while(j < arr2.length)
		{
			System.out.print(arr2[j]+" ");
			j++;
		}

		System.out.println();
		System.out.println("The Intersection elements are : ");
		i = 0; j = 0;
		while(i < arr1.length && j <arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}		
		}
	}
}