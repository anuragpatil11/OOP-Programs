public class exception_op {
    public static void main(String[] args) {

        exception e1 = new exception();
        boolean check = false;
        do{
       // while (check==false) {
            check = e1.division();
        }while(check==false);
    }
}
/*output
Enter first number: 
1
Enter Second number:
0
java.lang.ArithmeticException: / by zero
        at exception.division(exception.java:16)
        at exception_op.main(exception_op.java:8)
//Arithmetic Exception got//
//An integer cannot divide by 0//
//Re-Enter the Input//


Enter first number:
1
Enter Second number:
j
java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:943)
        at java.base/java.util.Scanner.next(Scanner.java:1598)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
        at exception.division(exception.java:15)
        at exception_op.main(exception_op.java:8)
InputMismatch Exception got
Input is in invalid format
Re-Enter the Input


Enter first number:
24
Enter Second number:
4
The division of 24 and 4 is 6*/