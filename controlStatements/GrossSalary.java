import java.util.Scanner;

public class GrossSalary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary:");
		int sal = sc.nextInt();
		int grosssal = 0;

		if(sal>0 && sal<=10000)
		{
			grosssal = sal + (sal*20/100) + (sal*80/100);
			System.out.println("Gross salary is : "+grosssal);
		}
		else if(sal>10000 && sal<=20000)
		{
			grosssal = sal + (sal*25/100) + (sal*90/100);
			System.out.println("Gross salary is : "+grosssal);
		}else if(sal>20000)
		{
			grosssal = sal + (sal*30/100) + (sal*95/100);
			System.out.println("Gross salary is : "+grosssal);
		}
		else
		{
			System.out.println("Enter Valid salary");
		}
	}
}