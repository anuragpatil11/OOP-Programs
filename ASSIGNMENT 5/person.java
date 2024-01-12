
import java.util.*;

public class person {
	
	private String name;
	private String employee_id;
	private String Date_Of_Birth;
	private String pan_card;
	private String gender;
	private String address;
	private int age;
	private String mobile_number;
	private String email_id;
	
	public void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("NAME: ");
		name = sc.next();
		
		System.out.print("EMPLOYEE_ID: ");
		employee_id = sc.next();
		
		System.out.print("DATE OF BIRTH(Day/month/year)): ");
		Date_Of_Birth = sc.next();
		
		System.out.print("PAN CARD: ");
		pan_card = sc.next();
		
		System.out.print("GENDER: ");
		gender = sc.next();
		
		System.out.print("ADDRESS: ");
		address = sc.next();
		
		System.out.print("AGE: ");
		age = sc.nextInt();
		
		System.out.print("MOBILE NUMBER: ");
		mobile_number = sc.next();
		
		System.out.print("EMAIL ID: ");
		email_id = sc.next();
	}
	
	public void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Employee ID is "+employee_id);
		System.out.println("Date of Birth is "+Date_Of_Birth);
		System.out.println("Pan card number is "+pan_card);
		System.out.println("Gender is "+gender);
		System.out.println("Address is "+address);
		System.out.println("Age is "+age);
		System.out.println("Mobile number is "+mobile_number);
		System.out.println("Email id is "+email_id);
	}
	
}