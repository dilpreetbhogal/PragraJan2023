package Inheritance;

public class Grandchild extends Child {

    public Grandchild(){
        super(88,99);
    }



    public void display(){
        System.out.println("GrandChild is displaying");
    }

    private void hidden(){
        System.out.println("GrandChild hidden method");
    }
}
