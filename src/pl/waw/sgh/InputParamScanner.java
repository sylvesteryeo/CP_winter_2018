package pl.waw.sgh;

import java.util.Scanner;

public class InputParamScanner {

    public static void main(String[] args) {
        System.out.println("this is an output");
        System.err.println("This is an error");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
