package String25feb;

public class main {

    public static void main(String[] args) {



//        String s1 = new String("hello world"); /// should print different address
//
//
//        String s = "hello world";
//
//        System.out.println(s==s1);
//
//        String s2 = s.substring(7,8); // endpoint is (endpoint-1)
//
//
//        System.out.println(s2);
//
//
//        String s3 = "Hello worlddd i am java";
//
//        String[] splittedString = s3.split(" ");
//
//
//        System.out.println(splittedString[3]);
//
//
//        for(int i=0; i< splittedString.length;i++) //traversing whole array of string
//        {
//            System.out.println(splittedString[i]);
//        }



        String s6 = "abcefg";

        String s7 = "abc";

        String s5 = new String("abcefg");

        String s9="efg";

        String s8 = s7.concat("efg");     //Doubt is s8 is made with new keyword?

        System.out.println(s8);

        System.out.println(s6==s8);

        System.out.println(s9==s8);

        System.out.println(s5==s8);

        System.out.println(s6.equals(s8));





    }
}
