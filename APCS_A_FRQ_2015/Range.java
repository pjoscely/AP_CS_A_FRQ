
/** Part b
* A range represents a number group that contains all (and only) the integers
* between a minimum value and a maximum value, inclusive.
* Write the Range class, which is a NumberGroup. The Range class represents 
* the group of int values that range from a given minimum value up through 
* a given maximum value, inclusive. For example, the declaration
*      NumberGroup range1 = new Range(-3, 2);
* represents the group of integer values -3, -2, -1, 0, 1, 2.
* Write the complete Range class. Include all necessary instance variables 
* and methods as well as a constructor that takes two int parameters. 
* The first parameter represents the minimum value, and the second parameter 
* represents the maximum value of the range. You may assume that the minimum 
* is less than or equal to the maximum.
*/
public class Range implements NumberGroup
{
    // instance variables - replace the example below with your own
    private int min;
    private int max;

    /**
     * Constructor for objects of class Range
     */
    public Range(int min, int max)
    {
        this.min = min;
        this.max = max;
    }

    /**
     * conatains method
     */
    public boolean contains(int num)
    {
        if(num >= min && num <= max){
          return true; 
    }
    return false;
}
}
