package pl.waw.sgh;

import java.io.File;

public class Filesize {

    public static void main(String[] args) {
        File newFile = new File("c:/temp");
        String parent_path = newFile.getPath();

        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    File downfile = new File(parent_path + "/" + f.getName());
                    for (File g : downfile) {
                        System.out.println(g.getName() + " " + g.length());
                    }
                } else {
                    System.out.println(f.getName() + " " + f.length());
                }
            }
        }
    }
}

