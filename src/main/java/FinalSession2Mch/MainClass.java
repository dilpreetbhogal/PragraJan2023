package FinalSession2Mch;

public class MainClass {
    public static void main(String[] args) {


      ConcatString concatString= new ConcatString();
      ConcatString concatString1= new ConcatString("Jonathan");
      ConcatString concatString2= new ConcatString("Jonathan","John");


      concatString.displayName(concatString1.firstName);
      concatString.displayName(concatString2.firstName,concatString2.middleName);

    }





}
