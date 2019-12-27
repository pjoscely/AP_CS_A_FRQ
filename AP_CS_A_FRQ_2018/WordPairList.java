/** AP FRQ #2
* Write the constructor for the WordPairList class. The constructor takes an array of strings 
* words as a parameter and initializes the instance variable allPairs to an 
* ArrayList of WordPair objects.
* 
* A WordPair object consists of a word from the array paired with a word that appears later in the array. 
* The allPairs list contains WordPair objects (words[i], words[j]) for every i and j, where 0 £ i < j < words.length . 
* Each WordPair object is added exactly once to the list.
* The following examples illustrate two different WordPairList objects.

* Example 1
*   String[] wordNums = {"one", "two", "three"};
*   WordPairList exampleOne = new WordPairList(wordNums);

*   After the code segment has executed, the allPairs instance variable of exampleOne 
*   will contain the following WordPair objects in some order.
*   ("one", "two"), ("one", "three"), ("two", "three")

* Example 2
*   String[] phrase = {"the", "more", "the", "merrier"};
*   WordPairList exampleTwo = new WordPairList(phrase);

*   After the code segment has executed, the allPairs instance variable of exampleTwo will contain 
*   the following WordPair objects in some order.
*     ("the", "more"), ("the", "the"), ("the", "merrier"),
*     ("more", "the"), ("more", "merrier"), ("the", "merrier") 
* 
* Class information for this question
* 
*   public class WordPair
*   public WordPair(String first, String second)
*   public String getFirst()
*   public String getSecond()
*   public class WordPairList
*   private ArrayList<WordPair> allPairs
*   public WordPairList(String[] words)
*   public int numMatches()
*/
import java.util.*;
public class WordPairList
{
    /** The list of word pairs, initialized by the constructor. */ 
    private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();

/** Part (a)
 *  Constructs a WordPairList object as described in part (a). 
*   Precondition: words.length >= 2
*/
public WordPairList(String[] words)
{ 
  for(int i = 0; i < words.length; i++){
      for(int j = i+1; j < words.length;j++){
          WordPair temp = new WordPair(words[i], words[j]);
          allPairs.add(temp);
      }
    }
}

/** Print allPairs used for testing not required by AP**/
public void printAllPairs(){
    for(WordPair item:allPairs){
      System.out.print(item+" ");
   }
       System.out.println();  
}

/** Part (b)
* Write the WordPairList method numMatches. This method returns the number of WordPair objects 
* in allPairs for which the two strings match.
* For example, the following code segment creates a WordPairList object. 
* String[] moreWords = {"the", "red", "fox", "the", "red"};
*   WordPairList exampleThree = new WordPairList(moreWords);
*   After the code segment has executed, the allPairs instance variable of exampleThree will contain the 
*   following WordPair objects in some order.
*    ("the", "red"), ("the", "fox"), ("the", "the"),
*    ("the", "red"), ("red", "fox"), ("red", "the"),
*    ("red", "red"), ("fox", "the"), ("fox", "red"),
*    ("the", "red")
* The call exampleThree.numMatches() should return 2.
  
* Class information for this question
*   public class WordPair
*   public WordPair(String first, String second)
*   public String getFirst()
*   public String getSecond()
*   public class WordPairList
*   private ArrayList<WordPair> allPairs
*   public WordPairList(String[] words)
*   public int numMatches()
*/
 public int numMatches()
{ 
    int ct = 0;
    for(WordPair item:allPairs){
        if(item.getFirst().equals(item.getSecond())){
           ct++;    
        }
    
   }
   return ct;
}
}