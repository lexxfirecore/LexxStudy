package com.lexx.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\fol der\\temp.tmp");
        file.getParentFile().mkdirs();
        System.out.println(file.getAbsoluteFile());
        try {
            if (!file.exists()) {
                System.out.println("file doesnt exit. Creating...");
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("any text" + new Date());
            System.out.println("writing any text and date");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File Separator: \"" + System.getProperty("file.separator") + "\"");
    }
}
