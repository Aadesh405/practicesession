package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sorting {


        public static void main(String[] args) {
            int[] arr = {1, 1, 1, 2, 3, 3, 6, 6, 7};

            // Convert the array to a list
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }


            List<Integer> uniqueList = new ArrayList<>();


            // Iterate through the list and add each unique element to uniqueList
            for (int i = 0; i < list.size(); i++) {
                if (i == 0 || !list.get(i).equals(list.get(i - 1))) {
                    uniqueList.add(list.get(i));
                }
            }
            System.out.println("dddd");
            for (int num : uniqueList) {
                System.out.print(num + " ");
                System.out.println("aadesh");}
        }
}


//    public static int[] removeDuplicates(int[] nums) {
//        if (nums.length == 0) {
//            return nums;
//        }
//        int index = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[index]) {
//                index++;
//                nums[index] = nums[i];
//            }
//        }
//        int[] result = new int[index + 1];
//        for (int i = 0; i <= index; i++) {
//            result[i] = nums[i];
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 2, 3, 3, 6, 6, 7};
//        int[] result = removeDuplicates(nums);
//
//        System.out.print("Output: ");
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//    }


