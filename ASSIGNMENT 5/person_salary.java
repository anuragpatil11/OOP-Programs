import java.util.*;
public class person_salary {

	public static void main(String[] args) {
		
		Assistant_proffessor obj1= new Assistant_proffessor();
		Associate_proffessor obj2= new Associate_proffessor();
		profffessor obj3= new profffessor();
		
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter 1 to generate salary slip for associate proffessor: ");
			System.out.println("enter 2 to generate salary slip for assistant proffessor: ");
			System.out.println("enter 3 to generate salary slip for  proffessor: ");
			System.out.println("enter 4 to exit: ");
			n=sc.nextInt();
			switch(n) {
			case 1:
				obj1.accept();
				obj1.output();
				break;
				
			case 2:
				obj2.accept();
				obj2.output();
				break;
				
			case 3:
				obj3.accept();
				obj3.output();
				break;
				
			default:
				System.out.print("enter valid number");
			}
			
		}while(n!=4);
		
	}

}
// OUTPUT
//enter 1 for generate salary slip for associate proffessor: 
//enter 2 for generate salary slip for assistant proffessor: 
//enter 3 for generate salary slip for  proffessor: 
//enter 4 for exit: 

//1
//NAME: om
//EMPLOYEE_ID: T22843
//DATE OF BIRTH(Day/month/year)): 11/02/1997
//PAN CARD: DFJ4737
//GENDER: M
//ADDRESS: MUMBAI
//AGE: 25
//MOBILE NUMBER: 7889567989
//EMAIL ID: OM@GMAIL.COM
//DEPARTMENT NAME: IT
//BASIC PAY:40000
//Name is om
//Employee ID is T22843
//Date of Birth is 11/02/1997
//Pan card number is DFJ4737
//Gender is M
//Address is MUMBAI
//Age is 25
//Mobile number is 7889567989
//Email id is OM@GMAIL.COM
//DEPARTMENT NAME is IT
//Salary is 94760.0
//enter 1 for generate salary slip for associate proffessor: 
//enter 2 for generate salary slip for assistant proffessor: 
//enter 3 for generate salary slip for  proffessor: 
//enter 4 for exit: 

//2
//NAME: RAJ
//EMPLOYEE_ID: T5678
//DATE OF BIRTH(Day/month/year)): 3/05/1998
//PAN CARD: DFG7865
//GENDER: M
//ADDRESS: PUNE
//AGE: 24
//MOBILE NUMBER: 8987895678
//EMAIL ID: RAJT@GMAIL.COM
//DEPARTMENT NAME: ENTC
//BASIC PAY:50000
//Name is RAJ
//Employee ID is T5678
//Date of Birth is 3/05/1998
//Pan card number is DFG7865
//Gender is M
//Address is PUNE
//Age is 24
//Mobile number is 8987895678
//Email id is RAJT@GMAIL.COM
//DEPARTMENT  NAME is ENTC
//Salary is 118450.0
//enter 1 for generate salary slip for associate proffessor: 
//enter 2 for generate salary slip for assistant proffessor: 
//enter 3 for generate salary slip for  proffessor: 
//enter 4 for exit: 

//3
//NAME: RAM
//EMPLOYEE_ID: T21785
//DATE OF BIRTH(Day/month/year)): 3/12/2000
//PAN CARD: JLK3783
//GENDER: M
//ADDRESS: PUNE
//AGE: 22
//MOBILE NUMBER: 79899089878
//EMAIL ID: RAM@GMAIL.COM
//DEPARTMENT NAME: CE
//BASIC PAY: 70000
//Name is RAM
//Employee ID is T21785
//Date of Birth is 3/12/2000
//Pan card number is JLK3783
//Gender is M
//Address is PUNE
//Age is 22
//Mobile number is 79899089878
//Email id is RAM@GMAIL.COM
//DEPARTMENT NAME is CE
//Salary is 165830.0

//enter 1 for generate salary slip for associate proffessor: 
//enter 2 for generate salary slip for assistant proffessor: 
//enter 3 for generate salary slip for  proffessor: 
//enter 4 for exit: 

//4
//enter valid case