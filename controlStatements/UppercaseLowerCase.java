import java.util.Scanner;

public class UppercaseLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("It is in Uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("It is in Lowercase");
		}
		else
		{
			System.out.println("It is not a Alphabet");
		}
	}
}