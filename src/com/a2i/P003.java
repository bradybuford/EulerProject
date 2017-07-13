package com.a2i;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;


/**
 * 600,851,475,143
 * Created by brady.buford on 6/19/2017.
 */


public class P003
{
    public static void main(String[] args)
    {
        long max_num = 600851475143L;
        List<Integer> primeNumbers = Utils.primeFactors(max_num);


        System.out.println(primeNumbers);

    }



}