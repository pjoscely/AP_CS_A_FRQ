/** AP #1 */
import java.util.*;
public class Digits
{
private ArrayList<Integer> digitList = new ArrayList<Integer>();

/** Part a 
* Constructs a Digits object that represents num. * Precondition: num >= 0
* Write the constructor for the Digits class. The constructor initializes and 
* fills digitList with the digits from the non-negative integer num. 
* The elements in digitList must be Integer objects representing single digits, 
* and appear in the same order as the digits in num. Each of the following examples 
* shows the declaration of a Digits object and the contents of digitList 
* as initialized by the constructor.
* 
* Example 1
* Digits d1 = new Digits(15704);
  d1:
             01234
  digitList: 15704
 
 Digits d2 = new Digits(0);
        d2:
                  0
        digitList:0
*/
public Digits(int num)
{ 
    if(num == 0){
     digitList.add(num);
    }
      while(num > 0){
        digitList.add(0, new Integer(num % 10));
        num /= 10;    
     }
}   
/** Part b
 * Write the Digits method isStrictlyIncreasing. The method returns true if the elements 
 * of digitList appear in strictly increasing order; otherwise, it returns false. 
 * A list is considered strictly increasing if each element after the first is greater 
 * than (but not equal to) the preceding element.
* The following table shows the results of several calls to isStrictlyIncreasing. 
* Method call Value returned
* new Digits(7).isStrictlyIncreasing()
* true
* new Digits(1356).isStrictlyIncreasing()
* true
* new Digits(1336).isStrictlyIncreasing()
* false
* new Digits(1536).isStrictlyIncreasing()
* false
* new Digits(65310).isStrictlyIncreasing()
* false
* Returns true if the digits in this Digits object are in strictly increasing order 
* false otherwise.
*/
public boolean isStrictlyIncreasing()
{ 
  for(int i = 0; i < digitList.size()-1; i++){
      /**auto boxing used here or use intValue()*/
      if(digitList.get(i)>=digitList.get(i+1)){
      return false;
    }
  }
   return true;
} 
}




