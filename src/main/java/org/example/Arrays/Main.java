package org.example.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArraysMethod arraysMethod = new ArraysMethod();
        int[] arrays1 = arraysMethod.printingInMainMethod();


       System.out.println(arrays1);
     // System.out.println(arraysMethod.printingInMainMethod());   //doubt address is not same

        for(int i=0; i < arrays1.length;i++)
        {
            System.out.println(arrays1[i]);
        }
    }
}
