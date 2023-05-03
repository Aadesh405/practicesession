package org.example;

import java.util.stream.Stream;

public class Student{

    public static void main(String[] args) {

                Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);
                Stream<Integer> filteredNums = nums.filter(n -> n % 2 == 1);

                filteredNums.forEach(p -> System.out.print(p));
            }

//            Student one = new Student();//3
//            Student two= one;//4
//            System.out.println(one);
//            Student three= two;//5
//            System.out.println(one);
//            one =null;//6
//            System.out.println(one);
//            Student four=one;//7
//            System.out.println(one);
//            two =null;//8
//            System.out.println(one);
//            three =new Student();//9
//            System.out.println(one);
//            System.gc();//10
//            System.out.println(one+"5555555555");
            }//11}



