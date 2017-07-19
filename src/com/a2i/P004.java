package com.a2i;

/**
 * Created by brady.buford on 6/19/2017.
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

public class P004
{
    public static void main(String[] args)
    {
        double time1 = System.nanoTime();
        //Beginning of code


        int n = 0;
        int flipped = 0;
        int original = 0;
        int z = 0;
        int max_num = 999;
        int min_num = 99;
        int max = 0;

        for (int j = max_num; j > min_num; j--)
        {
            int k = max_num - z;
            while ( k > min_num)
            {
                n = j*k;
                int length = (int) (Math.log10(n) + 1);

                original = n;
                for (int i = 0; i < length; i++)
                {
                    flipped += n % 10 * (int) Math.pow(10, (length - 1 - i));
                    n = n / 10;
                }
                if (original == flipped)
                {
                    if (flipped > max)
                    {
                        max = flipped;
                    }
//                    System.out.print(j+" * "+k+" = "+original+"  = "+flipped+"  It's a palindrome\n");
//                    flipped = 0;
                    break;
                }
                else
                {
//                    System.out.print(j+" * "+k+" = "+original+" != "+flipped);
//                    System.out.print("\n");
                    flipped = 0;
                }
                k--;
            }
//            if (original == flipped)
//            {
//              break;
//            }
//            z++;
        }
        System.out.println(max);

        //End of code
        double time2 = System.nanoTime();
        double timeTaken_sec = (time2 - time1) / 1000000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " seconds");
    }
}
