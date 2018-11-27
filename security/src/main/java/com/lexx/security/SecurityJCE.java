package com.lexx.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/**
 * Created by Alex Corghencea on 30 October 2018.
 */
public class SecurityJCE {

    public static void main(String[] args) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, NoSuchProviderException, InvalidAlgorithmParameterException, InterruptedException {
        decrypt(128);
        decrypt(256);
        decrypt(192);
        decrypt(256);
        decrypt(512);
    }

    private static void decrypt(int keySize) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException, InterruptedException, InvalidAlgorithmParameterException, InvalidKeyException {

        Thread.sleep(100);
        System.out.println("Test key size: " +keySize);
        byte[] input = ("My super secret text").getBytes();
        SecureRandom random = null;

        random = SecureRandom.getInstanceStrong();
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");

        try {
            keyGen.init(keySize, random);
        } catch (InvalidParameterException e){
            System.out.println("\nException at key size " + keySize);
            e.printStackTrace();
        }

        SecretKey key = keyGen.generateKey();

        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding", "SunJCE");
        byte[] iv = new byte[12];
        random.nextBytes(iv);
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);

        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
        byte[] cipherText = cipher.doFinal(input);
// Decrypt
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        byte[] plainText = cipher.doFinal(cipherText);
        System.out.println(new String(plainText));


    }

}
