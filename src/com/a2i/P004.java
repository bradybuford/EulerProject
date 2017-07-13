package com.a2i;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

/**
 * Created by brady.buford on 6/19/2017.
 */
public class P004
{
    public static void main(String[] args)
    {
        int n = 0;
        int flipped = 0;
        int original = 0;
        int z = 0;
        int max_num = 999;
        int min_num = 99;

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
                    System.out.print(j+" * "+k+" = "+original+"  = "+flipped+"  It's a palindrome\n");
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
            if (original == flipped)
            {
              break;
            }
            z++;
        }

    }






}
