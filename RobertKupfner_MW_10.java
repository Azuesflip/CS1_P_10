/*
 * This program is used to take an input file and put the first 20
 * items. Then it will put it into order from largest to smallest 
 * while also outputing its ariginal position of how it's inputed.
 * If the list is larger than 20 integers it will flush the rest
 * to keep them from the array and prevvent bugs.
 * Robert Kupfner
 * Program #8, CS 1050, MW
 * Java 1.7.0_25, Lenovo Ideapad Y400, Windows 8
 */
package robertkupfner_mw_10;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RobertKupfner_MW_10 
{

    
    public static void main(String[] args) throws Exception
    {
        final String input_file = "C:\\Users\\Bob\\Desktop\\School\\CS1" +
              "\\Homework10Files\\AA.txt";
        final String input_file2 = "C:\\Users\\Bob\\Desktop\\School\\CS1" +
              "\\Homework10Files\\AA2.txt";
        final String output_file = "C:\\Users\\Bob\\Desktop\\School\\CS1" +
              "\\Homework10Files\\Output1.txt";
        final String output_file2 = "C:\\Users\\Bob\\Desktop\\School\\CS1" +
              "\\Homework10Files\\Output2.txt";
    }
    
    public static Scanner input_File(String INPUT_FILE) throws Exception
    {
        File inputDataFile = new File(INPUT_FILE);
        
        Scanner inputFile = new Scanner(inputDataFile);
        
        return inputFile;
        
    }
    
    public static String arrayCounter (Scanner counterInput)
    {
        int counter = 0;
        int tooFull = 0;
        String pad = " ";      // Padding character
        int places = 14;        // Number of places for the final number
        String mask = "#.0";   // Mask to use in DecimalFormat
        
        while (counterInput.hasNext())
        {
            counter++;
            tooFull = counter - 20;
        }
        
        if (counter <= 20)
        {
            return "The ammount of items sorted: " + 
                    leftPad (counter, places, mask, pad);
        }
        else
        {
            return "The ammount of items sorted: " + 
                    leftPad (counter, places, mask, pad) + "\n" +
                    "The number of items not used: " + tooFull;
            
        }
    }
    
    public static int[] inputArray (Scanner numberInput)
    {
        final int initializer = 20;
        int[] outputArray = new int[initializer];
        
        while (numberInput.hasNext())
        {
            for (int i = 0; i < initializer; i++)
            {
                outputArray[i] = numberInput.nextInt();
            }
        }
        
        return outputArray;
    }
    
    public static int arraySorter (int[] inputArray)
    {
        
    }
    
    public static String heading (String output_file) throws IOException
    {
        FileWriter outputDataFile = new FileWriter(output_file);
        
        PrintWriter outputFile  = new PrintWriter(outputDataFile);
        
        outputFile.println("Sorted Numbers");
        outputFile.println("--------------");
    }
    
    public static String outputFormater()
    {
        
    }
            
    // leftPad method
    /**
     *
     * @param number
     * @param width
     * @param mask
     * @param padding
     * @return
     */
    
    public static String leftPad (double number, int width, 
                                 String mask, String padding)
   {
         final int DEFAULT_WIDTH = 8; // If 'width' is out of range
         final int MIN_WIDTH = 3;     // Minimum width allowed
         String strPad;               // String to be returned
         int charsToPad;              // The number of charactes to pad

         //  Convert number to a String
         DecimalFormat fmt = new DecimalFormat(mask);
         strPad = fmt.format(number);

         // Use the default width if the width parameter is no good.
         // Using the length of the String str, calculate
         // the number of characters to pad on the left
         if (width < MIN_WIDTH) width = DEFAULT_WIDTH;
         charsToPad = width - strPad.length();

         // Pad str by spaces on the left so that the resulting length 
         // of str is 'width' characters
         for (int i = 0;  i < charsToPad;  i++)
         {
               strPad = padding + strPad;
         }
         return strPad;
   } // end leftPad()
    
}
