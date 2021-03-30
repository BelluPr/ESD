/*46. Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid
e)rhombus f) triangle*/

import java.util.Scanner;
class Area{
	
	public double circleArea(float radius)
	{
		return (2*3.142*radius);
	}

	public double rectangleArea(float l, float b)
	{
		return (l*b);
	}

	public double squareArea(float l)
	{
		return (l*l);
	}

	public double triangleArea(float base, float height)
	{
		return (0.5*base*height);
	}

	public double trapezoidArea(float sideA, float sideB,float height1)
	{
		return ((sideB+sideA)/2)*height1;
	}


	public double rhombusArea(float diag1, float diag2)
	{
		return ((diag2*diag1)/2);
	}

	public static void main(String[] args) {
		Area a= new Area();

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the radius of circle");
		float radius= sc.nextFloat();
		System.out.println("Area of Circle with radius "+radius+" = "+a.circleArea(radius));

		System.out.println("Enter the two sides of rectangle");
		float side1= sc.nextFloat();
		float side2= sc.nextFloat();
		System.out.println("Area of Rectangle with sides "+side1+" and "+side2+" = "+a.rectangleArea(side1,side2));

		System.out.println("Enter the length of a square");
		float side3= sc.nextFloat();
		System.out.println("Area of Sqaure with side "+side3+" = "+a.squareArea(side3));

		System.out.println("Enter the height and breadth of a triangle");
		float h= sc.nextFloat();
		float b= sc.nextFloat();
		System.out.println("Area of Triangle with height "+h +" and breadth "+b+" = "+a.triangleArea(h,b));

		System.out.println("Enter the Side A, Side B and Height of the trapezoid");
		float a1= sc.nextFloat();
		float b1= sc.nextFloat();
		float h1= sc.nextFloat();
		System.out.println("Area of trapezoid "+" = "+a.trapezoidArea(a1,b1,h1));

		System.out.println("Enter the Diagonal lengths of the Rhombus");
		float d1= sc.nextFloat();
		float d2= sc.nextFloat();
		
		System.out.println("Area of Rhombus "+" = "+a.rhombusArea(d1,d2));





	}
}