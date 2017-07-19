package com.a2i;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import static java.lang.Math.sqrt;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.net.URL;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;



/**
 * Created by brady.buford on 6/20/2017.
 */
public class Playground
{


    public static void main(String[] args) throws IOException
    {
        double time1 = System.nanoTime();
        //Beginning of code


        for(int i = 0; i < 1000000; i++)
        {
            System.out.println(i);
        }



        //End of code
        double time2 = System.nanoTime();
        double timeTaken_sec = (time2 - time1) / 1000000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " seconds");
    }
}







//    long time1 = System.nanoTime();

//    long time2 = System.nanoTime();
//    long timeTaken_sec = (time2 - time1) / 1000000;
//    System.out.println("Time taken: " + timeTaken_sec + " millisecond");