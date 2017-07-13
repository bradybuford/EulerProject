package com.a2i;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

/**
 * Created by brady.buford on 6/20/2017.
 */
public class P005
{
    public static void main(String[] args)
    {
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
    }
}
