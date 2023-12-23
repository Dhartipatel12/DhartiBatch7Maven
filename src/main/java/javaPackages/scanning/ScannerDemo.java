package scanning;

import java.util.Scanner;

public class ScannerDemo {

public void scannerDemo(){
    Scanner Scan = new Scanner(System.in);
    int myNumber = Scan.nextInt();
    System.out.println("myNumber is " + myNumber);
}


    public static void main(String[] args) {
        ScannerDemo obj = new ScannerDemo();
        obj.scannerDemo();
    }


}
