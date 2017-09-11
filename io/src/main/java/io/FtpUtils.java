package com.lexx.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 * Created by alexandruco on 2/11/2016.
 */
public class FtpUtils {

    public static final String ftpHost = "192.168.143.113";
    public static final String username = "lexx";
    public static final String password = "123";

    public static void main(String[] args) {
        try {
            checkFTP();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkFTP() throws IOException {


        String filePath = "D:/Test/";

        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(ftpHost);
        ftpClient.login(username,password);

        File file = new File(filePath + "out.txt");

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("some text for the file");
        fileWriter.flush();
        fileWriter.close();


        char[] chars = new char[50];

        FileReader fileReader = new FileReader(file);

        fileReader.read(chars, 0, 10);
        System.out.println(chars);
        fileReader.close();


    }
}
