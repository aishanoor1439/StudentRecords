package com.mycompany.studentrecords;

import java.util.Scanner;

//Class Definition of Student
public class Student {

//  Attributes
    String name;
    String fName;
    String enrollmentNO;
    String department;
    int semester;

    Scanner input = new Scanner(System.in);

//  Methods
    void input() {
        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Enter your Father name:");
        fName = input.nextLine();
        System.out.println("Enter your Enrollment no:");
        enrollmentNO = input.nextLine();
        System.out.println("Enter your Department:");
        department = input.nextLine();
        System.out.println("Enter your Semester:");
        semester = input.nextInt();
    }
    void output() {
        System.out.println("Student Record");
        System.out.println("ID:" + enrollmentNO);
        System.out.println("Name:" + name);
        System.out.println("Father Name:" + fName);
        System.out.println("Department:" + department);
        System.out.println("Semester:" + semester);
    }
    void update() {
        System.out.println("What do you want to update?");
        char response = input.next().charAt(0);
        switch (response) {
            case 'n':
                System.out.println("Enter your name:");
                name = input.nextLine();
                break;
            case 'f':
                System.out.println("Enter your Father name:");
                fName = input.nextLine();
                break;
            case 'e':
                System.out.println("Enter your Enrollment no:");
                enrollmentNO = input.nextLine();
                break;
            case 'd':
                System.out.println("Enter your Department:");
                department = input.nextLine();
                break;
            case 's':
                System.out.println("Enter your Semester:");
                semester = input.nextInt();
                break;
            default:
                System.out.println("Invalid input!");
        }

    }

}
