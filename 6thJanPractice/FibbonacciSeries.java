public class FibbonacciSeries

{
	public static void main(String args[])
	{
		int a = 0;
		int b = 1;

		System.out.print(a+" "+b);

		for(int i = 1; i <= 8; i++)
		{
			int c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}

		
	}
}


// 0 1 1 2 3 5 8 13 21 34

/*
here we have to print fibbonaci series from 0 to next 10 term
so initialize a = 0, b = 1
1st print a = 0, b = 1

so terms will be = 0 1

now for third term we need to iterate for next 8 terms

1st Iteration:
c = a+b = 0 + 1 = 1
swap the values of a with b and b with c
a = b (swap a first because value of b will get update once we put b = c) = 1
b = c = 1

2nd Iteration:
c= a+b = 1+1 = 2
a= b = 1
b= c = 2

3rd Iteration:
c = a+b = 1 + 2 = 3
a = b = 2
b = c = 3

4th Iteration:
c = a+b = 2 + 3 = 5
a = b = 3 
b = c =  5

*/