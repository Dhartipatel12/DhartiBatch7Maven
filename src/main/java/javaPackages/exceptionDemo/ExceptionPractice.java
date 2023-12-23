package javaPackages.exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPractice {
    public ExceptionPractice() throws IOException {
    }
 /* There are two type of exceptions
  1.Compile time Exceptions.
    A. InterruptionException.
    B. FileNotFound Exception.
  2.Run time Exceptions.(logical exception)
    A. ArrayIndexoutofBound Exceptions
    B. StringIndexOutOfBoundException
    C. NumberFormatException
  */

    public void compileTimeException() throws InterruptedException, IOException {
        System.out.println(3 + 3);
        Thread.sleep(5000);
        System.out.println(4 * 4);
        System.out.println(9 + 8);


    FileInputStream fs = new FileInputStream("src/test/java/info.properties");
    int number = fs.available();
    System.out.println(number);
}

public void runtimeException(){
  String name[] = {"Dharti","Sefali","Sadia"};
    System.out.println(name[3]);
  String location = "pennsylvania";
  char lastletter = location.charAt(15);
  int locationNumber = Integer.valueOf (location);
    System.out.println(locationNumber);
}



    public static void main(String[] args) throws InterruptedException, IOException {
        ExceptionPractice obj = new ExceptionPractice();
        obj.compileTimeException();
    }


}
