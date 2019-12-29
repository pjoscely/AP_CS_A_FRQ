/** AP #3
 * This question involves analyzing and modifying a string. 
 * The following Phrase class maintains a phrase in an instance variable and 
 * has methods that access and make changes to the phrase. 
 * You will write two methods of the Phrase class.
 */
     public class Phrase
     {
        private String currentPhrase;
       /** Constructs a new Phrase object. */ 
        public Phrase(String p)
       { 
           currentPhrase = p; 
       }

/** Returns the index of the nth occurrence of str in the current phrase;
* returns -1 if the nth occurrence does not exist.
* Precondition: str.length() > 0 and n > 0
* Postcondition: the current phrase is not modified.
*/
public int findNthOccurrence(String str, int n)
{ /** Not required by the AP */ 
   int pos = currentPhrase.indexOf(str, 0);//indexOf() method starting at a given index
   int ct = 1;
   while(ct < n){
   //if found increase ct and pos by 1
     if(pos != -1){
         ct++;
         pos++;
         pos = currentPhrase.indexOf(str, pos); //look for next occurrence starting at pos
    }
       else if(pos != 1){// if pos is ever -1 return -1
        return -1; 
    }   
   } 
  return pos; //return position for nth occurrence found
}
/** Part a
* Modifies the current phrase by replacing the nth occurrence of str with repl.
* If the nth occurrence does not exist, the current phrase is unchanged.
* Precondition: str.length() > 0 and n > 0 
* (a) Write the Phrase method replaceNthOccurrence, which will replace the nth occurrence 
* of the string str with the string repl. If the nth occurrence does not exist, 
* currentPhrase remains unchanged.
* Several examples of the behavior of the method replaceNthOccurrence are shown below.

* Phrase phrase1 = new Phrase("A cat ate late.");
* phrase1.replaceNthOccurrence("at", 1, "rane");
* System.out.println(phrase1);
* A crane ate late.

* Phrase phrase2 = new Phrase("A cat ate late.");
* phrase2.replaceNthOccurrence("at", 6, "xx");
* System.out.println(phrase2);
* A cat ate late.

* Phrase phrase3 = new Phrase("A cat ate late.");
* phrase3.replaceNthOccurrence("bat", 2, "xx");
* System.out.println(phrase3);
* A cat ate late.

* Phrase phrase4 = new Phrase("aaaa");
* phrase4.replaceNthOccurrence("aa", 1, "xx");
* System.out.println(phrase4);
* xxaa

* Phrase phrase5 = new Phrase("aaaa");
* phrase5.replaceNthOccurrence("aa", 2, "bbb");
* System.out.println(phrase5);
* abbba
  
* Class information for this question
* public class Phrase
* private String currentPhrase
* public Phrase(String p)
* public int findNthOccurrence(String str, int n)
* public void replaceNthOccurrence(String str, int n, String repl)
* public int findLastOccurrence(String str)
* public String toString()
*/

public void replaceNthOccurrence(String str, int n, String repl)
{  
    int indx = this.findNthOccurrence(str, n);
    int len = str.length();
    if(indx != -1){
    currentPhrase = currentPhrase.substring(0,indx)+repl+currentPhrase.substring(indx+len);     
    }
 
}
/** Part b
* Returns the index of the last occurrence of str in the current phrase;
* returns -1 if str is not found.
* Precondition: str.length() > 0
* Postcondition: the current phrase is not modified.
* Write the Phrase method findLastOccurrence. This method finds and returns the index 
* of the last occurrence of a given string in currentPhrase. If the given string is not found, -1 is returned. 
* The following tables show several examples of the behavior of the method findLastOccurrence.
* Phrase phrase1 = new Phrase("A cat ate late.");

* phrase1.findLastOccurrence("at")
* 11
* phrase1.findLastOccurrence("cat")
* 2
* phrase1.findLastOccurrence("bat")
* -1
  
* Class information for this question
* public class Phrase
* private String currentPhrase
* public Phrase(String p)
* public int findNthOccurrence(String str, int n)
* public void replaceNthOccurrence(String str, int n, String repl)
* public int findLastOccurrence(String str)
* public String toString()
 
*/
//Ap solution rather easy once presented as such
public int findLastOccurrence(String str)
{ 
    int n = 1;
    while (findNthOccurrence(str, n+1) != -1)
    {  
     n++;
    }
    return findNthOccurrence(str, n);
 }
/** Returns a string containing the current phrase. */ 

public String toString()
{ 
    return currentPhrase; 
}
}
