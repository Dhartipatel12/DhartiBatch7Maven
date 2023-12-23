package finalKeyword;

public class FinalDemo2 extends FinalDemo{

    /**
     * Created by Dharti
     */
    @Override
public  void printName() {
    System.out.println("print name");
        String anotherName = "Fayza";
        String anotherName2 = "Sadia";
        String anotherName3 = "Lota";
        System.out.println(anotherName+ "+"+anotherName2);
        System.out.println("Dharti");
}


    public static void main(String[] args) {
        FinalDemo2 Obj = new FinalDemo2();
        Obj.printName();
    }



}
