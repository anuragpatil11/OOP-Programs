// SIB 27 ANURAG PATIL
import java.util.*;

public class Bag_op {

	
	public static void main(String[] args) {
		
		Bag[] item=new Bag[20];
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		double weight;
		String color;
		
		do {
			System.out.print(" TOTAL ITEMS:"+Bag.get_count()+"\t"+"TOTAL WEIGHT "+Bag.get_totalWeight()+"\n");
			System.out.print("1. INSERT \n");
			System.out.print("2. DELETE: \n");
			System.out.print("3. DISPLAY: \n");
			System.out.print("4. EXIT: \n");
			System.out.print("ENTER YOUR CHOICE: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("1. ONLY COLOR: \n");
				System.out.print("2. ONLY WEIGHT: \n");
				System.out.print("3. BOTH: \n");
				System.out.print("4. NONE: \n");
				System.out.print("ENTER YOUR CHOICE: ");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("COLOR: ");
					color=sc.next();
					item[Bag.get_count()]=new Bag(color);
					break;
					
				case 2:
					System.out.print("WEIGHT: ");
					weight=sc.nextDouble();
					item[Bag.get_count()]=new Bag(weight);
					break;
					
				case 3:
					System.out.print("COLOR: ");
					color=sc.next();
					System.out.print("WEIGHT: ");
					weight=sc.nextDouble();
					item[Bag.get_count()]=new Bag(color,weight);
					break;
					
				case 4:
					item[Bag.get_count()]=new Bag();
					choice=1;
					break;
					
				default:
					System.out.print("invalid choice: ");					
					break;				
				}
				break;
				
			case 2:				
				item[Bag.get_count()-1].decrement();
				break;
				
			case 3:
				for(int i=0;i<Bag.get_count();i++) {
					System.out.println( (i+1) + " "+ item[i].display());
					
				}
				break;
				
			case 4:
				break;
				
			default:
				System.out.print("INVALID CHOICE");
				break;
				
			}
			}while (choice!=4);

	}

}
// OUTPUT

/*TOTAL ITEMS:0	TOTAL WEIGHT 0.0
1. INSERT 
2. DELETE: 
3. DISPLAY: 
4. EXIT: 
ENTER YOUR CHOICE: 1
1. ONLY COLOR: 
2. ONLY WEIGHT: 
3. BOTH: 
4. NONE: 
ENTER YOUR CHOICE: 3
COLOR: GREEN
WEIGHT: 10.5
TOTAL ITEMS:1	TOTAL WEIGHT 10.5
1. INSERT 
2. DELETE: 
3. DISPLAY: 
4. EXIT: 
ENTER YOUR CHOICE: 1
1. ONLY COLOR: 
2. ONLY WEIGHT: 
3. BOTH: 
4. NONE: 
ENTER YOUR CHOICE: 1
COLOR: BLACK
TOTAL ITEMS:2	TOTAL WEIGHT 19.0
1. INSERT 
2. DELETE: 
3. DISPLAY: 
4. EXIT: 
ENTER YOUR CHOICE: 1
1. ONLY COLOR: 
2. ONLY WEIGHT: 
3. BOTH: 
4. NONE: 
ENTER YOUR CHOICE: 2
WEIGHT: 15.9
TOTAL ITEMS:3	TOTAL WEIGHT 34.9
1. INSERT 
2. DELETE: 
3. DISPLAY: 
4. EXIT: 
ENTER YOUR CHOICE: 3
1 COLOR IS GREEN,WEIGHT IS 10.5
2 COLOR IS BLACK,WEIGHT IS 8.5
3 COLOR IS RED,WEIGHT IS 15.9
TOTAL ITEMS:3	TOTAL WEIGHT 34.9
1. INSERT 
2. DELETE: 
3. DISPLAY: 
4. EXIT: 
ENTER YOUR CHOICE: 2
TOTAL ITEMS:2	TOTAL WEIGHT 19.0
1. INSERT 
2. DELETE: 
3. DISPLAY: 
4. EXIT: 
ENTER YOUR CHOICE: 4*/
