package conditionalStatement;

import java.util.Scanner;

public class Temperature {

/* Take Temperature as user input as Fahrenheit
30 to 49 = cold
50 - 69 = warm
70 - 89 = hot
 */

    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.Temperature();
    }

    public void Temperature() {
        Scanner scan = new Scanner(System.in);
        int Temperature = scan.nextInt();
        if (Temperature < 30) {
            System.out.println("the temperature is Super Cold ");
        }
        else if ((Temperature==30) || (Temperature<49)) {
            System.out.println("the temperature is Cold ");
        }
        else if ((Temperature==49) || (Temperature<69)) {
            System.out.println("the temperature is Warm ");
        }
        else if ((Temperature==69) || (Temperature<89)) {
            System.out.println("the temperature is Hot ");
        }
    }
}