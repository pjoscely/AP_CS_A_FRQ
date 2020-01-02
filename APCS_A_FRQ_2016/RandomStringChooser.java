
/**AP #1
* Part (a) 
* This question involves the implementation and extension of a RandomStringChooser class.
* A RandomStringChooser object is constructed from an array of non-null String values. 
* When the object is first constructed, all of the strings are considered available. 
* The RandomStringChooser class has a getNext method, which has the following behavior. 
* A call to getNext returns a randomly chosen string from the available strings in the object. 
* Once a particular string has been returned from a call to getNext, it is no longer 
* available to be returned from subsequent calls to getNext. If no strings are available to be returned,
* getNext returns "NONE".
* The following code segment shows an example of the behavior of RandomStringChooser.
*     String[] wordArray = {"wheels", "on", "the", "bus"};
*     RandomStringChooser sChooser = new RandomStringChooser(wordArray);
*     for (int k = 0; k < 6; k++)
*     {
*        System.out.print(sChooser.getNext() + " ");
*     }
* One possible output is shown below. Because sChooser has only four strings, 
* the string "NONE" is printed twice: 
* bus the wheels on NONE NONE
* Write the entire RandomStringChooser class. Your implementation must include an appropriate constructor 
* and any necessary methods. Any instance variables must be private. The code segment in the example above 
* should have the indicated behavior (that is, it must compile and produce a result like the possible output shown). 
* Neither the constructor nor any of the methods should alter the parameter passed to the constructor, 
* but your implementation may copy the contents of the array.
*/

import java.util.*;
public class RandomStringChooser
{
  //words is a List containg Strings
  private List<String> words;
  //Constructor for RandomStringChooser
  public RandomStringChooser(String[] wordArray) 
      { 
          //particularize words as a an ArrayList of Strings
          words = new ArrayList<String>();
          //populate the array list words
          for (String singleWord : wordArray)
           {
           words.add(singleWord);
          }
       }
  public String getNext(){
      
      if(words.size() > 0){
        return words.remove((int)(Math.random() * words.size()));
        }
       return "NONE";
    }
}
