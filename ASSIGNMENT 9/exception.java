import java.util.*;

public class exception {
    private int num1, num2, num3;

    public boolean division() {
        
        try {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();

            System.out.println("Enter Second number: ");
            num2 = sc.nextInt();
            num3 = num1 / num2;
            System.out.println("The division of " + num1 + " and " + num2 + " is " + num3);
            return true;
         
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(
                    "InputMismatch Exception got" + "\n" + "Input is in invalid format" + "\n" + "Re-Enter the Input");
            return false;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("//Arithmetic Exception got//" + "\n" + "//An integer cannot divide by 0//" + "\n"
                    + "//Re-Enter the Input//");
            return false;

        } 

    }

}
