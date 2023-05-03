package org.example;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoHashSet {


        public static void main(String[] argv)
        {

            Set<Integer> oldScore = new HashSet<Integer>();

            oldScore.add(5);
            oldScore.add(7);
            oldScore.add(9);
            oldScore.add(11);

            System.out.println("The scores"+ oldScore);
            System.out.println("The size of the 1st set is: "+ oldScore.size());
            System.out.println();
            // NEw HAshset
            Set<Integer> newScore = new HashSet<Integer>();

            newScore.add(5);
            newScore.add(9);
            newScore.add(13);
            newScore.add(1);
            newScore.add(12);


            System.out.println("NEW score "+ newScore);
            System.out.println(newScore.size());

            System.out.println();
            boolean compare=false;
            if (oldScore.size()== newScore.size()){
            for (int x:oldScore) {

                if(newScore.contains(x)){
                    compare=true;
                }
                else compare=false;

            }
              }
            System.out.println(compare);


        }
    }
