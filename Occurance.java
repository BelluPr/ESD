/*44.java program to count the repeted occurance of a digit in a n-digit number.*/
import java.util.Scanner;
class Occurance{
int a,b;
void repeat(int x, int y)
{
int count=0, r=0;
a = x;
b = y;
while(a!=0)
{
r = a%10;
a = a/10;
if(r==b)
{
count++;
}
}
System.out.println("Count "+count);
}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	System.out.println("Enter the digit to be checked");
	int n1 = sc.nextInt();
	Occurance o1 = new Occurance();
	o1.repeat(n,n1);
}
}