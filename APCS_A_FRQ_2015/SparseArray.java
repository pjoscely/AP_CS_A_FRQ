
/**
* The SparseArray class represents a sparse array. It contains a list of 
* SparseArrayEntry objects, each of which represents one of the non-zero 
* elements in the array. The entries representing the non-zero elements are 
* stored in the list in no particular order. Each non-zero element is 
* represented by exactly one entry in the list.
* 
* public class SparseArrayEntry
* public SparseArrayEntry(int r, int c, int v)
* public int getRow()
* public int getCol()
* public int getValue()

* public class SparseArray
* private int numRows
* private int numCols
* private List<SparseArrayEntry> entries
* public int getNumRows()
* public int getNumCols()
* public int getValueAt(int row, int col)
* public void removeColumn(int col)
*/
import java.util.*;
public class SparseArray
{
/** The number of rows and columns in the sparse array. */ 
private int numRows;
private int numCols;

/** The list of entries representing the non-zero elements of the sparse array. 
* Entries are stored in the list in no particular order. 
* Each non-zero element is represented by exactly one entry in the list. 
*/
     private List<SparseArrayEntry> entries;
/** 
* Constructs an empty SparseArray. 
* More flexible constructor than on the AP
*/
public SparseArray(int r, int c)
{ 
    numRows = r;
    numCols = c;
    entries = new ArrayList<SparseArrayEntry>(); 
}
/** Returns the number of rows in the sparse array. */ 
public int getNumRows()
{ 
    return numRows; 
}
/** Returns the number of columns in the sparse array. */ 
public int getNumCols()
{ 
    return numCols; 
}
/** Part a
* Returns the value of the element at row index row and column index col 
* in the sparse array. Write the SparseArray method getValueAt. The method 
* returns the value of the sparse array element at a given row and column 
* in the sparse array. If the list entries contains an entry with the 
* specified row and column, the value associated with the entry is returned. 
* If there is no entry in entries corresponding to the specified row and 
* column, 0 is returned.
* 
* Precondition: 0<=row < getNumRows()
* 0<= col < getNumCols() 
*/

public int getValueAt(int row, int col)
{ 
  for (SparseArrayEntry e: entries){
      if(e.getRow() == row && e.getCol() == col){
          return e.getValue();
        }   
    }
    return 0;
}
/** Part b
* Write the SparseArray method removeColumn. After removing a specified column 
* from a sparse array:
* 
* • All entries in the list entries with column indexes matching col are 
* removed from the list.
* 
* • All entries in the list entries with column indexes greater than col are 
* replaced by entries with column indexes that are decremented by one 
* (moved one column to the left).
* 
* • The number of columns in the sparse array is adjusted to reflect 
* the column removed. 
* 
* Precondition: 0<=col < getNumCols() 
*/
public void removeColumn(int col){
       int i=0;
       while (i < entries.size()){
            SparseArrayEntry e = entries.get(i);
            if (e.getCol() == col){
                entries.remove(i);
            } else if (e.getCol() > col){
                entries.set(i, new SparseArrayEntry(e.getRow(),e.getCol()-1,e.getValue()));
                i++;
            } 
            else {
                 i++;
                }     
    }   
   
    numCols--; 
}


/**
 * Helper method, adds to an entry to the ArrayList,
 * not required by the AP
 */
public void addEntry(SparseArrayEntry e){
    entries.add(e);
    
}

/**
 * Helper method, prints ArrayList,
 * not required by the AP
 */
public void DisplaySparseArray(){
    for (SparseArrayEntry e: entries){
      System.out.println(e);
    }
}
}