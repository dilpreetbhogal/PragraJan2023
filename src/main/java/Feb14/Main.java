package Feb14;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");


        Vehicle vehicle = new Vehicle();
        vehicle.speed();

         Student obj1 = new Student("sam","9815286782",11,12,13);
         Student obj2 = new Student("peter","9815286782",1,12,13);
         Student obj3 = new Student("john","9815286782",15,12,13);
         Student obj4 =new Student();
         Student obj5= new Student("898989998","terry");


         System.out.println(obj1.name +" total marks is  "  + obj1.totalMarks());
         System.out.println(obj2.name +" total marks is  "  + obj2.totalMarks());
         System.out.println(obj4.name +" total marks is  "  + obj4.totalMarks());
         System.out.println(obj5.name +" total marks is  "  + obj5.totalMarks());


    }


}

