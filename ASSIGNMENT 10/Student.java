import java.io.Serializable;
import java.util.Scanner;
public class Student implements Serializable {

    static Scanner s= new Scanner(System.in);
    static Scanner s1= new Scanner(System.in);
    private String name;
    private String student_id;
    private int roll_no;
    private String address;
    private String std;
    private int marks;

    public Student()
    {


        System.out.println("Enter Name: ");
        name=s.next();

        System.out.println("Enter Student ID: ");
        student_id=s.next();

        System.out.println("Enter Roll No: ");
        roll_no=s1.nextInt();

        System.out.println("Enter Class: ");
        std=s.next();

        System.out.println("Enter Marks: ");
        marks=s1.nextInt();

        System.out.println("Enter Address: ");
        address=s.next();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   // @Override
    public String getstd() {
        return std;
    }

    public void setStd(String astd) {
        std = astd;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString()
    {
        return "Name-"+name+"\nStudent ID-"+student_id+"\nRoll No- "+roll_no+"\nCLass-"+std+"\nMarks- "+marks+"\nAddress-"+address;
    }

}
