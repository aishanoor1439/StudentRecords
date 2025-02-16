package com.mycompany.studentrecords;

import java.util.Scanner;

public class StudentRecords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      First object of Student
        Student s1 = new Student();
        s1.input();
        s1.output();
        System.out.println("Do you want to update the record?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            s1.update();
            s1.output();
        } else {
            System.out.println("Thank You!");
        }
    }
}
