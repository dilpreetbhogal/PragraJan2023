package Inheritance;

public class Child extends Parent {

    private int c=3;
    private int d=4;




    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }


    public Child(int a,int b){
        super(a,b);
    }

    public void display(){
        System.out.println("Child is displaying");
    }

    private void hidden(){
        System.out.println("Child hidden method");
    }
}
