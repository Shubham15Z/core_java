import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		int rev = 0;
		
		int i = n1; //n1%10

		do
		{
			int rem = i%10;
			rev = rev*10 + rem;
			i = i/10;
		}while(i>0);
		System.out.println("Reverse of the number is: "+rev);
	}
}

/*
123

1st iteration
123%10 = 3
rev = 0*10 + 3 = 3
123/10 = 12

2nd iteration
12%10
rev = 3*10 + 2 = 32
12/10 = 1

3rd iteration
1%10 
rev = 32*10 + 1 = 321
1/10 = 0

*/

