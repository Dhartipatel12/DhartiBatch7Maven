package javaPackages.stringFunction;

public class ReverseString1 {

public static void reverseString1() {
    String name = "Shifat";
    String reverse = " ";

    for (int i = name.length() - 1; i >= 0; i--) {
        reverse = reverse + name.charAt(i);//string + char=String
    }
    System.out.println(reverse);
}


    public static void main(String[] args) {
       reverseString1();
    }


}
