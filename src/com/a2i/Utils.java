package com.a2i;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;


public class Utils
{

    public static int sumArraylist(ArrayList<Integer> xs)
    {
//		int val = 0;
//			for (int j=0; j < xs.size(); j++)
//			{
//				val += xs.get(j);
//			}
//		return val;

        int val = 0;
        for (Integer x : xs)
        {
            val += x;
        }
        return val;



//		return xs.stream()
//				.reduce(0, (acc, x) -> acc + x);
//
    }


    /**
     * create a list of the prime factors of n
     *
     * @param n number to find the prime factors of
     * @return list of prime factor
     */
    static List<Integer> primeFactors(long n)
    {
        List<Integer> xs = new ArrayList<>();

        while (n % 2 == 0)
        {
            xs.add(2);
            n /= 2;
        }

        int factor = 3;
        while (sqrt(n) > 1)
        {
            while (n % factor == 0)
            {
                xs.add(factor);
                n = n / factor;
            }
            factor += 2;
        }
        return xs;
    }

}