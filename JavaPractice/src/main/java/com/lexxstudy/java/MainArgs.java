package com.lexxstudy.java;
import org.apache.commons.lang3.ArrayUtils;

public class MainArgs {

    public static void main(String[] args) {
        if (args == null) {
            staticMain(new String[]{"arg0", "arg1", "arg2", "arg3", "arg4", "arg5"});
        }
    }

    public static void staticMain(String[] args) {
        System.out.println("original args:");
        for (String arg : args) {
            System.out.println(arg + " ");
        }

        System.out.println("\nRemove arg 3");
        args = ArrayUtils.remove(args, 3);
        for (String arg : args) {
            System.out.println(arg + " ");
        }
    }
}
