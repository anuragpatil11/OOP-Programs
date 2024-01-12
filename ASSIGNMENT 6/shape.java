import java.util.*;

abstract public class shape {
	
	protected double x;
	protected double y;
	
	public void getdata()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("x: ");
		x= sc.nextDouble();
		
		System.out.print("y: ");
		y= sc.nextDouble();	
	}
	abstract public void compute_area();
//	{
//		System.out.print(" ");
//		
//	}

}
