/*14.Implement a JAVA program to find the Mean of given 5 numbers. */
import java.util.Scanner;
class Mean{

	public float calMean(int a[])
	{
		int sum=0,i;
		for(i=0;i<5;i++)
		{
			sum+=a[i];
		}
		return ((float)sum)/5;

	}
	public static void main(String[] args) 
	{
		
		int[] a=new int[5];
		int i;
		Scanner sc =new Scanner(System.in);
		Mean m1= new Mean();
		System.out.println("Enter the five numbers to find mean");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The mean of the numbers="+m1.calMean(a));

	}
}