package com.a2i;

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



/**
 * Created by brady.buford on 6/20/2017.
 */
public class Playground
{


    public static void main(String[] args) throws IOException
    {
        long time1 = System.nanoTime();


        int a = 2, b = 2, c = 0;
        c = (int)(sqrt((double)((a*a)+(b*b))));
        System.out.println(a+"^2+"+b+"^2="+c);


        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("Time taken " + timeTaken_sec + " millisecond");



    }
}







//    long time1 = System.nanoTime();

//    long time2 = System.nanoTime();
//    long timeTaken_sec = (time2 - time1) / 1000000;
//    System.out.println("Time taken: " + timeTaken_sec + " millisecond");