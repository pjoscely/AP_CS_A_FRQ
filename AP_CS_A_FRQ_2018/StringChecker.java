/** AP FRQ #3 */

public interface StringChecker
     {
      /** Returns true if str is valid. */
        boolean isValid(String str);
     }
/**     
* A CodeWordChecker is a StringChecker. A CodeWordChecker object 
* can be constructed with three parameters: two integers and a string. 
* The first two parameters specify the minimum and maximum code word lengths, 
* respectively, and the third parameter specifies a string that must not occur 
* in the code word.
* A CodeWordChecker object can also be constructed with a single parameter 
* that specifies a string that must not occur in the code word; 
* in this case the minimum and maximum lengths will default to 6 and 20, 
* respectively.
* The following examples illustrate the behavior of CodeWordChecker objects. 

* Example 1
* StringChecker sc1 = new CodeWordChecker(5, 8, "$"); 
* Valid code words have 5 to 8 characters and must not include the string "$".
* 
* Method call Return value Explanation

* sc1.isValid("happy") true The code word is valid.
* sc1.isValid("happy$") false The code word contains "$".
* sc1.isValid("Code") false The code word is too short.
* sc1.isValid("happyCode") false *The code word is too long.

* Example 2
* StringChecker sc2 = new CodeWordChecker("pass");
* Valid code words must not include the string "pass". Because the bounds 
* are not specified, the length bounds are 6 and 20, inclusive.
*
* Method call Return value Explanation
* 
* sc2.isValid("MyPass") true The code word is valid.
* sc2.isValid("Mypassport") false The code word contains "pass".
* sc2.isValid("happy") false The code word is too short.
* sc2.isValid("1,000,000,000,000,000") false The code word is too long.
* 
* 
* Write the complete CodeWordChecker class. Your implementation must meet 
* all specifications and conform to all examples.
*/
// A class that implements the interface. 
class CodeWordChecker implements StringChecker 
{ 
   /** instance variables */
   private String myString;
   private int minLength;
   private int maxLength;
   
   /** Default constructor */
   public CodeWordChecker(String myString){
      this.myString  = myString;
      minLength  = 6;
      maxLength = 20;
   }
   /** Flexible constructor */
   public CodeWordChecker(int minLength, int maxLength, String myString){
       this.myString  = myString;
       this.minLength  = minLength;
       this.maxLength = maxLength;
   }
   
  /** AP #3 Solution */
   public boolean isValid(String str){
     int len = str.length();
     if (len < minLength || len > maxLength){
      return false;      
     }
     int index = str.indexOf(this.myString); 
     if(index != -1){
        return false; 
     }
      return true;  
   } 
} 