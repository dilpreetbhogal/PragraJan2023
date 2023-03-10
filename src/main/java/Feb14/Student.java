package Feb14;

public class Student {
    String name;
    String phoneNumber;
    int marksMaths;
    int marksScience;
    int marksChem;



    public Student(String name, String phoneNumber, int marksMaths, int marksScience, int marksChem) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.marksMaths = marksMaths;
        this.marksScience = marksScience;
        this.marksChem = marksChem;
    }
    public Student(String phoneNumber, String name)  //doubt changing the order...phonenumber should go in name
    {
        this(name,phoneNumber,0,0,0);
    }

    public Student(String phoneNumber)          //constructor chaining
    {

        this(phoneNumber,"null");      // this constructor is calling upper and upper calling most upper
    }

    public Student() {
    }


    public int totalMarks(){
        return (this.marksChem+this.marksScience+this.marksMaths);
    }
}
