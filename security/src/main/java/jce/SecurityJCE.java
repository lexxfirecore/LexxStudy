package jce;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
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

    public static void main(String[] args) {
        byte[] input = "My super secret text".getBytes();
        SecureRandom random = null;
        try {
            random = SecureRandom.getInstanceStrong();
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128, random);
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
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }


    }

}
