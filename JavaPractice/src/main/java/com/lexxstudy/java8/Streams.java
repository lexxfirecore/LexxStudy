package com.lexxstudy.java8;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.lexxutils.Utils;
import static com.lexxutils.Utils.print;

/**
 * Created by alexandruco on 3/7/2016.
 */
public class Streams {
    public static void main(String[] args) {
        print("Old way:");
        listFilesOld();

        print("New way:");
        listFilesNew();
    }

    private static void listFilesOld() {
        File[] files = new File(".").listFiles();
        for (File file : files) {
            if (file.isHidden()) {
                System.out.println(file.getName());
            }
        }
    }

    private static void listFilesNew() {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        List<File> hiddenFileList = Arrays.asList(hiddenFiles);
        hiddenFileList.stream().map(File::getName).forEach(System.out::println);
    }

}
