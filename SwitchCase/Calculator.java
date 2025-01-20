import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the operation to perform: "+
				    "\n 1)For addition enter +" +
				    "\n 2)For Substraction enter -" +
				    "\n 3)For Multiplication enter *" +
				    "\n 4)For Division enter /");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
			case '+': System.out.print("Addition of two numbers is: "+(n1+n2));
			break;
			case '-': System.out.print("Subtraction of two numbers is: "+(n1-n2));
			break;
			case '*': System.out.print("Multiplication of two numbers is: "+(n1*n2));
			break;
			case '/': System.out.print("Division of two numbers is: "+(n1/n2));
			break;
			default: System.out.println("Enter the Valid Operation to perform!!!");
			
		}
	}
}