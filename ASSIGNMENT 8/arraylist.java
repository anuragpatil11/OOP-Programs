import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    // Here we create even_odd function
    public static void even_odd() {
        ArrayList<Integer> list = new ArrayList<>();
        int num, num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter array elements " + i);
            num1 = input.nextInt();
            list.add(num1);
        }
        ArrayList<Integer> list_odd = new ArrayList<>();
        ArrayList<Integer> list_even = new ArrayList<>();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num; i++) {

            if (list.get(i) % 2 == 0) {

                list_even.add(list.get(i));
                even++;

            } else {

                list_odd.add(list.get(i));
                odd++;
            }
        }
        System.out.println("Even number in the list is ");
        for (int i = 0; i < list_even.size(); i++) {
            System.out.print(list_even.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("Odd number in the list is ");
        for (int i = 0; i < list_odd.size(); i++) {
            System.out.print(list_odd.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("Total number of odd elements is " + odd);
        System.out.println("Total number of Even elements is " + even);

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Here we create prime funtion
    public static void prime() {
        ArrayList<Integer> list = new ArrayList<>();
        int num, num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter array elements " + i + "   ");
            num1 = input.nextInt();
            list.add(num1);
        }
        ArrayList<Integer> PrimeList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (isPrime(list.get(i))) {
                PrimeList.add(list.get(i));
                count++;
            }
        }

        System.out.println("Prime number in the list is");
        for (int i = 0; i < PrimeList.size(); i++) {
            System.out.print(PrimeList.get(i) + "  ");
        }
        System.out.println("");
        System.out.println("total number of prime number is " + count);
    }

    // Here we create ispallindrome function
    public static void ispallindrome() {
        ArrayList<String> str1 = new ArrayList<String>();
        ArrayList<String> str2 = new ArrayList<String>();
        String string1, string2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        string1 = sc.next();
        str1.add(string1);
        StringBuilder palin = new StringBuilder(string1);
        palin.reverse();
        String rev_palin = palin.toString();
        str2.add(rev_palin);

        // System.out.println(palin.toString());
        boolean equals = str1.equals(str2);
        if (equals == true) {
            System.out.println("String is pallindrome");

        } else {
            System.out.println("String is not pallindrome");
        }
    }
    public static void main(String[] args) {

        arraylist obj = new arraylist();
        Scanner input = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1. list is even or odd: ");
            System.out.println("2. list is prime or not: ");
            System.out.println("3. palindrome or not: ");
            System.out.println("4. Exit: ");
            ch = input.nextInt();

            switch (ch) {
                case 1:
                    // System.out.println(obj.even_odd(););
                    obj.even_odd();
                    break;

                case 2:
                    obj.prime();
                    break;

                case 3:
                    obj.ispallindrome();
                    break;

                case 4:
                    // System.out.println("invalid" + "\n" + "enter again");
                    break;
            }
        } while (ch != 4);
    }
}
/*output
1. list is even or odd: 
2. list is prime or not:
3. palindrome or not:
4. Exit:
1
Enter size of array:
5
Enter array elements 0
12
Enter array elements 1
13
Enter array elements 2
22
Enter array elements 3
34
Enter array elements 4
31
Even number in the list is 12 22 34
Odd number in the list is 13 31
Total number of odd elements is 2
Total number of Even elements is 3
1. list is even or odd:
2. list is prime or not:
3. palindrome or not:
4. Exit:
2
Enter size of array: 5
Enter array elements 0   11
Enter array elements 1   22
Enter array elements 2   24
Enter array elements 3   35
Enter array elements 4   66
Prime number in the list is
11
total number of prime number is 1
1. list is even or odd:
2. list is prime or not:
3. palindrome or not:
4. Exit:
3
Enter the string:
ram
String is not pallindrome
1. list is even or odd:
2. list is prime or not:
3. palindrome or not:
4. Exit:
4*/