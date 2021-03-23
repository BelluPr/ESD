/*4.Java Program to find the square of a number*/

import java.util.Scanner;
class SquareofNumber{

	static int SquareNo(int a)
	{
		return (a*a);

	}

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find its square");
		a=sc.nextInt();
		System.out.println("The Square of number "+a+"="+SquareNo(a));


	}
}