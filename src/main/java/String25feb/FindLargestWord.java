package String25feb;

//ques: print largest word in string

public class FindLargestWord {

    public static void main(String[] args)

    {

        String s3 = "Test string to return the largest())()(() word present-qwq in paragraph";

        String[] splittedString = s3.split(" ");

        String large = splittedString[0];

        for(int i=0; i< splittedString.length;i++){

            if(large.length() < splittedString[i].length()){

                large = splittedString[i];
            }
        }

        System.out.println(large);

    }
}
