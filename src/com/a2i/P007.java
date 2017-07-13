package com.a2i;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

/**
 * Created by brady.buford on 6/20/2017.
 */
public class P007
{
    public static void main(String[] args)
    {
        long time1 = System.nanoTime();


        int num_of_primes = 10001;
        List<Integer> xs = new ArrayList<>();
        for (int i = 2; xs.size() < num_of_primes; i+=2)
        {
            if (i == 2)
            {
                xs.add(i);
                i++;
            }
            for (int j = 3; j <= i; j++)
            {
                if (j == i & num_of_primes > 1)
                {
                    xs.add(i);
                }
                if (i % j == 0)
                {
                    break;
                }
            }
        }
        System.out.println(xs.get(num_of_primes-1));


        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("Time taken: " + timeTaken_sec + " millisecond");
    }
}

//          Old code:
//          took about 9 seconds to run

//    long time1 = System.nanoTime();
//    int factors = 0;
//    int num_of_primes = 10001;
//
//    List<Integer> xs = new ArrayList<>();
//        for (int i = 2; xs.size() < num_of_primes; i+=2)
//        {
//        if (i == 2)
//        {
//        xs.add(i);
//        i++;
//        }
//        for (int j = 3; j <= i; j++)
//        {
//        if (i % j == 0)
//        {
//        factors++;
//        }
//        if (j == i & factors == 1 & num_of_primes > 1)
//        {
//        xs.add(i);
//        }
//        }
//        factors = 0;
//        }
//        System.out.println(xs.get(num_of_primes-1));
//        long time2 = System.nanoTime();
//        long timeTaken_sec = (time2 - time1) / 1000000;
//        System.out.println("Time taken: " + timeTaken_sec + " millisecond");