package task1;

import java.util.ArrayList;
import java.util.HashSet;

public class HelloWorld {
    public static void main(String args[]) throws Exception {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.ceil(Math.random() * 100);
        }

        System.out.println("Just random numbers");
        for (double x: arr) {
            if (x > 20) {
                System.out.println(x);
            } else {
                System.out.println(x + 1000);
            }
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello ");
        list.add("World ");
        list.add("Hello ");
        list.add("World ");
        for (String y: list) {
            System.out.print(y);
        }
        HashSet<String> hash = new HashSet<String>();
        hash.add("Hello ");
        hash.add("World ");
        hash.add("Hello ");
        hash.add("World ");
        for (String y: hash) {
            System.out.print(y);
        }
    }
}
