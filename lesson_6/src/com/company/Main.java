package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 201;
        int c = 1;
        int d = 4;

        int sum_1 = a + b;
        int sum_2 = c + d;
        boolean result_sum = sum_1 > sum_2;
        System.out.println(result_sum);

        sum_1 += 1;
        sum_2 -= 2;
        boolean sum_tot = (sum_1 > sum_2);
        System.out.println(sum_tot);

        System.out.println ((sum_1 % 2 == 0) || (sum_2 % 2 == 0));
    }
}