
/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringCheckerDriver
{
      // Driver Code 
    public static void main (String[] args) 
    { 
       StringChecker sc1 = new CodeWordChecker(5, 8, "$"); 
       System.out.println(sc1.isValid("happy")); //true The code word is valid.
       System.out.println(sc1.isValid("happy$")); //false The code word contains "$".
       System.out.println(sc1.isValid("Code")); //false The code word is too short.
       System.out.println(sc1.isValid("happyCode")); //false * The code word is too long.
    
       StringChecker sc2 = new CodeWordChecker("pass");
       System.out.println(sc2.isValid("MyPass")); //true The code word is valid
       System.out.println(sc2.isValid("Mypassport")); //false The code word contains "pass".
       System.out.println(sc2.isValid("happy")); //false The code word is too short.
       System.out.println(sc2.isValid("1,000,000,000,000,000")); //false The code word is too long.
     
      /** Test code output
      * true
      * false
      * false
      * false
      * true
      * false
      * false
      * false
      */
    } 
}
