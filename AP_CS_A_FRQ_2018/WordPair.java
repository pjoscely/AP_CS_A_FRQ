/** WordPair class to be used . 
 *  Not required by the AP
 */
public class WordPair
{
    private String first;
    private String second;
public WordPair(String first, String second) 
{ 
    /** not supplied by the AP */
    this.first = first;
    this.second = second;
}
/** Returns the first string of this WordPair object. */ 

public String getFirst()
{ /** not supplied by the AP */ 
   return first;
}
/** Returns the second string of this WordPair object. */ 

public String getSecond()
{ /** not supplied by the AP */ 
   return second;
}
/** a toString() method for testing*/
public String toString(){
    return "("+getFirst()+", "+getSecond()+")";   
}
}