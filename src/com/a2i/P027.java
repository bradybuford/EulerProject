package com.a2i;

/**
 * Created by brady.buford on 7/14/2017.
 *
 * Euler discovered the remarkable quadratic formula:
 *                                                         n^2+n+41
 * It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39.
 * However, when n=40,40^2+40+41=40(40+1)+41 is divisible by 41,
 * and certainly when n=41,41^2+41+41 is clearly divisible by 41.
 * The incredible formula n^2−79n+1601 was discovered, which produces 80 primes for the consecutive values 0≤n≤79.
 * The product of the coefficients, −79 and 1601, is −126479.
 * Considering quadratics of the form:
 *                                      n^2+an+b, where |a|<1000 and |b|≤1000
 *                                      where |n||n| is the modulus/absolute value of nn
 *                                      e.g. |11|=11 and |−4|=4
 * Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of
 * primes for consecutive values of nn, starting with n=0.
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
        double time1 = System.nanoTime();
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
        double time2 = System.nanoTime();
        double timeTaken_sec = (time2 - time1) / 1000000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " seconds");
    }
}