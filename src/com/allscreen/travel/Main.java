package com.allscreen.travel;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import javax.imageio.IIOException;
import java.io.*;

import java.nio.file.Paths;
import java.nio.file.Files;


public class Main {

    public static void main(String[] args) {



HelperFiles.ReadFile("out/production/Project 3/com/allscreen/travel/file.txt");

        try(InputStream in = new FileInputStream("out/production/Project 3/com/allscreen/travel/file.txt");)
        {
            HelperFiles.ReadChar(in);


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }



        //System.out.println("Hello World!");

//        try (BufferedReader reader = Files.newBufferedReader(Paths.get("/Users/admin/IdeaProjects/Project 3/out/production/Project 3/com/allscreen/travel/file.txt")); BufferedWriter writer = Files.newBufferedWriter(Paths.get("/Users/admin/IdeaProjects/Project 3/out/production/Project 3/com/allscreen/travel/file2.txt"));)
//
//        {
//
//
//          String lineReader;
//
//          lineReader = reader.readLine();
//
//            System.out.println(lineReader);
//
//            writer.write(lineReader);
//            writer.newLine();
//
//
//        }
//
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//

//        String s1 = "I Love Egypt";
//        String s2 = "I Love egypt";
//        String s3 = s1.intern();
//        String s4 = s2.intern();
//        Integer x = new Integer(10);
//
//        s3 = x.toBinaryString(10);
//
//
////s1.contains("I Love");
//        System.out.println(s3);
//        System.out.println(s1.toUpperCase().equals(s2));
//        System.out.println(s3 == s4);
//
//
//        Flight flight1 = new Flight();
//        System.out.println(flight1.toString());


//        Flight flight2 ;
//        double [] numbers = new double [100];
//
//        flight2 = flight1;
//
//       // System.out.println(flight2.airline);
//
//        int[] array ={1,2,3,4,5,6,7,8,9};
//        int sum = 0;
//        for (int count:array){
//            sum +=count;
//
//
//
//        }
//
//        System.out.println(sum);
//        numbers = flight2.getNumbers();
//
//
//        for(double currentVal:numbers )
//        {
//            System.out.print(currentVal+" ");
//
//
//        }
//
//        Object xyx = new Flight();
//        Object xyz = new Flight();
//
//        if ( xyz.equals(xyx))
//        {
//        System.out.println("\n" + "TRUE");}
//        else{
//        System.out.println("\n" + "FALSE");}
//
//CargoFlight cFlight = new CargoFlight(123,1000);
//

    }

}
