/*17.Find the distance between two points, using euclidean distance.*/

import java.util.Scanner;

class Euclid
{
	public double dist(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
	}
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	Euclid e= new Euclid();

    	System.out.println("Enter the (x,y) co-ordinates of first point");
    	int x1=sc.nextInt();
    	int y1=sc.nextInt();
    	System.out.println("Enter the (x,y) co-ordinates of Second point");
    	int x2=sc.nextInt();
    	int y2=sc.nextInt();

    	System.out.print("The distance between"+"("+x1+","+y1+")"+" and "+"("+x2+","+y2+") =");
    	System.out.print(e.dist(x1,y1,x2,y2));
    }
}


