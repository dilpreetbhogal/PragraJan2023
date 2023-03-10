package FinalSession2Mch;

public class ConcatString {

    String firstName;
    String middleName;
    String lastName;
    int age;

    public ConcatString(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public ConcatString(String firstName, String middleName, String lastName) {
        this(firstName,middleName,lastName,0);
    }

    public ConcatString(String firstName, String middleName) {

        this(firstName,middleName,null);

    }
    public ConcatString(String firstName) {
        this(firstName,null);
    }
    public ConcatString() {

    }



    public void displayName(){

        System.out.println("My name is  " + firstName + " " + middleName+ " "+ lastName+ " "+ age);

    }
    public void displayName(String firstName)
    {
        System.out.println("My name is  " + firstName);
    }

    public void displayName(String firstName,String middleName){
        System.out.println("My name is  " + firstName + " " + middleName);
    }

    public void displayName(String firstName,String middleName,String lastName){
        System.out.println("My name is  " + firstName + " " + middleName+ " "+ lastName);
    }

    public void displayName(String firstName,int age)
    {
        System.out.println("My name is and age is  " + firstName+ " "+ age);
    }



}
