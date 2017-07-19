package com.a2i;

/**
 * Created by brady.buford on 6/20/2017.
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

public class P005
{
    public static void main(String[] args)
    {
        double time1 = System.nanoTime();
        //Beginning of code

        int n = 20;
        int max_factors = 20;
        boolean b = true;

        while (b == true)
        {
            for (int i = 1; i <= max_factors; i++)
            {
                if (n % i == 0 & i == max_factors)
                {
                    System.out.print(n+"\nSmallest Multiple of 1-"+max_factors);
                    b = false;
                }
                if (n % i != 0)
                {
                    break;
                }
            }
            n++;
        }

        //End of code
        double time2 = System.nanoTime();
        double timeTaken_sec = (time2 - time1) / 1000000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " seconds");
    }
}
