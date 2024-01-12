import java.util.*;
public class shape_main {

	public static void main(String[] args) {
		
		int n;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("enter 1 for area of circle: ");
			System.out.println("enter 2 for area of TRIANGLE: ");
			System.out.println("enter 3 for area of RECTANGLR: ");
			System.out.println("enter 4 for EXIT: ");
			n=sc.nextInt();
		switch(n)
		{
		case 1:
			Circle circle = new Circle();
			circle.getdata();
			circle.compute_area();
			break;
			
		case 2 :
			Triangle triangle = new Triangle();
			triangle.getdata();
		    triangle.compute_area();
		    break;
		    
		case 3:
			Rectangle rectangle = new Rectangle();
			rectangle.getdata();
			rectangle.compute_area();
			break;
			
		default:
			System.out.println("invalid number"+"\n"+"enter valid number");
		
		}
		}while(n!=4);		
	}
}
// OUTPUT
//enter 1 for area of circle: 
//enter 2 for area of TRIANGLE: 
//enter 3 for area of RECTANGLR: 
//enter 4 for EXIT: 
//1
//x: 2
//the AREA of CIRCLE is 12.56
//enter 1 for area of circle: 
//enter 2 for area of TRIANGLE: 
//enter 3 for area of RECTANGLR: 
//enter 4 for EXIT: 
//2
//x: 3
//y: 4
//the AREA of TRIANGLE is 6.0
//enter 1 for area of circle: 
//enter 2 for area of TRIANGLE: 
//enter 3 for area of RECTANGLR: 
//enter 4 for EXIT: 
//3
//x: 5
//y: 6
//the AREA of RECTANGLE is 30.0
//enter 1 for area of circle: 
//enter 2 for area of TRIANGLE: 
//enter 3 for area of RECTANGLR: 
//enter 4 for EXIT: 
//4
//invalid case
//enter valid number