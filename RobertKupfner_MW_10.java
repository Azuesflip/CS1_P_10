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

    
    public static void main(String[] args) 
    {
        
    }
    
    public static Scanner input_File(String fileLocation)
    {
        
    }
    
    public static int arrayCounter (Scanner counterInput)
    {
        while (counterInput.hasNext())
        {
            
        }
    }
    
    public static int[] inputArray (String numberInput)
    {
        
    }
    
    public static int arraySorter (int[] inputArray)
    {
        
    }
    
    public static String heading () 
    {
        
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
