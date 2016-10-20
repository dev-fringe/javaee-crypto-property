package dev.fringe;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Encoder {
    public String encode(String str) {
        StandardPBEStringEncryptor pes = new StandardPBEStringEncryptor();
        pes.setPassword("jasypt");
        String encryptedPassword = pes.encrypt(str);
        return encryptedPassword;
    }

    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        System.out.println(encoder.encode("jdbc:oracle:thin:@10.0.42.27:2003:PIDDEV"));
        System.out.println(encoder.encode("KALPAS"));
        System.out.println(encoder.encode("pqow0192!"));
    }
}
