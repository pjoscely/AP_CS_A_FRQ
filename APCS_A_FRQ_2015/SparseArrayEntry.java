/**
* A two-dimensional array ofintegers in which most elements are zero is 
* called a sparse array. Because most elements have a value of zero, memory 
* can be saved by storing only the non-zero values along with their row and 
* column indexes. The following complete SparseArrayEntry class is used to 
* represent non-zero elements in a sparse array. A SparseArrayEntry object 
* cannot be modified after it has been constructed.
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
public class SparseArrayEntry
 {
/** The row index and column index for this entry in the sparse array */ 
       private int row;
       private int col;
/** The value of this entry in the sparse array */
       private int value;
/** Constructs a SparseArrayEntry object that represents a sparse array 
* element 
* with row index r and column index c, containing value v.
*/
public SparseArrayEntry(int r, int c, int v)
{
  row = r;
  col = c;
  value = v; 
}
/** Returns the row index of this sparse array element. */ 
public int getRow()
{ return row; 
}
/** Returns the column index of this sparse array element. */ 
public int getCol()
{ return col; }
/** Returns the value of this sparse array element. */ 
public int getValue()
{ 
    return value; 
}

/** toString() method */

public String toString(){
    
   return "Value: "+value+" at row: "+row+" column: "+col; 
}

}