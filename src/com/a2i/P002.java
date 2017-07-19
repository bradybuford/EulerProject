package com.a2i;

import java.util.ArrayList;

public class P002
{
    public static void main(String[] args)
    {
        long time1 = System.nanoTime();
        //Beginning of code

        ArrayList<Integer> fibonacciSequence = new ArrayList();
        fibonacciSequence.add(1);
        fibonacciSequence.add(2);
        int i=0;
//        System.out.println(fibonacciSequence.size());
        int max_num = 4000000;
        while (fibonacciSequence.get(fibonacciSequence.size()-1) < max_num)
        {
            if (fibonacciSequence.get(i) + fibonacciSequence.get(i + 1) < max_num)
            {
                fibonacciSequence.add(fibonacciSequence.get(i) + fibonacciSequence.get(i + 1));
//                System.out.println(fibonacciSequence);
//                System.out.println("i= " + i);
//                System.out.println("Size= " + fibonacciSequence.size() + "\n");
                i++;
            }
            else
            {
               break;
            }
        }

        System.out.println(fibonacciSequence);

        ArrayList<Integer> evenValues = new ArrayList();
        for (i = 0; i < fibonacciSequence.size(); i++)
        {
            if (fibonacciSequence.get(i) % 2 == 0)
            {
                evenValues.add(fibonacciSequence.get(i));
                //                System.out.println(fibonacciSequence);
                //                System.out.println("i= " + i);
                //                System.out.println("Size= " + fibonacciSequence.size() + "\n");
            }
        }

        System.out.println(evenValues);


        int answer = 0;
        for (i=0; i < evenValues.size(); i++)
        {
            answer += evenValues.get(i);
        }
        System.out.println("The sum of the even-valued terms \n"
                + "in the Fibonacci sequence whose \n"
                + "values don't exceed 4 million is " + answer);

        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}