class UneryOperator
{
	public static void main(String[] arg)
	{
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);
	}
}

/*
1) i = 11(12) + (12)13

2) a = 11, b = 22
c = 11 + 22 + 11(12) + 22(23) + (12)13 + (23)24 = 103
ans a = 13, b = 24, c = 103

3) i = 0
 i = 0(1) - (1)0 + (0)1 - 1(0) = 0

4) boolean b = true;
b++
println(b)
 compilation error

5) i = 1, j = 2, k = 3
m = 1(0) - 2(1) - 3(2) = -4

6) a = 1, b=2
(--b - ++a + ++b - --a) = (2)1 - (1)2 + (1)2 - (2)1 = 0

7) i = 19, j = 29, k;
k = 19(18) - 18(19) + (29)28 - (28)29 + (19)18 - 29(28) + (18)19 - 28(29)

8) int i = 11;
int j = --(i++);

here we are trying to do -- operation on result of i++ which is a value and 
not a modifiable variable, this is not allowed

9) int m = 0, n = 0;
int p = --m * --n * n-- * m-- = (0)-1 * (0)-1 *  -1(-2) * -1(-2)  = 1

10) int a =1
a = 1(2) + (2)3 * (3)2 - 2(1) = 5

11) int a = 11++;
print(a) = error 

12) int m = 1010, n = 1010;
 1010(1011)/(1010)1011 * 1011(1010) / (1011)1010 = 0 because 1010/1011 gives 0 as
division

13)

14) int ch = 'A'
println(ch++) = 65 while ch becomes 66 as
*/