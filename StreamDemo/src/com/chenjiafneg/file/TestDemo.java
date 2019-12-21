package com.chenjiafneg.file;

/**
 * @author tyler.chen
 * @data 2019-12-18 00:30
 */
public class TestDemo {
    public static void main(String[] args) {
        int num = 5;
        int sum = getSum(num);
        System.out.println(sum);

    }
    public static int getSum(int num){
        if(num==1){
            return 1;
        }
        System.out.println(num);
        return num + getSum(num-1);


    }
}
