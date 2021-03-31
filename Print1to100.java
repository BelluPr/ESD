/*43. Implement a java program to print 1 to 100 without using numbers in the program*/
public class Print1to100 {
int k;


	public static void main(String[] args) 
	{
		int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}
}