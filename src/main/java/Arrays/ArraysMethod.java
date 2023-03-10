package Arrays;

public class ArraysMethod {




    public int[] printingInMainMethod()
        {
            int[] values = new int[10];
            for(int i=0;i<values.length;i++)
        {
            values[i]=i+1;
        }

        System.out.println(values);

             return values;
     }



}
