package oop.inheritanceDemo.multilevel;

public class ClassD extends ClassC{


    public static void main(String[] args) {
        ClassD obj= new ClassD();
        System.out.println(obj.Property1);
        System.out.println(obj.Property2);
        System.out.println(obj.hascar);
        obj.Sellproperties();
    }
}
