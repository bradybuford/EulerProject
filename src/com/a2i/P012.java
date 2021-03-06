package com.a2i;

/**
 * Created by brady.buford on 7/14/2017.
 *
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would
 * be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 *                                                                      1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * Let us list the factors of the first seven triangle numbers:
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * What is the value of the first triangle number to have over five hundred divisors?
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

public class P012
{
    public static void main(String[] args) throws IOException
    {
        double time1 = System.nanoTime();
        //Beginning of code

        
        int triNum = 0, numOfFactors = 320, j = 0;
        ArrayList<Integer> listTri = new ArrayList();
        ArrayList<Integer> listFactors = new ArrayList();

        ArrayList<ArrayList<Integer>> listoflistFactors = new ArrayList<ArrayList<Integer>>();

        for (int n = 1; listFactors.size() <= numOfFactors; n++)
        {
            listFactors.clear();
            triNum = 0;
            for (int nTemp = n; nTemp != 0; nTemp--)
            {
                triNum += nTemp;


            }
//            System.out.println(triNum+":");
            listTri.add(triNum);
            for (int i = 1; i <= triNum; i++)
            {
                if (triNum % i == 0)
                {
//                    System.out.println("\t"+i);
                    listFactors.add(i);
                }

            }
//            System.out.println("\t"+listFactors+"\t"+listFactors.size());
            if (listFactors.size() >= numOfFactors)
            {
                System.out.println(listTri.get(listTri.size()-1));
//                System.out.println(listFactors);
                System.out.println(listFactors.size());
                break;
            }

//            listoflistFactors.add(j,listFactors);
            j++;

        }


//        System.out.println(listTri);
//        System.out.println(listoflistFactors.get(6));


        //End of code
        double time2 = System.nanoTime();
        double timeTaken_sec = (time2 - time1) / 1000000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " seconds");
    }
}