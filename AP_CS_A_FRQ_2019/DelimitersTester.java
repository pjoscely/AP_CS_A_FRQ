
/**
 * Tests of the Delimiter class
 */
import java.util.*;
public class DelimitersTester
{
    public static void main(String args[]){
        //Example 1 Part (a)
        Delimiters para = new Delimiters("(", ")");
        System.out.println(para);
        String[] ex1 = { "(" , "x + y", ")", " *5"};
        System.out.println(para.getDelimitersList(ex1));
        //Example 2 Part (a)
        Delimiters html = new Delimiters("<q>", "</q>");
        System.out.println(html);
        String[] ex2 = { "<q>","yy","</q>","zz","</q>"};
        System.out.println(html.getDelimitersList(ex2));
        // Example 1 Part (b)
        Delimiters partb = new Delimiters("<sup>", "</sup>");
        System.out.println(partb);
        ArrayList<String> partbEx1 = new ArrayList<String>();
        partbEx1.add("<sup>");
        partbEx1.add("<sup>");
        partbEx1.add("</sup>");
        partbEx1.add("<sup>");
        partbEx1.add("</sup>");
        partbEx1.add("</sup>");
        System.out.println(partb.isBalanced(partbEx1));
        // Example 2 Part (b)
        ArrayList<String> partbEx2 = new ArrayList<String>();
        partbEx2.add("<sup>");
        partbEx2.add("<sup>");
        partbEx2.add("</sup>");
        partbEx2.add("<sup>");
        System.out.println(partb.isBalanced(partbEx2));
        // Example 3 Part (b)
        ArrayList<String> partbEx3 = new ArrayList<String>();
        partbEx3.add("</sup>");
        System.out.println(partb.isBalanced(partbEx3));
        // Example 4 Part (b)
        ArrayList<String> partbEx4 = new ArrayList<String>();
        partbEx4.add("<sup>");
        partbEx4.add("<sup>");
        partbEx4.add("</sup>");
        System.out.println(partb.isBalanced(partbEx4));
        //Reverse order Part (b)
        ArrayList<String> partbEx5 = new ArrayList<String>();
        partbEx5.add("</sup>");
        partbEx5.add("<sup>");
        System.out.println(partb.isBalanced(partbEx5));
        //Empty list Part (b)
        ArrayList<String> partbEx6 = new ArrayList<String>();
        System.out.println(partb.isBalanced(partbEx6));
      }
}
