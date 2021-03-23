/*13.JAVA program to find the max and min of given two numbers.*/

import java.util.Scanner;
class MaxMin{
	public void maxmin(int a, int b)
	{
		if(a==b)
		{
			System.out.println("both numbers are equal");
			
		}
		else if(a>b)
		{
			System.out.println("Max of "+a+","+b+" = "+a);
			System.out.println("Min of "+a+","+b+" = "+b);
			
		}
		else
		{
			System.out.println("Max of "+a+","+b+" = "+b);
			System.out.println("Min of "+a+","+b+" = "+a);

		}
	}

public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int num1,num2;
	num1=sc.nextInt();
	num2=sc.nextInt();

	MaxMin m1=new MaxMin();
	m1.maxmin(num1,num2);
	
}
	
}