package pl.waw.sgh;

import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        File inFile = new File("h:\\mytxtfile.txt");
        File inFile = new File("h:/mytxtfile.txt");
        File inFile = new File("h:" + File.separator + "mytxtfile.txt");

        Scanner scanner = new Scanner(inFile);
    }

}
