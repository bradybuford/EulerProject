package com.a2i;
import java.util.ArrayList;

public class P001
{
    public static void main(String[] args)
    {
        ArrayList<Integer> multiplesOf3And5 = new ArrayList();
        for (int i=1; i<1000; i++)
        {
            if (i % 3 == 0 | i % 5 == 0)
            {
                multiplesOf3And5.add(i);
            }
        }
        int answer;
        answer = Utils.sumArraylist(multiplesOf3And5);
        System.out.println("The sum of the multiples of the \n" + "3 and 5 below 1000 is " + answer);

    }
}

