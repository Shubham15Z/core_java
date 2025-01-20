import java.util.Scanner;

public class PersonAge
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age please: ");
		int age = sc.nextInt();

		if(age>50)
		{
			System.out.println("You are a Senior, Thank you!!!!");
		}
		else if(age>20 && age<=50)
		{
			System.out.println("You are an Adult");
		}
		else if(age>11 && age<=20)
		{
			System.out.println("You are a Teenager");
		}
		else
		{
			System.out.println("You are a Child");
		}
	}
}