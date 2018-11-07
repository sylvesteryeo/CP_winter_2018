package pl.waw.sgh;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I = " + i);
        }

        for (int i = 6; i > 1; i--) {
            if (i == 5) continue;
            System.out.println("I =" + i);
            if (i == 4) break;
        }
        //the position of the while depends on when it is being checked (difference between do while and while)
        int j = 0;
        while (j < 6) {
            System.out.println("J = " + j);
            j++;
        }

        int k = 6;
        do {
            System.out.println("K = " + k);
            k--;
        } while (k > 2);
    }
}
