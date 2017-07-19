package com.a2i;

/**
 * Created by brady.buford on 6/18/2017.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these \
 * multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

import java.util.ArrayList;

public class P001
{
    public static void main(String[] args)
    {
        long time1 = System.nanoTime();
        //Beginning of code

        ArrayList<Integer> multiplesOf3And5 = new ArrayList();
        for (int i=1; i<1000; i++)
        {
            if (i % 3 == 0 | i % 5 == 0)
            {
                multiplesOf3And5.add(i);
            }
        }
        int answer;
        answer = Utils.sumArraylist(multiplesOf3And5);
        System.out.println("The sum of the multiples of the \n" + "3 and 5 below 1000 is " + answer);

        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}

