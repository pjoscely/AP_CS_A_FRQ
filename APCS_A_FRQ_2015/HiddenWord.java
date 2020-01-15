/**
*AP Java FRQ: Hidden Word Game

Directions: SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS
ARE TO BE WRITTEN IN Java.
                   
Notes:                                                      
Assume that the classes listed in the Quick Reference have been imported where needed.
Unless otherwise noted in the question, assume that parameters in method calls are not
 null and that methods are called only when their preconditions are satisfied.          
In writing solutions for each question, you may use any of the accessible methods
that are listed in classes defined in that question. Writing significant amounts of
code that can be replaced by a call to one of these methods may not receive full credit.                
                   
Consider a game with a Hidden Word box that has a 4-letter word as the combination.
A player tries to guess the combination by guessing one letter at a time to win a prize inside the box.
The combination only contains 4 lower-case letters and a guess can only contain 4 lower-case letters.
                   
For each round of play, the player is given a clue based on a comparison between the combination
lock and the guess. Each position in the clue contains a character that corresponds to the letter
in the same position in the guess. The following rules determine the characters that appear in the clue.

If the letter in the guess is...
the corresponding character in the clue is
also in the same position in the Hidden Word.

the matching letter

also in the Hidden Word,
"+"

not in the Hidden Word,
"*"
The HiddenWord class will be used to represent the Hidden Word in the game.
The Hidden Word is passed to the constructor. The class contains a method, getClue,
that takes a guess and produces a clue.
                   
For example, suppose the variable comboLock is declared as follows:

HiddenWord comboLock = new HiddenWord("frog");
                   
The following table shows several guesses and hints that would be produced.

Call to getClue            String returned
comboLock.getClue("oooo")   "++o+"
comboLock.getClue("flip")   "f***"
comboLock.getClue("form")   "f++*"
comboLock.getClue("frag")   "fr*g"
comboLock.getClue("frog")   "frog"
   
                       
Write the complete HiddenWord class, including any required instance variables,
its constructor, and the method getClue, described above.  
   
 */

import java.io.File;
import java.util.*;
public class HiddenWord
{
    // instance variables - replace the example below with your own
    private String code;

    /**
     * Constructor for objects of class x
     */
    public HiddenWord(String secCode)
    {
        // initialise instance variables
        code = secCode;
    }
    /**
     * Generate a random four letter word from an external text file
     * of over 5400 four letter English words.
     * The external text file is included as four_letter.txt
     */
    public HiddenWord() throws Exception
   
    {
       File file = new File("/Users/joscelynec/Desktop/APCS_A_FRQ_2015/four_letter.txt");
       Scanner sc = new Scanner(file);
       String word = "";
       String[]  list = new String[5454]; //this is an array of strings
       while (sc.hasNextLine()) {
          word = sc.nextLine();
         list = word.split(" ");  
        }
         Random rand = new Random();
         int index = rand.nextInt(5454);
         code =list[index];
         code = code.toLowerCase();  
    }
   
   
    /**
     *
     */
    public  String getClue(String guess)
    {
        // put your code here
        String result ="";
        for (int i = 0; i < code.length();i++)
        {
           int temp = code.indexOf(guess.substring(i,i+1));
           
           if(temp == -1){
               result+="*";
            }
            else if(code.substring(i,i+1).equals(guess.substring(i,i+1))){
               
                result+=code.substring(i,i+1);  
            }
            else if(temp!= -1 && !code.substring(i,i+1).equals(guess.substring(i,i+1))){
               
                result+="+";
            }  
        }
        return result ;    
    }
   
   
    public String getCode(){
     return code;    
    }
   
   
   
}
