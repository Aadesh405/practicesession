package org.example;

import java.util.Scanner;

public class ReverseOfThreeDigit {
    public static void main(String[] args) {
    int rev = 0;

        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in );
         int num=sc.nextInt();
        System.out.println("Original Number: " + num);
      while(num != 0) {

        // to fetch last digit from num
        int digit = num % 10; //123%10=3
        rev = rev * 10 + digit; //0*10+3=3

        //to remove  last digit from num
        num /= 10; //123/10=12
       }

    System.out.println("Reversed Number: " + rev);
}}
