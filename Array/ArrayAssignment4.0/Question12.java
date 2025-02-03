/*
Q12.Given a sorted array with possibly duplicate elements. The task is to
find indexes of first and last occurrences of an element X in the given 
array.
Note: If the element is not present in the array return {-1,-1} as pair.
Example 1:
Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.
*/

public class Question12
{
	public static void main(String arg[])
	{
		int v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int x = 5;
		int first = -1, last = -1;

		for(int i = 0; i < v.length; i++)
		{
			if(v[i] == x)
			{
				if(first == -1)
				{
					first = i;
				}
				last = i;
			}
		}
		System.out.print(first+", "+last);
	}
}