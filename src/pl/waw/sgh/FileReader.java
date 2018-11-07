package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("h:\\mytxtfile.txt");
        /*
            C: temp/Hello.java is an absolute path.
            C represents the root. absolute path contains the root
            .. represents "back" one file
            relative path is something like how the other file is located relative to the cwd
            for mac,the beginning "/" represents the root
            relative path cant connect between different drives
        */
        //File inFile = new File("h:/mytxtfile.txt");
        //File inFile = new File("h:" + File.separator + "mytxtfile.txt");

        Scanner scanner = new Scanner(inFile);
        int i = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] elems = line.split(";");
            System.out.println("Line " + i + " : " + line);
            i++;
        }
    }

}

/*
    generate a board of tic tac toe game
    set -1 0 1 for o empty x
    check the status of the game
 */