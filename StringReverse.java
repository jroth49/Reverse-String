import java.util.*;
import java.io.*;

/**
 * Reverses a string
 *
 * @author Walter Roth
 * @version 7/10/2019
 */
public class StringReverse
{
    public static void main(String[] args)
    {
        String input = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string...");
        input = sc.nextLine();
        //System.out.println(input);
        
        
        System.out.println(reverse(input));
    }
    
    private static String reverse(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        
        for(int i = sb.length() - 1; i >= 0; i--)
        {
            System.out.print(sb.charAt(i));
        }
        
        return "";
    }
}
