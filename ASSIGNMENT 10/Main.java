public class Main {

    public static void main(String[] args) {

        Database db= new Database();
        try {
            db.select();
        }catch (Exception e){
            System.out.println("An Error Occurred!\nKindly Enter data");
            db.select();
        }
    }
}
/*
OUTPUT
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
2
-------------------------------------------------------------------------------
Name-raj
Student ID-t43565
Roll No- 65
CLass-it
Marks- 66
Address-mumbai
----------------------------------------------------------------------------------
Name-mohan
Student ID-t45788
Roll No- 45
CLass-it
Marks- 465
Address-nagpur
----------------------------------------------------------------------------------
Name-om
Student ID-t131233
Roll No- 23
CLass-ce
Marks- 78
Address-pune
----------------------------------------------------------------------------------
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
3
enter Student id
t131233
record deleted successfully
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
2
-------------------------------------------------------------------------------
Name-raj
Student ID-t43565
Roll No- 65
CLass-it
Marks- 66
Address-mumbai
----------------------------------------------------------------------------------
Name-mohan
Student ID-t45788
Roll No- 45
CLass-it
Marks- 465
Address-nagpur
----------------------------------------------------------------------------------
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
5
enter Student id:
t43565
------------------------------------------------------
found
Name-raj
Student ID-t43565
Roll No- 65
CLass-it
Marks- 66
Address-mumbai
----------------------------------------------------
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
4
Enter Student Id: 4543
-------------------------------------------------------------------------------------------
Record not Found!
-------------------------------------------------------------------------------------------
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
4
Enter Student Id: t43565
-------------------------------------------------------------------------------------------
Name-raj
Student ID-t43565
Roll No- 65
CLass-it
Marks- 66
Address-mumbai
-------------------------------------------------------------------------------------------
Select Data you want to Change!
1.Name
2.Student Id
3.Address
4.Roll no.
5.Class
6.Marks
7.Exit
Choice: 6
Change the Marks.
Enter new Marks: 77
Record Updated Successfully!
-------------------------------------------------------------------------------------------
Select Data you want to Change!
1.Name
2.Student Id
3.Address
4.Roll no.
5.Class
6.Marks
7.Exit
Choice: 7
Enter Valid Input!
Record Updated Successfully!
-------------------------------------------------------------------------------------------
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
2
-------------------------------------------------------------------------------
Name-raj
Student ID-t43565
Roll No- 65
CLass-it
Marks- 77
Address-mumbai
----------------------------------------------------------------------------------
Name-mohan
Student ID-t45788
Roll No- 45
CLass-it
Marks- 465
Address-nagpur
----------------------------------------------------------------------------------
1. Create Database:
2. Display Database:
3. Delete Database:
4. Update Database:
5. Search Database:
6. Exit
6

Process finished with exit code 0

 */