import java.util.Scanner;

public class complex1
{
    private int real1,img1,real2,img2;
    public complex1() 
    {
    	real1=0;
    	img1=0;
    }
   
    public complex1(int r,int i)
    {
        real1=r;
        img1=i;
    } 
         
    public void add(complex1 x, complex1 y)
    {
        real1 = x.real1 + y.real1;
        img1 = x.img1 + y.img1;
        System.out.println("Addition of two complex is  "+real1+"+"+img1+"i");
    }
    
    public void subtract(complex1 x, complex1 y)
    {
        real1 = x.real1 - y.real1;
        img1 = x.img1 - y.img1;
        System.out.println("Subtraction of two complex is  "+real1+"+"+img1+"i");
    }
    
    public void multiply(complex1 x, complex1 y)
    {
    	real1=(x.real1*y.real1)-(x.img1*y.img1);
    	img1=(x.real1*y.img1)+(x.img1*y.real1);
    	System.out.println("Multiplication of two complex is  "+real1+"+"+img1+"i");
    }
    
    public void division(complex1 x, complex1 y)
    {
    	double divisor=(double) (Math.pow(y.real1,2)+Math.pow(y.img1,2));
    	double real1 = (x.real1 * y.real1 + x.img1 * y.img1 )/ divisor;
    	double img1 = ( x.img1 * y.real1 - x.real1 * y.img1 )/ divisor;
        System.out.println("Division of two complex is  "+real1+"+"+img1+"i");
        
    }

    public static void main(String[] args)
    {
    	int real1,img1,real2,img2;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the first real number and imaginary number: ");
        real1=sc.nextInt();
        img1=sc.nextInt();
        complex1 obj1=new complex1(real1,img1);        
         
        System.out.println("Enter second real number and imaginary number: ");
        real2=sc.nextInt();
        img2=sc.nextInt();
        complex1 obj2 = new complex1(real2,img2);
        
        complex1 obj3=new complex1();
  
     int n;
     
    // Scanner r=new Scanner(System.in);
     
     System.out.println("Enter the case 1(add): ");
     System.out.println("Enter the case 2(subtract): ");
     System.out.println("Enter the case 3(multiply)");
     System.out.println("Enter the case 4(division): ");
     
     n=sc.nextInt();
     
    switch(n) 
    {
    case 1:
    	
    	obj3.add(obj1,obj2);
    	break;
    	
    case 2:
        obj3.subtract(obj1,obj2);
        break;
    	
    case 3:
    
        obj3.multiply(obj1,obj2);
        break;
    	
    case 4:
    
        obj3.division(obj1,obj2);
        break;
        
    }
    }
    }
/*OUTPUT

Enter the first real number and imaginary number: 
1
2
Enter second real number and imaginary number: 
3
4
Enter the case 1(add): 
Enter the case 2(subtract): 
Enter the case 3(multiply)
Enter the case 4(division): 
1
Addition of two complex is  4+6i

Enter the first real number and imaginary number: 
13
24
Enter second real number and imaginary number: 
11
22
Enter the case 1(add): 
Enter the case 2(subtract): 
Enter the case 3(multiply)
Enter the case 4(division): 
2
Subtraction of two complex is  2+2i

Enter the first real number and imaginary number: 
10
20
Enter second real number and imaginary number: 
20
40
Enter the case 1(add): 
Enter the case 2(subtract): 
Enter the case 3(multiply)
Enter the case 4(division): 
3
Multiplicatin of two complex is  -600+800i

Enter the first real number and imaginary number: 
11
23
Enter second real number and imaginary number: 
45
27
Enter the case 1(add): 
Enter the case 2(subtract): 
Enter the case 3(multiply)
Enter the case 4(division): 
4
Division of two complex is  0+0i*/
