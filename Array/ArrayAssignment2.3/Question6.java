/*
Q6.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}
*/

public class Question6
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		int b[]={1,2,3,4,5};
		int c[] = new int [a.length+b.length];
	
		for(int i = 0; i <a.length; i++)
		{
			c[i*2] = a[i];
			c[i*2+1] = b[b.length-1-i];
		}

		for(int i = 0; i <c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}