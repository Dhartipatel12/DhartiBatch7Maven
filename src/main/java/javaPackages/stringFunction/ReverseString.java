package javaPackages.stringFunction;

public class ReverseString {

public static void reverseString() {
    String name = "Dharti";//itrahd
    char lastLetter = name.charAt(5);

    for (int i = name.length() - 1; i >= 0; i--) {
        System.out.println(name.charAt(i));//return Charactor
    }


}


    public static void main(String[] args) {
        reverseString();
    }






}
