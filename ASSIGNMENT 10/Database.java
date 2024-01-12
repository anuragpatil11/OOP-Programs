import java.util.ArrayList;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;
public class Database {
    static Scanner s = new Scanner(System.in);
    static Scanner s1 = new Scanner(System.in);
    static ArrayList<Student> student = new ArrayList<>();
    static File file = new File("Student.txt");
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;

    public void insertDatabase() throws Exception {
        Student s = new Student();
        student.add(s);
        closeFile();
    }

    public void openFile() throws Exception {
        ois = new ObjectInputStream(new FileInputStream(file));
        student = (ArrayList<Student>) ois.readObject();
        ois.close();
    }

    public void closeFile() throws Exception {
        oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(student);
        oos.close();
    }

    public void display() throws Exception {
        if (file.isFile()) {
            openFile();
            System.out.println("-------------------------------------------------------------------------------");
            for (int i = 0; i < student.size(); i++) {
                System.out.println(student.get(i).toString());
                System.out.println("----------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("file doesn't exist");
        }
    }

    public void search() throws Exception {
        if (file.isFile()) {
            openFile();
            boolean found = false;
//            System.out.println("enter name: ");
//          String name=s.next();
            System.out.println("enter Student id: ");
            String id = s.next();
            System.out.println("------------------------------------------------------");
            Student temp;
            for (int i = 0; i < student.size(); i++) {
                //if (Objects.equals(student.get(i).getName(),name)){
                if (Objects.equals(student.get(i).getStudent_id(), id)) {
                    temp = student.get(i);
                    System.out.println("found");
                    System.out.println(temp.toString());
                    found = true;
                    System.out.println("----------------------------------------------------");

                }
            }

            if (!found) {
                System.out.println("record not found");
                System.out.println("----------------------------------------------------");
            }


        } else {
            System.out.println("file doesn't exist");
        }

    }

    public void delete() throws Exception {
        if (file.isFile()) {
            openFile();
            boolean found = false;
            System.out.println("enter Student id");
            String id = s.next();
            // Student temp;
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getStudent_id().equals(id)) {
                    // temp=student.get(i)
                    student.remove(i);
                    closeFile();
                    System.out.println("record deleted successfully");
                    found = false;
                } else {
                    found = true;
                }
//                if (found == false) {
////                    closeFile();
////                    System.out.println("record deleted successfully");
//                    System.out.println("---------------------------------");
            }
            if (found==true){
                System.out.println("record not found");
            }
        }
     else
    {
        System.out.println("file doesn't exist");
    }

}
    public void update() throws Exception {

        if (file.isFile()) {
            openFile();
            boolean found = false;
            System.out.print("Enter Student Id: ");
            String id = s.next();
            System.out.println("-------------------------------------------------------------------------------------------");
            Student temp;
            for (int i = 0; i < student.size(); i++) {
                if (Objects.equals(student.get(i).getStudent_id(), id)) {
                    temp = student.get(i);
                    System.out.println(temp.toString());
                    System.out.println("-------------------------------------------------------------------------------------------");
                    update_record(temp);
                    found = true;
                }
            }
            if (found) {
                closeFile();
                System.out.println("Record Updated Successfully!");
                System.out.println("-------------------------------------------------------------------------------------------");
            } else {
                System.out.println("Record not Found!");
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("File does not Exists!");
        }
    }

    public void update_record(Student obj) {
        int choice = -1;
        do {
            System.out.println("Select Data you want to Change!");
            System.out.println("1.Name");
            System.out.println("2.Student Id");
            System.out.println("3.Address");
            System.out.println("4.Roll no.");
            System.out.println("5.Class");
            System.out.println("6.Marks");
            System.out.println("7.Exit");
            System.out.print("Choice: ");
            choice = s1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Change the Name.");
                    System.out.print("Enter new Name: ");
                    String name = s.next();
                    obj.setName(name);
                    student.set(student.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Change the Student Id.");
                    System.out.print("Enter new Student Id: ");
                    String tid = s.next();
                    obj.setStudent_id(tid);
                    student.set(student.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Change the Address.");
                    System.out.print("Enter new Address: ");
                    String taddress = s1.next();
                    obj.setAddress(taddress);
                    student.set(student.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Change the Roll No.");
                    System.out.print("Enter new Roll No: ");
                    int troll = s.nextInt();
                    obj.setRoll_no(troll);
                    student.set(student.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Change the Class.");
                    System.out.print("Enter new Class: ");
                    String tclass = s1.next();
                    obj.setStd(tclass);
                    student.set(student.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Change the Marks.");
                    System.out.print("Enter new Marks: ");
                    int tmarks = s1.nextInt();
                    obj.setMarks(tmarks);
                    student.set(student.indexOf(obj), obj);
                    System.out.println("Record Updated Successfully!");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Enter Valid Input!");
            }

        } while (choice != 7);
    }
    public void select() {
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Create Database: ");
            System.out.println("2. Display Database: ");
            System.out.println("3. Delete Database: ");
            System.out.println("4. Update Database: ");
            System.out.println("5. Search Database: ");
            System.out.println("6. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        insertDatabase();
                    } catch (Exception e) {
                        System.out.println("Error Resolved!");
                        select();
                    }
                    break;
                case 2:
                    try {
                        display();
                    } catch (Exception x) {
                        System.out.println("error resolved");
                        select();
                    }
                    break;
                case 3:
                    try {
                        delete();
                    } catch (Exception x) {
                        System.out.println("error resolved");
                        select();
                    }
                    break;
                case 4:
                    try {
                        update();
                    } catch (Exception x) {
                        System.out.println("error resolved");
                        select();
                    }
                    break;
                case 5:
                    try {
                        search();
                    } catch (Exception q) {
                        System.out.println("error resloved");
                        select();
                    }
                    break;
            }
        } while (ch != 6);
    }

}