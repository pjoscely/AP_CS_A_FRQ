/**
 * Test code for StringFormatter class
 */
import java.util.*;
public class StringFormatterTester
{
   public static void main(String args[]){
       //part (a) test total letters
        ArrayList<String> m = new ArrayList<String>(); 
        // Initialize an ArrayList with add() 
        m.add("Green"); 
        m.add("Eggs"); 
        m.add("and"); 
        m.add("Ham");
        System.out.println(StringFormatter.totalLetters(m)); 
        System.out.println(StringFormatter.basicGapWidth(m,20));
        System.out.println(StringFormatter.leftoverSpaces(m,20));
        System.out.println(StringFormatter.format(m,15));
        System.out.println(StringFormatter.format(m,16));
        System.out.println(StringFormatter.format(m,17));
        System.out.println(StringFormatter.format(m,18));
        System.out.println(StringFormatter.format(m,19));
        System.out.println(StringFormatter.format(m,20));
      
       //More tests
        ArrayList<String> b = new ArrayList<String>(); 
        // Initialize an ArrayList with add() 
        b.add("BEACH"); 
        b.add("BALL"); 
       System.out.println(StringFormatter.basicGapWidth(b,20)); 
       //Test number of letters left over method
       System.out.println(StringFormatter.leftoverSpaces(b,20));
       //part(c) test format metho
       System.out.println(StringFormatter.format(b,9));
       System.out.println(StringFormatter.format(b,10));
       System.out.println(StringFormatter.format(b,15));
       System.out.println(StringFormatter.format(b,16));
       System.out.println(StringFormatter.format(b,17));
       System.out.println(StringFormatter.format(b,18));
       System.out.println(StringFormatter.format(b,19));
       System.out.println(StringFormatter.format(b,20));
    }

}
