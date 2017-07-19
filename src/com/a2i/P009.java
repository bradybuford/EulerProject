package com.a2i;

/**
 * Created by brady.buford on 6/22/2017.
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
                                                                                    a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

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

public class P009


{
    public static void main(String[] args)
    {
        long time1 = System.nanoTime();
        //Beginning of code


        double c=0;
        int c_int=0,sum=1000,product=0;
        boolean end = false;
        for (int a = 1; a < sum; a++)
        {
            for (int b = a; b < sum; b++)
            {
                c = (sqrt((double)((a*a)+(b*b))));
                if (a < b & b < c & (a+b+c) == sum)
                {
                    c_int = (int)c;
                    System.out.println(" a   b   c");
                    System.out.println(a+"+"+b+"+"+c_int+"="+sum);
                    product = a*b*c_int;
                    System.out.println(a+"*"+b+"*"+c_int+"="+product);
                    end = true;
                }
                if (end == true)
                {
                    break;
                }
            }
            if (end == true)
            {
                break;
            }
        }


        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}