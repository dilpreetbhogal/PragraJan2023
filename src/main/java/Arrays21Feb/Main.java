package Arrays21Feb;

public class Main {
    public static void main(String[] args) {


        int[] marks = new int[5];

        StudentMarks studentMarks = new StudentMarks();

        studentMarks.giveMarks(marks); //abc will become marks ...address same for both
                                       // values will be declared 15

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

    }
}
