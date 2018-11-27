package com.lexx.security;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Iterator;
import javax.crypto.Cipher;

public class ShowCryptoProviders {
    private static final String EOL = System.getProperty("line.separator");

    public static void main(final String[] args) throws NoSuchAlgorithmException {

        if(args.length > 0) {
            System.out.println("args>0, set unlimited");
            Security.setProperty("crypto.policy", "unlimited");
        }
        printJceMaxKeyLength();
       // printProviders(args);
    }

    private static void printJceMaxKeyLength() throws NoSuchAlgorithmException {

        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));
        System.out.println("Security.getProperty(\"crypto.policy\") = " + Security.getProperty("crypto.policy"));
        int maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength("AES");
        System.out.println("\ngetMaxAllowedKeyLength(\"AES\"): " + maxAllowedKeyLength);
        final int maxAllowedKeyLengthJCE = 2147483647;
        if (maxAllowedKeyLength == maxAllowedKeyLengthJCE) {
            System.out.println("JCE installed. Expected: " + maxAllowedKeyLengthJCE + "\n");
        } else {
            System.out.println("When JCE not installed, MaxAllowedKeyLength is 128.\n");
        }
    }

    private static void printProviders(String[] args) {
        final Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            final String name = providers[i].getName();
            final double version = providers[i].getVersion();
            System.out.println("Provider[" + i + "]:: " + name + " " + version);
            if (args.length > 0) {
                final Iterator it = providers[i].keySet().iterator();
                while (it.hasNext()) {
                    final String element = (String) it.next();
                    if (element.toLowerCase().startsWith(args[0].toLowerCase())
                            || args[0].equals("-all"))
                        System.out.println("\t" + element);
                }
            }
        }
    }
}
