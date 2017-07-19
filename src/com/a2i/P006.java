package com.a2i;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

/**
 * Created by brady.buford on 6/20/2017.
 */
public class P006
{
    public static void main(String[] args)
    {
        long time1 = System.nanoTime();
        //Beginning of code

        int max_nums = 100;
        int sumed_squares = 0, squared_sums = 0, sum = 0, diff = 0;
        for (int n = 1; n <= max_nums; n++)
        {
            sumed_squares += (int)Math.pow(n,2);
            sum += n;
        }
        squared_sums = (int)Math.pow(sum,2);
        diff = squared_sums -sumed_squares;
        System.out.println(" "+squared_sums+"\n-"+sumed_squares+"\n="+diff);

        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}
