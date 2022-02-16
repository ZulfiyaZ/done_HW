package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = a + (int) (Math.random() * b);
        int random_number3 = a + (int) (Math.random() * b);
        int random_number4 = a + (int) (Math.random() * b);

        int sum_1 = random_number1 + random_number2;
        int sum_2 = random_number3 + random_number4;
        boolean result_sum = sum_1 > sum_2;
        System.out.println(result_sum);

        int sum_tot_1 = sum_1 + 1;
        int sum_tot_2 = sum_2 - 2;
        boolean sum_tot = (sum_tot_1 > sum_tot_2);
        System.out.println(sum_tot);

        boolean res_tot = (sum_tot_1 % 2 != 0) || (sum_tot_2% 2 != 0);
        System.out.println(res_tot);
    }
}
