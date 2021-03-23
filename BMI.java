/*40.Java program to compute body mass index (BMI).*/

import java.util.Scanner;
import java.lang.Math; 


class BMI
{
	public static void main(String[] args) {
		float w,h;
		double bmi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height in meter");
		h=sc.nextFloat();
		System.out.println("Enter the weight in kgs");
		w=sc.nextFloat();
		bmi=w/(h*h);

		System.out.println("BMI = "+bmi+"\n\n");
		System.out.println("BMI <16 "+"severely underweight");
		System.out.println("16 <= BMI < 18.5  "+"underweight");
		System.out.println("18.5 <= BMI < 25  "+"Healthy");
		System.out.println("25 <= BMI < 30  "+"Overweight");
		System.out.println("BMI >=30 "+"severely Overweight");

	}
}


	






