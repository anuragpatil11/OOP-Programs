
import java.util.Scanner;


public class Associate_proffessor extends person{
	private String Department_name;
	private double basic_pay;
	
	public void accept()
	{
		super.getdata();
		Scanner sc = new Scanner(System.in);
		System.out.print("DEPARTMENT NAME: ");
		Department_name= sc.next();
		
		System.out.print("BASIC PAY:");
		basic_pay=sc.nextDouble();
	}
	public void output()
	{
//		DA= 1.19*basic_pay;
//		HRA =0.3*basic_pay;
//		PF=0.12*basic_pay;
//		SCF= 0.001*basic_pay;
		//SALARY = BASIC PAY + DA + HRA - PT - PF ;
		super.display();
		double gross_salary= basic_pay + 1.19*basic_pay + 0.3*basic_pay;
		double net_salary= gross_salary - 0.12*basic_pay - 0.001*basic_pay;
		
		System.out.println("DEPARTMENT  NAME is "+Department_name+"\n"+"Salary is "+net_salary);
	}

}
