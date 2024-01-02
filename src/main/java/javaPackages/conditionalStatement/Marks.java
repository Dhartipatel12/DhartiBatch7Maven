package javaPackages.conditionalStatement;

import java.util.Scanner;

  public class Marks {
      /*
4.A school has followingrules for grading system:
a. Below 25 - F
b. 25 to below 45 - E
c. 45 to below 50 - D
d. 50 to below 60 - C
e. 60 to below 80 - B
f. Above 80 - A
 */


      public static void main(String[] args) {
          Marks obj = new Marks();
          obj.grades();

      }


    public void grades () {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark < 25) {
            System.out.println("the student got F");
        }
         else if ((mark==25) || (mark < 45)) {
            System.out.println("the student got E");
        }
         else if ((mark==45) || (mark<50)){
            System.out.println("the student got D");
        }
         else if ((mark==50) || (mark<60)){
            System.out.println("the student got C");
        }
         else if((mark==60) || (mark <80)){
            System.out.println("the student got B");
        }
         else if ((mark==80)||(mark>80)){
            System.out.println("the student got A");
        }
    }

}

