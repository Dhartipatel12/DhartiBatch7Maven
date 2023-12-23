package oop.polymorphismDemo;

public class OverridingDemo2 extends OverridingDemo1{
   //parent class=Super Class
   // Child Class= Sub Class,derived Class

    /**
     * Designed by Dharti
     * @Param members
     */

    public void courseMember(int members) {
        System.out.println(members);
        String group ="Selenium";
        System.out.println(group);

    }

    public static void main(String[] args) {
        OverridingDemo2 Obj=new OverridingDemo2();
        Obj.courseMember(7);
    }





}
