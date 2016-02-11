package com.lexxstudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alexandruco on 2/11/2016.
 */
public class IOStream {
    public static SimpleDateFormat df = new SimpleDateFormat("_HHmmss");
    public static String filePath = "D:\\Test\\file" + df.format(new Date()) + ".txt";

    public static void main(String[] args) {

        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();
            listFiles(file);
            fileWriter(file);
            fileReader(file);
            fileOutputStream(file);
            fileInputStream(file);
            listFiles(file);
            deleteFiles(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listFiles(File file) {
        File parentFile = file.getParentFile();
        System.out.println("\nFiles in: " + parentFile);
        for (File f : parentFile.listFiles()) {
            System.out.println(f.getName() + " - " + f.length() + "B");
        }
    }

    private static void deleteFiles(File file) {
        File parentFile = file.getParentFile();
        System.out.println("\nDeleting files older that 5 min if any: " + parentFile);
        for (File f : parentFile.listFiles()) {
            if( f.lastModified() < (new Date()).getTime() - 5*60*1000 )
            System.out.println("deleting file " + f.getName());
            f.delete();
        }
    }

    public static void fileWriter(File file) throws IOException {
        System.out.println("\nfileWriter() writing: " + filePath);
        FileWriter fileWriter;
        fileWriter = new FileWriter(file);
        fileWriter.write("text wrote by FileWriter");
        fileWriter.flush();
        fileWriter.close();
    }

    private static void fileReader(File file) throws IOException {
        char[] chars = new char[50];
        System.out.println("\nfileReader() reading file: " + filePath);
        FileReader fileReader = new FileReader(file);
        fileReader.read(chars);
        System.out.println(chars);
        fileReader.close();
    }

    public static void fileOutputStream(File file) throws IOException{
        System.out.println("\nfileOutputStream() writing: " + filePath);
        FileOutputStream fos = new FileOutputStream(file);
        String text = "text wrote by FileOutputStream.";
        char[] chars = text.toCharArray();
        for (int i=0; i<chars.length; i++){
            fos.write(chars[i]);
        }
        fos.flush();
        fos.close();
    }

    public static void fileInputStream(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        System.out.println("\nfileInputStream() reading file: " + filePath);
        int c;
        while ((c = fis.read()) != -1) {
            sb.append((char)c);
        }
        System.out.println(sb.toString());
        fis.close();
    }


}
