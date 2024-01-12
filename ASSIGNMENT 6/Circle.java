import java.util.Scanner;

public class Circle extends shape {
	
	public void getdata()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("x: ");
		x= sc.nextDouble();
		
	}
	public void compute_area()
	{
		double area= 3.14*x*x;
		System.out.print("the AREA of CIRCLE is "+area+"\n");
	}

}
