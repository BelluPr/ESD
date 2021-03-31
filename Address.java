
/*48. Implement a java program to find the memory size in bytes given the input as address length. */

import java.util.Scanner;

class Address
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting address");

		int StartAddr = sc.nextInt();
		System.out.println("Enter the Ending address");

		int EndAddr = sc.nextInt();
		int bytes = (EndAddr - StartAddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}