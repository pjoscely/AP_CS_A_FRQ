
/** AP #1
* This question involves reasoning about one-dimensional and two-dimensional arrays of integers. 
* You will write three static methods, all of which are in a single enclosing class, named DiverseArray (not shown). 
* The first method returns the sum of the values of a one-dimensional array; 
* the second method returns an array that represents the sums of the rows of a two-dimensional array; 
* and the third method analyzes row sums.
* Methods written in this question
* public static int arraySum(int[] arr)
* public static int[] rowSums(int[][] arr2D)
* public static boolean isDiverse(int[][] arr2D)
*/
public class DiverseArray
{
/** Part (a)
Write a static method arraySum that calculates and returns the sum of the entries in a specified one-dimensional array. 
* The following example shows an array arr1 and the value returned by a call to arraySum.
* arr1:
* 0 1 2 3 4
* 1 3 2 7 3
* Value returned by arraySum(arr1) = 17
* Returns the sum of the entries in the one-dimensional array arr. 
*/
public static int arraySum(int[] arr){
   int sum = 0;
   for(int i = 0; i < arr.length; i++){
       sum+=arr[i];  
    }
   return sum;
}
/** Part (b)
* Write a static method rowSums that calculates the sums of each of the rows in a given 
* two- dimensional array and returns these sums in a one-dimensional array. 
* The method has one parameter, a two- dimensional array arr2D of int values. 
* The array is in row-major order: arr2D[r][c] is the entry atrowrandcolumnc. 
* The method returns a one-dimensional array with one entry for each row of arr2D such that each 
* entry is the sum of the corresponding row in arr2D. As a reminder, each row of a two-dimensional array 
* is a one-dimensional array.
* For example, if mat1 is the array represented by the following table, 
* 1  3  2  7  3 = 16
* 10 10 4  6  2 = 32
* 5  3  5  9  6 = 28
* 7  6  4  2  1 = 20
* the call rowSums(mat1) returns 
* the array {16, 32, 28, 20}.
* Assume that arraySum works as specified, regardless of what you wrote in part (a). 
* You must use arraySum appropriately to receive full credit. Complete method rowSums below. 
* Returns a one-dimensional array in which the entry at index k is the sum of 
* the entries of row k of the two-dimensional array arr2D.
*/
public static int[] rowSums(int[][] arr2D){
    int[] sums = new int[arr2D.length];
    for(int i = 0; i < arr2D.length; i++){
       sums[i] = arraySum(arr2D[i]);  
    }
    return sums;    
}
/** Part (c)
* A two-dimensional array is diverse if no two of its rows have entries that sum to the same value. 
* In the following examples, the array mat1 is diverse because each row sum is different, 
* but the array mat2 is not diverse because the first and last rows have the same sum.
*     mat1
* 1  3  2  7  3  = 16
* 10 10 4  6  2  = 32
* 5  3  5  9  6  = 28
* 7  6  4  2  1  = 20
*    mat2
* 1  1  5  3  4  = 14
* 12 7  6  1  9  = 35
* 8  11 10 2  5  = 36
* 3  2  3  0  6  = 14
* Write a static method isDiverse that determines whether or not a given two-dimensional array is diverse.
* The method has one parameter: a two-dimensional array arr2D of int values. The method should return true 
* if all the row sums in the given array are unique; otherwise, it should return false. In the arrays shown
* above, the call isDiverse(mat1) returns true and the call isDiverse(mat2) returns false.
* Assume that arraySum and rowSums work as specified, regardless of what you wrote in parts (a) and (b)
* You must use rowSums appropriately to receive full credit. Complete method isDiverse below.
* Returns true if all rows in arr2D have different row sums; 
* false otherwise.
*/
public static boolean isDiverse(int[][] arr2D){
     int[] sums = new int[arr2D.length]; 
     sums = rowSums(arr2D);
     //brute force O(n^2) check; sorting maybe not available on the AP
     for(int i = 0; i < sums.length; i++){
         for(int j = i+1; j < sums.length; j++){
             if(sums[i] == sums[j]){
                return false; 
             }
        }
      }
      return true;
    }
}

