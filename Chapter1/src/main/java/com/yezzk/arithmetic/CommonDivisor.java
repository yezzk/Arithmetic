package com.yezzk.arithmetic;

/**
 * @author yezzk
 * @version 1.0
 * @date 2021/3/20 19:37
 */
public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(GCD(33, 21));
    }
    /**
     * p2 1.3伪代码 求两个整数的最大公约数
     * @param a
     * @param b
     * @return
     */
    public static int GCD(int a, int b){
        while (b!=0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
