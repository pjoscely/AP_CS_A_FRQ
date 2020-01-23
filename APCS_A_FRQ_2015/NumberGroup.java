/** Part a
* This question involves the design of an interface, writing a class that 
* implements the interface, and writing a method that uses the interface.
* A number group represents a group of integers defined in some way. 
* It could be empty, or it could contain one or more integers.
* Write an interface named NumberGroup that represents a group of integers. 
* The interface should have a single contains method that determines if a 
* given integer is in the group. For example, if group1 is of type NumberGroup,
* and it contains only the two numbers -5 and 3, then group1.contains(-5) 
* would return true, and group1.contains(2) would return false.
* Write the complete NumberGroup interface. It must have exactly one method.
 */
public interface NumberGroup
{
    boolean contains(int num);
}
