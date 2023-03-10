package Arrays21Feb;



public class Handler {

    public static void main(String[] args) {
        Students student1= new Students();

        Helper helper = new Helper();

        helper.populateDetails(student1);

        System.out.println(student1.name);


        int a=0;

        helper.populateNumber(a);//value not gonna change beacause the a variable in helper class has own copy,

        System.out.println(a);

        //if we want to retain a value we must return it. e.g in this method below


        a = helper.populateNumberReturn(a);

        System.out.println(a);



    }
}
