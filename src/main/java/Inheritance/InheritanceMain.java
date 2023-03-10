package Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Parent parent = new Parent(12,15);

        Grandchild obj = new Grandchild();

        parent.display();
        obj.display();
        System.out.println(obj.getA());
        System.out.println(obj.getB());



    }
}
