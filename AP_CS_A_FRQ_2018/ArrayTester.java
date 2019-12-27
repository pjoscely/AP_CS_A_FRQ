/** AP FRQ #4
This question involves reasoning about arrays of integers. 
You will write two static methods, both of which are in a class 
named ArrayTester.
*/
import java.util.*;
public class ArrayTester
 {
/** Part (a)
* Returns an array containing the elements of column c of arr2D in the same order as
* they appear in arr2D.
* Precondition: c is a valid column index in arr2D.
* Postcondition: arr2D is unchanged.
*/
public static int[] getColumn(int[][] arr2D, int c)
{ /** 
  (a) Write a static method getColumn, which returns a one-dimensional array containing the elements 
  of a single column in a two-dimensional array. The elements in the returned array should be 
  in the same order as they appear in the given column. The notation arr2D[r][c] represents 
  the array element at row r and column c.
  The following code segment initializes an array and calls the getColumn method.
   int[][] arr2D = { { 0, 1, 2 },
                     { 3, 4, 5 },
                     { 6, 7, 8 },
                     { 9, 5, 3 } };
   int[] result = ArrayTester.getColumn(arr2D, 1);
 When the code segment has completed execution, the variable result 
 will have the following contents. result: {1, 4, 7, 5}
  */
   //create 1D array to return
   int[] result = new int[arr2D.length];
   //fill the arrary
   for(int i = 0; i < result.length; i++)
   {
       result[i] = arr2D[i][c];
   }
   return result;
}
/** Returns true if and only if every value in arr1 appears in arr2.
* Precondition: arr1 and arr2 have the same length.
* Postcondition: arr1 and arr2 are unchanged.
*/
public static boolean hasAllValues(int[] arr1, int[] arr2)
{ /** implementation not required by AP */
   int[] temp1 = new int[arr1.length];
   int[] temp2 = new int[arr2.length];
   //deep copy arr1,arr2 to temp1, tmp2 and sort for comparison 
   for(int i = 0; i < arr1.length; i++){
       temp1[i] = arr1[i];
       temp2[i] = arr2[i];
    }    
     Arrays.sort(temp1); 
     Arrays.sort(temp2); 
    for(int i = 0; i < temp1.length; i++){
      if (temp1[i] != temp2[i]){
          return false;
        }
   }
   return true;
}

/** Returns true if arr contains any duplicate values;
* false otherwise. */
public static boolean containsDuplicates(int[] arr)
{ /** implementation not required by AP */
 //use a dictionary to track items
 Dictionary d = new Hashtable();
 String item = ""+arr[0];
 d.put(item,item);
 for(int i = 1; i < arr.length; i++)
 {
     item= ""+arr[i];
     if( d.get(item) == null){
         d.put(item,item);
        }
     else{
        return true; 
        }  
  }
 return false;
}
/** Part (b)
* Returns true if square is a Latin square as described in part (b);
* false otherwise.
* Precondition: square has an equal number of rows and columns. 
* square has at least one row.
*/
public static boolean isLatin(int[][] square)
{ /**
* Write the static method isLatin, which returns true if a given two-dimensional square array 
* is a Latin square, and otherwise, returns false.
* A two-dimensional square array of integers is a Latin square if the following conditions are true.
* • The first row has no duplicate values.
* • All values in the first row of the square appear in each row of the square.
* • All values in the first row of the square appear in each column of the square.
* Examples of Latin Squares
1 2 3
2 3 1
3 1 2

10 30 20 0
0  20 30 10
30 0  10 20 
20 10 0  30

Examples that are NOT Latin Squares

1 2 1
2 1 1
1 1 2
Not a Latin square because the first row contains duplicate values

1 2 3
3 1 2
7 8 9
Not a Latin square because the elements of the first row 
do not all appear in the third row

1 2
1 2
Not a Latin square because the elements of the first row do not 
all appear in either column

The ArrayTester class provides two helper methods: 
containsDuplicates and hasAllValues.
 
The method containsDuplicates returns true if 
the given one-dimensional array arr contains any 
duplicate values and false otherwise. 

The method hasAllValues returns true if and only if 
every value in arr1 appears in arr2. 

You do not need to write the code for these methods.
 
  
Class information for this question
public class ArrayTester
public static int[] getColumn(int[][] arr2D, int c)
public static boolean hasAllValues(int[] arr1, int[] arr2)
public static boolean containsDuplicates(int[] arr)
public static boolean isLatin(int[][] square)

Complete method is Latin below. Assume that getColumn 
works as specified, regardless of what you wrote in part (a). 
You must use getColumn, hasAllValues, and containsDuplicates appropriately 
to receive full credit.
*/ 

int[] firstRow = square[0];
if(containsDuplicates(firstRow)){
    return false;
}
/** Check rows */
for (int i = 1; i < firstRow.length;i++){
    //printArr(square[i]);
    if(!hasAllValues(firstRow, square[i])){
        return false;
    }   
}
/** Check columns */
for(int i = 0; i < firstRow.length;i++){
    //printArr(getColumn(square, i));
    if(!hasAllValues(firstRow, getColumn(square, i))){
        return false;
    }      
}
/** Must be a Latin Square */
return true;
} 
/** for debugging */
public static void printArr(int[] a){
    for(int i = 0; i < a.length;i++){
        System.out.print(a[i]+" ");
    }  
     System.out.println();
}

}
