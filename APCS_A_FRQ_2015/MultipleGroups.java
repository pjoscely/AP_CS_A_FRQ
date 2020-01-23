/** Part c
* The MultipleGroups class represents a collection of NumberGroup objects 
* and is a NumberGroup. The MultipleGroups class stores the number groups 
* in the instance variable groupList (shown below), which is initialized 
* in the constructor.
* private List<NumberGroup> groupList;
* Write the MultipleGroups method contains. The method takes an integer and 
* returns true if and only if the integer is contained in one or more of the 
* number groups in groupList.
* For example, suppose multiple1 has been declared as an instance of 
* MultipleGroups and consists of the three ranges created by the calls 
* new Range(5, 8), new Range(10, 12), andnewRange(1,6). The following table
* shows the results of several calls to contains.

* Call Result
* multiple1.contains(2) true
* multiple1.contains(9) false
* multiple1.contains(6) true
*/
import java.util.*;
public class MultipleGroups
{
    // instance variables - replace the example below with your own
   private List<NumberGroup> groupList = new ArrayList<NumberGroup>();

    /**
     * Constructor 
     */
    public MultipleGroups()
    {
       groupList = new ArrayList<NumberGroup>();
    }

    /** 
     * Part b
     */
    public boolean contains(int num)
    {
        for(NumberGroup r: groupList){
            if(r.contains(num)){
              return true;   
           }
    }
      return false;
  }
  
  /**
   * Helper addNumberGroup method. Not required by the AP
   */
  
  public void addNumberGroup(NumberGroup group){
       groupList.add(group);
    }
  /**
   * Test code for the MultipleGroups
   */
 public static void main(String args[]){
     
      MultipleGroups groups = new MultipleGroups();
      groups.addNumberGroup(new Range(5, 8));
      groups.addNumberGroup(new Range(10, 12));
      groups.addNumberGroup(new Range(1, 6));
      System.out.println(groups.contains(2));//true
      System.out.println(groups.contains(9));//false
      System.out.println(groups.contains(6));//true
      
      
    }
}