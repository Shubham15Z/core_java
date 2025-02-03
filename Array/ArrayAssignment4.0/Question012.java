/*
Q12. Count pairs with given sum
nput:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input:  arr[] = {1, 5, 7, -1, 5}, sum = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
*/
public class Question012
{
	public static void main(String arg[])
	{
		int arr[] = {1, 5, 7, -1, 5};
		int sum = 6;
		System.out.println("The pair with sum = "+sum+" are :");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					System.out.println(arr[i]+", "+arr[j]);
				}
			}		
		}

		
	}
}