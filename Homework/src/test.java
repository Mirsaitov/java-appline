import java.io.*;
public class test {
    public static void main(String[] args) throws IOException {
       double[] Array = {11,5.8,11.1,10.9};
       double max = Double.MIN_VALUE;
       for(int i =1 ; i < Array.length; i++){
           max = Math.max(max,Array[i]);

       }
System.out.println(max);
    }
}


