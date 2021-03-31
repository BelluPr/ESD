/*41. Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and 
display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/

import java.util.Scanner;

class Speed{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the distance in meter");
	double distance = sc.nextDouble();
	System.out.println("Enter the time in hour");
	int hour = sc.nextInt();
	System.out.println("Enter the time in min");
	int min = sc.nextInt();
	System.out.println("Enter the time in second");
	int sec = sc.nextInt();


	double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
	double mps = distance/ totalSec;
	double kmph = 3.6 * mps;
	double mph = 2.23694 * mps;
	System.out.println("mps : "+mps+" kmph : "+kmph+" mph : "+mph);
}
}
