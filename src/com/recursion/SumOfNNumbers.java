package com.recursion;

/**
 * @author Prasenjit Kumar Das
 */
public class SumOfNNumbers {
    public static void main(String[] args) {
        int n=3,sum=0;
        //sumOfN(n,sum);
        System.out.println(sumOfN(n));

    }

    private static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfN(n-1);
    }

//    private static void sumOfN(int n, int sum) {
//        if(n<1){
//            System.out.println(sum);
//            return;
//        }
//        sumOfN(n-1,sum+n);
//    }
}
