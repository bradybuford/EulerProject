package com.a2i;

/**
 * Created by brady.buford on 6/18/2017.
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;


/**
 * 600,851,475,143
 * Created by brady.buford on 6/19/2017.
 */


public class P003
{
    public static void main(String[] args)
    {
        long time1 = System.nanoTime();
        //Beginning of code

        long max_num = 600851475143L;
        List<Integer> primeNumbers = Utils.primeFactors(max_num);


        System.out.println("Factors: " + primeNumbers);
        System.out.println("Largest prime factor: " + primeNumbers.get(primeNumbers.size()-1));

        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}