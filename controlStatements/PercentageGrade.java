import java.util.Scanner;

public class PercentageGrade
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in Physics:");
		int n1 = sc.nextInt();
		System.out.println("Enter the marks in Chemistry:");
		int n2 = sc.nextInt();
		System.out.println("Enter the marks in Biology:");
		int n3 = sc.nextInt();
		System.out.println("Enter the marks in Mathematics");
		int n4 = sc.nextInt();
		System.out.println("Enter the marks in Computer:");
		int n5 = sc.nextInt();
		
		int p = (n1+n2+n3+n4+n5)/5;
		if(p >= 90)
		{
			System.out.println("Grade A : "+p+"%");
		}
		else if(p>=80 && p<90)
		{
			System.out.println("Grade B : "+p+"%");
		}
		else if(p>=70 && p<80)
		{
			System.out.println("Grade c : "+p+"%");
		}
		else if(p>=60 && p<70)
		{
			System.out.println("Grade D : "+p+"%");
		}
		else if(p>=40 && p<60)
		{
			System.out.println("Grade E : "+p+"%");
		}
		else
		{
			System.out.println("Grade F : "+p+"%");
		}
	}
}