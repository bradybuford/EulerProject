package com.a2i;

/**
 * Created by brady.buford on 7/7/2017.
 * todo The prime numbers generator needs to be optimized.
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

import static java.lang.Math.sqrt;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.net.URL;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class P010
{
    public static void main(String[] args)
    {
        double time1 = System.nanoTime();
        //Beginning of code


        int nums = 2000000;

        long sum = 0;
        List<Integer> xs = new ArrayList<>();
        for (int i = 2; i <= nums; i+=2)
        {
            if (i == 2)
            {
                xs.add(i);
                i++;
            }
            for (int j = 3; j <= i; j++)
            {
                if (j == i)
                {
                    xs.add(i);
                }
                if (i % j == 0)
                {
                    break;
                }
            }
        }

//        System.out.println(xs.get(num_of_primes-1));
        for (int k = 0; k < xs.size();k++)
        {
            sum += xs.get(k);
        }

//        System.out.println(xs);
        System.out.println(sum);


        //End of code
        double time2 = System.nanoTime();
        double timeTaken_sec = (time2 - time1) / 1000000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " seconds");
    }
}