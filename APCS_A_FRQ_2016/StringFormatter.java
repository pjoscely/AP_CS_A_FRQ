/** AP #4
* Class information for this question
* public class StringFormatter
* public static int totalLetters(List<String> wordList)
* public static int basicGapWidth(List<String> wordList,int formattedLen)
* public static int leftoverSpaces(List<String> wordList,int formattedLen)
* public static String format(List<String> wordList, int formattedLen)
* 
* This question involves the process of taking a list of words, called wordList, and producing 
* a formatted string of a specified length. The list wordList contains at least two words, consisting of letters only.
* When the formatted string is constructed, spaces are placed in the gaps between words so that 
* as many spaces as possible are evenly distributed to each gap. The equal number of spaces inserted into each gap 
* is referred to as the basic gap width. Any leftover spaces are inserted one at a time into the gaps from left to right 
* until there are no more leftover spaces.
* 
* The following three examples illustrate these concepts. In each example, the list of words is to be placed 
* into a formatted string of length 20.
* 
Example 1: wordList: ["AP", "COMP", "SCI", "ROCKS"]

* Total number of letters in words: 14 Number of gaps between words: 3 Basic gap width: 2
* Leftover spaces: 0
* Formatted string:
* 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
* A P     C O M P     S  C  I        R   O  C  K  S

* Example 2: wordList: ["GREEN", "EGGS", "AND", "HAM"]
* Total number of letters in words: 15 Number of gaps between words: 3 Basic gap width: 1
* Leftover spaces: 2 
* The leftover spaces are inserted one at a time between the words from left to right until 
* there are no more leftover spaces. In this example, the first two gaps get an extra space.
* Formatted string:
* 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
* G R E E N     E G G S         A  N  D     H  A  M

* Example 3: wordList: ["BEACH", "BALL"]
* Total number of letters in words: 9 Number of gaps between words: 1 Basic gap width: 11
* Leftover spaces: 0
* Formatted string:
* 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
* B E A C H                              B  A  L  L

* You will implement three static methods in a class named StringFormatter (Class not supplied by the AP),
* but implemented here for testing the solutions purposes.
*/
import java.util.*;
public class StringFormatter
{
/**
* Constructor omitted (not needed): all methods are static
*/
  
/** Part (a)
* Write the StringFormatter method totalLetters, which returns the total number of 
* letters in the words in its parameter wordList. For example, if the variable List<String> words is
* ["A", "frog", "is"] then the call StringFormatter returns 7. Complete method totalLetters below.
* Returns the total number of letters in wordList.
* Precondition: wordList contains at least two words, consisting of letters only. 
*/
public static int totalLetters(List<String> wordList){
   int total = 0;  
   for(String s: wordList){
      total+=s.length();     
    }
    return total;      
}
/** Part (b)
* Assume that totalLetters works as specified regardless of what you wrote in part (a). 
* You must use totalLetters appropriately to receive full credit.
* Complete method basicGapWidth below.
* Returns the basic gap width when wordList is used to produce a formatted string of formattedLen characters.
* Precondition: wordList contains at least two words, consisting of letters only.
* formattedLen is large enough for all the words and gaps. 
*/

public static int basicGapWidth(List<String> wordList, int formattedLen){
     return (formattedLen - totalLetters(wordList))/(wordList.size()-1);     
}
/**
* Not required by the AP
*/
public static int leftoverSpaces(List<String> wordList,int formattedLen){
    //return difference between formattedLen and used spaces
    return formattedLen - (totalLetters(wordList) + basicGapWidth(wordList,formattedLen)*(wordList.size()-1));
    
}
/** Part (c) 
* Write the StringFormatter method format, which returns the formatted string as defined earlier. 
* The StringFormatter class also contains a method called leftoverSpaces, which has already been implemented. 
* This method returns the number of leftover spaces as defined above. 
* Assume that basicGapWidth works as specified, regardless of what you wrote in part (b). 
* You must use basicGapWidth and leftoverSpaces appropriately to receive full credit.
* Complete method format below.
* Returns a formatted string consisting of the words in wordList separated by spaces.
* Precondition: ThewordListcontainsatleasttwowords,consistingoflettersonly. formattedLen is large enough for all the words and gaps.
* Postcondition: All words in wordList appear in the formatted string.
* The words appear in the same order as in wordList.
* The number of spaces between words is determined by basicGapWidth and the
* distribution of leftoverSpaces from left to right, as described in the question. 
*/
//AP solution code used 
public static String format(List<String> wordList, int formattedLen){
    String formatted = "";
      int gapWidth = basicGapWidth(wordList, formattedLen);
      int leftovers = leftoverSpaces(wordList, formattedLen);
      for (int w = 0; w < wordList.size() - 1; w++)
      {
          formatted = formatted + wordList.get(w);
            for (int i = 0; i < gapWidth; i++){               
                formatted = formatted + "*";//use * for testing
               }
               if (leftovers > 0)
                {
                 formatted = formatted + "*";//use * for testing 
                } 
               leftovers--;  
            } 
        formatted = formatted + wordList.get(wordList.size() - 1);
      return formatted;
  }
}




