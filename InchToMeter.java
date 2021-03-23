/*38. Implement a Java program that reads a number in inches, converts it to meters(CLA)*/

class InchToMeter{

	public static void main(String[] args) 
	{
		int inch=Integer.parseInt(args[0]);
		float meter;
		meter=(float)(0.0254*inch);
		System.out.println(inch+" = "+meter+" in meters");
		
	}
	
}

