package pl.waw.sgh;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];

        arr2d[0][0] = 1;
        arr2d[0][2] = 4;
        arr2d[1][1] = 2;
        arr2d[2][0] = 9;
        arr2d[3][2] = 5;
        arr2d[4][3] = 6;
        arr2d[2][4] = 7;
        arr2d[4][4] = 7;

        //System.out.println(Arrays.deepToString(arr2d));

        for (int i = 0; i < arr2d.length; i++) {

        }

        int total_sum = 0;
        int column_sum_arr[] = new int[6];
        for (int i = 0; i < arr2d.length; i++) {
            int row_sum = 0;
            int column_sum = 0;
            for (int k = 0; k < arr2d[i].length; k++) {
                row_sum += arr2d[i][k];
                column_sum += arr2d[k][i];
            }
            ;
            column_sum_arr[i] = column_sum;
            System.out.println(Arrays.toString(arr2d[i]) + " " + row_sum);
            total_sum += row_sum;
        }
        ;
        column_sum_arr[5] = total_sum;
        System.out.println(Arrays.toString(column_sum_arr));
        //for (int i = 0; i < column_sum_arr.length; i++) {
        //  System.out.print(column_sum_arr[i] + " ");
        //}
    }
}