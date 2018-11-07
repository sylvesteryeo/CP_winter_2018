package pl.waw.sgh;

import java.util.Arrays;

public class ArraysSimple {
    public static void main(String[] args) {
        int[] arrInt = new int[3];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Elem " + i + " = " + arrInt[i]);
        }
        System.out.println(Arrays.toString(arrInt));
        String[] arrStr = new String[]{
                "abc", "def", "ghi"
        };

        //System.out.println(Arrays.toString());
    }
}
