/*13.Implement a JAVA program to find the max and min of given two numbers.*/
import java.util.Scanner;
class MaxMin
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		if(num1==num2)
		{
			System.out.println("Both are equal numbers");

		}
		else if (num1>num2) 
		{
			System.out.println("Maximum Number = "+num1);
			System.out.println("Miniimum Number = "+num2);

		}
		else
		{
			System.out.println("Maximum Number = "+num2);
			System.out.println("Miniimum Number = "+num1);
		}

		
	}

}