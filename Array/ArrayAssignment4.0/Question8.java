/*8. Move all negative numbers to beginning and positive to end with 
constant extra space
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/

public class Question8
{
	public static void main(String arg[])
	{
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int left = 0, right = arr.length-1;

		while(left < right)
		{
			while(left < arr.length && arr[left] < 0)
			{
				left++;
			}
			
			while(right >= 0 && arr[right] > 0)
			{
				right--;
			}

			if(left < right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

		//System.out.println("The "+k+" th Smallest element is : "+arr[k-1]);
	}
}