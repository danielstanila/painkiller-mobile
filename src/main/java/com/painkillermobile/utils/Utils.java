package com.painkillermobile.utils;

import com.painkillermobile.domain.Media;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {

    public static Media loadMedia(String path) {
        File file = new File(path);
        byte[] bytes = Utils.getBytesFromFile(file);
        return new Media(4, "http://testmediaurl.test", bytes, file.length(), Utils.getMd5(bytes));
    }

    private static byte[] getBytesFromFile(File file) {
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    private static byte[] getMd5(byte[] bytes) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        assert messageDigest != null;
        return messageDigest.digest(bytes);
    }
}
