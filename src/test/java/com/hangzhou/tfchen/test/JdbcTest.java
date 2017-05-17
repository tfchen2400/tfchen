package com.hangzhou.tfchen.test;


public class JdbcTest {

    public static void main(String[] args) {
        Double n = Double.NaN;
        int level = 5;
        level++;
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level - i; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++) {
                if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" *");
            }
//            for (int j = 0; j < level - i; j++)
//                System.out.print(" ");
            System.out.println();
        }
    }

}
