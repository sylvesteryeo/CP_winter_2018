package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        String home = System.getProperty("user.home");
        System.out.println(home);

        File myFile = new File(home + "/myfile.txt");

        System.out.println("your file: " + myFile.getAbsolutePath()
                + " exists: " + myFile.exists() +
                " last modified: " + new Date(myFile.lastModified()));

        FileWriter fw = new FileWriter(myFile, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("my first line");
        bw.newLine();
        bw.write("2nd line \r\n");
        bw.flush();
        bw.write("3rd line");
        //always a good practice to end with a new line
        bw.newLine();

        /*
            buffer allows it to write everything at one go, instead of line by line
            drawback is if the data is very big, and someone pulls the plug before it is written to the file, the data will be lost
            as it is in the "memory"
         */
        bw.close();
        fw.close();
    }
}
