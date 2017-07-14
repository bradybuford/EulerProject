package com.a2i;

/**
 * Created by brady.buford on 7/14/2017.
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



public class P027
{
    public static void main(String[] args) throws IOException
    {
        long time1 = System.nanoTime();
        //Beginning of code

        boolean isprime = true;
        long prime = 0, product = 0;
        int numOfPrimes = 0, maxNumOfPrimes = 0, maxA = 0, maxB = 0;

        for (int a = -1000; a <= 1000; a++)
        {
            for (int b = -1000; b <= 1000; b++)
            {
                if (numOfPrimes > maxNumOfPrimes)
                {
                    maxNumOfPrimes = numOfPrimes;
                    maxA = a;
                    maxB = b-1;

                }
                isprime = true;
                numOfPrimes = 0;
                for (int n = 0; isprime == true; n++)
                {
                    prime = n*n + a*n + b;
                    for (int i = 2; i <= prime; i++)
                    {
                        if (i==prime | prime == 2)
                        {
//                            System.out.println(prime);
                            numOfPrimes++;
                        }
                        if (prime % i == 0 & i != prime)
                        {
                          isprime = false;
                          break;
                        }
                    }
                }
            }
        }
        product = maxA*maxB;
        System.out.println("a = "+maxA+"  b = "+maxB);
        System.out.println("number of consecutive primes: "+maxNumOfPrimes);
        System.out.println("The product of a & b is: "+product);




        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}