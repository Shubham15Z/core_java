/*Q13. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e.
 fill A with first p smallest elements and fill B with remaining elements.
 Example:
 Input :
 int[] A = { 1, 5, 6, 7, 8, 10 }
 int[] B = { 2, 4, 9 }
 Output:
 Sorted Arrays:
 A: [1, 2, 4, 5, 6, 7]
 B: [8, 9, 10]
*/
public class Question013
{
	public static void main(String arg[])
	{
		int[] A = { 1, 5, 6, 7, 8, 10 };
		int[] B = { 2, 4, 9 };
		
		int[] C = new int [A.length+B.length];

		for(int i = 0; i < A.length; i++)
		{
			C[i] = A[i];		
		}

		for(int i = 0; i < B.length; i++)
		{
			C[A.length+i] = B[i];
		}

		System.out.println("The Merged array is : ");
		for(int i = 0; i < C.length; i++)
		{
			System.out.print(C[i]+" ");
		}

		
	}
}