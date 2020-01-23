
/**
* SparseArrayTester.
*/
public class SparseArrayTester
{
    public static void main(String args[]){
     SparseArray sa   = new SparseArray(6, 5);
     sa.addEntry(new SparseArrayEntry (1,4,4));
     sa.addEntry(new SparseArrayEntry (2,0,1)); 
     sa.addEntry(new SparseArrayEntry (3,1,-9));
     sa.addEntry(new SparseArrayEntry (1,1,5));
     //Value: 4 at row: 1 column: 4
     //Value: 1 at row: 2 column: 0
     //Value: -9 at row: 3 column: 1
     //Value: 5 at row: 1 column: 1
     sa.DisplaySparseArray();
     //prints 1
     System.out.println(sa.getValueAt(2,0));
      //prints 0
     System.out.println(sa.getValueAt(4,4));
     //Remove column #1
     sa.removeColumn(1);
     //Value: 4 at row: 1 column: 3
     //Value: 1 at row: 2 column: 0
     sa.DisplaySparseArray();
     //Now 6 rows and 4 columns
     System.out.println(sa.getNumRows());//6
     System.out.println(sa.getNumCols());//4
    
     
    }
}
