package org.example;

import java.util.Scanner;

public class SumOfDigits {
    static int sumDigits(int no)
    {
        if (no == 0) {
            return 0;
        }

        return (no % 10) + sumDigits(no / 10);
    }


    public static void main(String[] args)
    {
        System.out.println("Enter number:-");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(sumDigits(num));
    }
}
