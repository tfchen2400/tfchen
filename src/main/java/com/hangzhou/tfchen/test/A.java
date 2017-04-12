package com.hangzhou.tfchen.test;

import java.io.*;

/**
 * @author chentf(水言Dade)
 * @e-mail tfchen5211@foxmail.com
 * @date 2017/1/19 9:50
 * @描述：
 * @注意事项：
 */
public class A {
    public static void main(String[] args) {
        String fileName = "D:" + File.separator + "hello.txt";
        File f = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(f);
            System.out.println("------" + inputStream.read() + "------------");
            int i = -1;
            do {
                i = inputStream.read();
                System.out.println(i);
            } while (i > 0);
            System.out.println("---");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
