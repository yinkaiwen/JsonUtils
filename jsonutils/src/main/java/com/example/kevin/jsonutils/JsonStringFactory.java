package com.example.kevin.jsonutils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kevin on 2018/1/26.
 * https://github.com/yinkaiwen
 */

public class JsonStringFactory {

    static String getString(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }

        String jsonString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = -1;
        byte[] b = new byte[1024 * 4];
        try {
            while ((len = inputStream.read(b)) != -1) {
                bos.write(b, 0, len);
            }
            jsonString = bos.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonString;
    }


    static String getString(byte[] bytes) {
        if (bytes == null) {
            return "";
        } else {
            return bytes.toString();
        }
    }

}
