
/*19.Java program to calculate the Binomial Coefficient of two positive numbers.*/

import java.util.Scanner;
class BinomialCo
{
static int binomialCoeff(int n, int k)
{
int C[] = new int[k + 1];
C[0] = 1;
for (int i = 1; i <= n; i++)
{
for (int j = Math.min(i, k); j > 0; j--)
C[j] = C[j] + C[j - 1];
}
return C[k];
}
public static void main(String[] args)
{
	System.out.println("Enter the two numbers");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int k= sc.nextInt();
	System.out.printf("Value of C(%d, %d) is %d ", n, k,
	binomialCoeff(n, k));
}
}