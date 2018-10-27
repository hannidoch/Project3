package com.allscreen.travel;

import java.io.*;
import java.nio.file.Path;

public class HelperFiles {

    public static void ReadFile (String fileName ) {




        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));)

        {

            String newLine;
            while ( (newLine=reader.readLine() )!=null)
            {

                System.out.println(newLine);


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void ReadBinaryFile (String fileName ) {




        try(BufferedInputStream reader = new BufferedInputStream(new FileInputStream(fileName));)

        {

            char[] charBuf = new char[128];
            while ( (int=reader.read() )!=null)
            {

                System.out.println(newLine);


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void ReadChar(InputStream in) {






        try(InputStreamReader reader = new InputStreamReader(in))

        {
            char [] charbuf = new char[5];

           while (reader.read(charbuf) >=0)
           {

             for ( char ch:charbuf)

             {
                 System.out.println(ch);

             }




           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
