package javaPackages.conditionalStatement;

import java.util.Scanner;

public class Grade {

/*
 3.A school has followingrules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

    public static void main(String[] args) {
        Grade obj = new Grade();
        obj.grade();
    }



    public void grade () {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark == 25) {
            System.out.println("the student got F");
        } else if (mark == 45) {
            System.out.println("the student got E");
        } else if (mark == 50) {
            System.out.println("D");
        } else if (mark == 60) {
            System.out.println("C");
        } else if (mark == 80) {
            System.out.println("B");
        }
    }



}
