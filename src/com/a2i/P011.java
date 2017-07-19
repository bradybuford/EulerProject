package com.a2i;

/**
 * Created by brady.buford on 7/10/2017.
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



public class P011
{
    public static void main(String[] args) throws IOException
    {
        long time1 = System.nanoTime();
        //Beginning of code

        List<Integer> listNums = new ArrayList<>();

        File path = new File("problem8.txt");
        System.out.println("We got a file: "+path);

        System.out.println("Does it exist? "+path.exists());


        String content = new String(Files.readAllBytes(Paths.get("problem11.txt")));
        System.out.println(content);
        content = content.replaceAll("\\s+","");
        String str = "123";
        String[] res = new String[content.length()];
        for (int i = 0; i < content.length(); i++) {
            res[i] = Character.toString(content.charAt(i));
        }
        int y=0;
        for (int i = 0; i < res.length; i++) {
            y = Integer.parseInt(String.valueOf(res[i]));
            listNums.add(y);
        }

       System.out.println("\n\n"+listNums);





        //End of code
        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("\nTime taken: " + timeTaken_sec + " millisecond");
    }
}