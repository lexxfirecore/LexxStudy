package com.lexxstudy.ftp;

import sun.net.ftp.FtpClient;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;

/**
 * Created by alexandruco on 2/11/2016.
 */
public class FtpUtils {

    public static void main(String[] args) {
        try {
            checkFTP();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkFTP() throws IOException {
        String host = "192.168.143.113";
        String user = "lexx";
        String pass = "123";

        String filePath = "D:/Test/";

        FTPClient ftpClient = new FTPClient();
        ftpClient.connect(host);
        ftpClient.login(user,pass);

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
