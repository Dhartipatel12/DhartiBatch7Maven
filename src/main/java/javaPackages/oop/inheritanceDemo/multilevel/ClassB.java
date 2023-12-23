package oop.inheritanceDemo.multilevel;

public class ClassB extends ClassA {

//Inheritance


    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println(obj.Property1);
        System.out.println(obj.Property2);
        System.out.println(obj.hascar);
        obj.Sellproperties();
    }

}
