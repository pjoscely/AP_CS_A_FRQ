/** AP #1 Part (b)
* 
* The following partially completed RandomLetterChooser class is a subclass of the RandomStringChooser class. 
* You will write the constructor for the RandomLetterChooser class.
*/  

public class RandomLetterChooser extends RandomStringChooser
 {
/** 
* Constructs a random letter chooser using the given string str. 
* Precondition: str contains only letters.
* Assume that the RandomStringChooser class that you wrote in part (a) has been implemented correctly 
* and that getSingleLetters works as specified. You must use getSingleLetters appropriately to receive full credit.
* Complete the RandomLetterChooser constructor below.
* Constructs a random letter chooser using the given string str. * Precondition: str contains only letters.
* The following code segment shows an example of using RandomLetterChooser.
*   RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
*   for (int k = 0; k < 4; k++)
*   {
*     System.out.print(letterChooser.getNext());
 *  }
* The code segment will print the three letters in "cat" in one of the possible orders. 
* Because there are only three letters in the original string, the code segment prints 
* "NONE" the fourth time through the loop. One possible output is shown below:
* actNONE
*/
public RandomLetterChooser(String str)
{ 
           super(getSingleLetters(str));

}
/** Returns an array of single-letter strings.
* Each of these strings consists of a single letter from str. Element k
* of the returned array contains the single letter at position k of str.
* For example, getSingleLetters("cat") returns the
* array { "c", "a", "t" }. 
*/
public static String[] getSingleLetters(String str)
{ /** implementation not required by the AP */
   String[] singleLetters = new String[str.length()];
   for(int i = 0; i <singleLetters.length; i++){
      singleLetters[i] = str.substring(i,i+1); 
    }
   return singleLetters;
} 


}
