package Static28Feb;

public class Counter {

    static int count = 0;
    int intstanceCount = 0;


    public void counterMethod() {

        count++;
        intstanceCount++;
    }

    public void counterDisplay() {

        System.out.println("Printing static    "+count);
        System.out.println("Printing instance  "+intstanceCount);
    }
}
