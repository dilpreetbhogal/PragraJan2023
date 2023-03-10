package Inheritance;

public class Parent {
    private int a =1;
    private int b=2;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public Parent(int a,int b){
        this.a =a;
        this.b = b;
    }




    public void display(){
        System.out.println("Parent is displaying");
    }

    private void hidden(){
        System.out.println("Parent hidden method");
    }
}
