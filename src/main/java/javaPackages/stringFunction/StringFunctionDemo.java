package stringFunction;

public class StringFunctionDemo {


    public static void main(String[] args) {
        String Obj = new String("Dharti");
        System.out.println(Obj);
        char firstletter = Obj.charAt(0);
        System.out.println(firstletter);//Output= "D"--Index Start with 0
        int length = Obj.length();
        System.out.println(length);//output=6
        String lower = Obj.toLowerCase();
        System.out.println(lower);//Output=dharti
        String Upper = Obj.toUpperCase();
        System.out.println(Upper);//Output= Dharti
        String newSpelling = Obj.replace('i', 'e');
        System.out.println(newSpelling);//Output=Dharte
        String fullName = Obj.concat("Patel");
        System.out.println(fullName);//Output=Dharti Patel
        String[] twonames = fullName.split(" ");
        System.out.println(twonames[0]);//Output=
        System.out.println(twonames[1]);
    }




    }







