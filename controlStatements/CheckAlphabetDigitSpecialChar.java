import java.util.Scanner;

public class CheckAlphabetDigitSpecialChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("It is an Alphabet");
		}
		else if(ch >= '0' && ch <= '9')
		{
			System.out.println("It is a Digit");
		}
		else
		{
			System.out.println("It is a Special Character");
		}
	}
}