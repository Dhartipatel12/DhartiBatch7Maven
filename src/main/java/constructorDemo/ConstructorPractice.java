package constructorDemo;

public class ConstructorPractice {
// Constructor is a special method that has the same name as class.
 public String name;
 public int id;
 public int batch;
 public String location;


public ConstructorPractice(String name,int id,int batch){
   this. name = name;
   this. id = id;
   this.batch = batch;
}

    public ConstructorPractice(String location) {
        this.location = location;
    }

  public static void main(String[] args) {

     ConstructorPractice obj1 = new ConstructorPractice("Dharti",101,7);
    // obj1.name = "Dharti";
    //  obj1.id = 101;
    // obj1.batch= 7;

      System.out.println(obj1.name);
      System.out.println(obj1.id);
      System.out.println(obj1.batch);
      System.out.println("--------------------------------------");

      ConstructorPractice obj2 = new ConstructorPractice("Shefali",102,7);
     // obj2.name = "Shefali";
     // obj2.id = 102;
     // obj2.batch= 7;

      System.out.println(obj2.name);
      System.out.println(obj2.id);
      System.out.println(obj2.batch);
      System.out.println("--------------------------------------");

      ConstructorPractice obj3 = new ConstructorPractice("Sadia",103,7);
     // obj3.name = "Sadia";
     // obj3.id = 103;
     // obj3.batch= 7;

      System.out.println(obj3.name);
      System.out.println(obj3.id);
      System.out.println(obj3.batch);
      System.out.println("--------------------------------------");

      ConstructorPractice obj4 = new ConstructorPractice("New york");
      System.out.println(obj4.location);
      System.out.println("--------------------------------------");


    }

}
