// SIB27 ANURAG PATIL
#include <iostream>
using namespace std;

class MeterCentimeter; // Class name MeterCentimeter
class FeetInches {       //// Class name FeetInches
private:
    int feet; // two instance variable feet and inches of class FeetInches{}
    int inches;

public:
// declare methods FeetInches(), display()
// friend function add() and subtract()
    FeetInches(int feet, int inches);
    void display();
    friend void add(FeetInches* f1, MeterCentimeter* m1, FeetInches* f2);
    friend void add(FeetInches* f1, MeterCentimeter* m1, MeterCentimeter* m2);
    friend void subtract(FeetInches* f1, MeterCentimeter* m1, FeetInches* f2, int order);
    friend void subtract(FeetInches* f1, MeterCentimeter* m1, MeterCentimeter* m2, int order);
};


FeetInches::FeetInches(int feet, int inches) {
    this->inches = inches % 12;
    this->feet = feet + (inches / 12);
}

void FeetInches::display() {
    cout << this->feet << " Feet " << this->inches << " Inches";
}

class MeterCentimeter {
private:
    int meter;  // two instance vriable meter and centimerter of class MeterCentimeter{}
    int centimeter;

public:
// declare methods MeterCentimeter() and  display()
// friend function add() and subtract()
    MeterCentimeter(int meter, int centimeter);
    void display();
    friend void add(FeetInches* f1, MeterCentimeter* m1, FeetInches* f2);
    friend void add(FeetInches* f1, MeterCentimeter* m1, MeterCentimeter* m2);
    friend void subtract(FeetInches* f1, MeterCentimeter* m1, FeetInches* f2, int order);
    friend void subtract(FeetInches* f1, MeterCentimeter* m1, MeterCentimeter* m2, int order);
};

MeterCentimeter::MeterCentimeter(int meter, int centimeter) {
    this->meter = meter + (centimeter / 100);
    this->centimeter = centimeter % 100;
}

void MeterCentimeter::display() {
    cout << this->meter << " meters " << this->centimeter << " centimeters";
}

void add(FeetInches* f1, MeterCentimeter* m1, FeetInches* f2) {
    int totalInches = f1->inches + (f1->feet * 12);
    int totalCentimeter = m1->centimeter + (m1->meter * 100);
    int sumInches = (totalCentimeter * 0.3937)  + totalInches;
    f2->feet = sumInches / 12;
    f2->inches = sumInches % 12;
}

void add(FeetInches* f1, MeterCentimeter* m1, MeterCentimeter* m2) {
    int totalInches = f1->inches + (f1->feet * 12);
    int totalCentimeter = m1->centimeter + (m1->meter * 100);
    int sumCentimeter = totalCentimeter  + (totalInches * 2.54);
    m2->meter = sumCentimeter / 100;
    m2->centimeter = sumCentimeter % 100;
}

void subtract(FeetInches* f1, MeterCentimeter* m1, FeetInches* f2, int order) {
    int totalInches = f1->inches + (f1->feet * 12);
    int totalCentimeter = m1->centimeter + (m1->meter * 100);
    int diffInches = 0;
    if (order == 1) diffInches = totalInches - (totalCentimeter * 0.3937);
    else diffInches = (totalCentimeter * 0.3937) - totalInches;
    f2->feet = diffInches / 12;
    f2->inches = diffInches % 12;
}

void subtract(FeetInches* f1, MeterCentimeter* m1, MeterCentimeter* m2, int order) {
    int totalInches = f1->inches + (f1->feet * 12);
    int totalCentimeter = m1->centimeter + (m1->meter * 100);
    int diffCentimeter = 0;
    if (order == 1) diffCentimeter = (totalInches * 2.54) - totalCentimeter;
    else diffCentimeter = totalCentimeter - (totalInches * 2.54);
    m2->meter = diffCentimeter / 100;
    m2->centimeter = diffCentimeter % 100;
}


int main() {

    FeetInches* f1 = new FeetInches(0,0); // f1 anf f2 are object of class FeetInches{}
    MeterCentimeter* m1 =  new MeterCentimeter(0, 0); // m1 and m2 are objects of class MeterCentimeter{}
    FeetInches* f2 = new FeetInches(0,0);
    MeterCentimeter* m2 = new MeterCentimeter(0,0);

    int choice, feet, inches, meter, centimeter;
    do {
        cout << "\nf1: ", f1->display();
        cout << "\t\tm1: ", m1->display();
        cout << "\n1. Change Values\n" << "2. Add\n" << "3. Subtract\n" << "4. Exit" << endl;
        cout << "Enter Your Choice: ";
        cin >> choice;
        switch (choice) {
            case 1:
                cout << "\nWhich value do you want to change?\n" << "1. Feet and Inches\n" << "2. Meters and Centimeters" << endl;
                cout << "Enter Your Choice: ";
                cin >> choice;
                switch (choice) {
                    case 1:
                        cout << "Feet: ";
                        cin >> feet;
                        cout << "Inches: ";
                        cin >> inches;
                        f1 = new FeetInches(feet, inches);
                        break;
                    case 2:
                        cout << "Meters: ";
                        cin >> meter;
                        cout << "Centimeters: ";
                        cin >> centimeter;
                        m1 = new MeterCentimeter(meter, centimeter);
                        break;
                    default:
                        cout << "Invalid Choice" << endl;
                        break;
                }
                break;
            case 2:
                cout << "\nWhich system do you want the result in?\n" << "1. Meters and Centimeters\n" << "2. Feet and Inches" << endl;
                cout << "Enter your choice: ";
                cin >> choice;
                if (choice == 1) {
                    add(f1, m1, m2);
                    m2->display();
                    cout <<"\n";
                }
                else if (choice == 2) {
                    add(f1, m1, f2);
                    f2->display();
                    cout << "\n";
                }
                else {
                    cout << "Invalid Choice" << endl;
                }
                break;
            case 3:
                cout << "\nWhich system do you want the result in?\n" << "1. Meters and Centimeters\n" << "2. Feet and Inches" << endl;
                cout << "Enter your choice: ";
                cin >> choice;
                if (choice == 1) {
                    cout << "In what order do you want the subtraction?\n" << "1. Feet - Meters\n" << "2. Meters - Feet" << endl;
                    cout << "Enter your choice: ";
                    cin >> choice;
                    if (choice == 1) subtract(f1, m1, m2, 1);
                    else if (choice == 2) subtract(f1, m1, m2, 2);
                    else {
                        cout << "Invalid Choice" << endl;
                        break;
                    }
                    m2->display();
                    cout <<"\n";
                }
                else if (choice == 2) {
                    cout << "In what order do you want the subtraction?\n" << "1. Feet - Meters\n" << "2. Meters - Feet" << endl;
                    cout << "Enter your choice: ";
                    cin >> choice;
                    if (choice == 1) subtract(f1, m1, f2, 1);
                    else if (choice == 2) subtract(f1, m1, f2, 2);
                    else {
                        cout << "Invalid Choice" << endl;
                        break;
                    }
                    f2->display();
                    cout <<"\n";
                }
                else {
                    cout << "Invalid Choice" << endl;
                }
                break;
            case 4:
                break;
            default:
                cout << "Invalid Choice" << endl;
                break;
        }
    }while (choice != 4);
    return 0;
}
/*
output
f1: 0 Feet 0 Inches             m1: 0 meters 0 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 1

Which value do you want to change?
1. Feet and Inches
2. Meters and Centimeters
Enter Your Choice: 1
Feet: 23
Inches: 45

f1: 26 Feet 9 Inches            m1: 0 meters 0 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 1

Which value do you want to change?
1. Feet and Inches
2. Meters and Centimeters
Enter Your Choice: 2
Meters: 345
Centimeters: 567

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 2

Which system do you want the result in?
1. Meters and Centimeters
2. Feet and Inches
Enter your choice: 1
358 meters 82 centimeters

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 2

Which system do you want the result in?
1. Meters and Centimeters
2. Feet and Inches
Enter your choice: 1
358 meters 82 centimeters

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice:
2

Which system do you want the result in?
1. Meters and Centimeters
2. Feet and Inches
Enter your choice: 2
1177 Feet 2 Inches

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 3

Which system do you want the result in?
1. Meters and Centimeters
2. Feet and Inches
Enter your choice: 1
In what order do you want the subtraction?
1. Feet - Meters
2. Meters - Feet
Enter your choice: 1
-342 meters -51 centimeters

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 2

Which system do you want the result in?
1. Meters and Centimeters
2. Feet and Inches
Enter your choice: 2
1177 Feet 2 Inches

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 3

Which system do you want the result in?
1. Meters and Centimeters
2. Feet and Inches
Enter your choice: 1
In what order do you want the subtraction?
1. Feet - Meters
2. Meters - Feet
Enter your choice: 2
342 meters 51 centimeters

f1: 26 Feet 9 Inches            m1: 350 meters 67 centimeters
1. Change Values
2. Add
3. Subtract
4. Exit
Enter Your Choice: 4
*/