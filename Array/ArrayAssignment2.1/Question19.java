/*Q19.a[]={10,20,30,40,50}   b[]={1,2,3,4,5}
 output array=c[]={10,5,20,4,30,3,40,2,50,1}*/


public class Question19
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {1,2,3,4,5};
		int c[] = new int [a.length+b.length];
		
		System.out.println("The elements in 1st array are :");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.println();
		System.out.println("The elements in 2nd array are :");
		for(int i = 0; i <= b.length - 1; i++)
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		for (int i = 0; i < a.length; i++) 
		{
            		c[2 * i] = a[i];        
            		c[2 * i + 1] = b[b.length - 1 - i]; 
       		}
		System.out.println();
		System.out.println("The elements in 3rd array are :");
		for(int i = 0; i <= c.length - 1; i++)
		{
			System.out.print(c[i]+" ");
		}	
	}
}