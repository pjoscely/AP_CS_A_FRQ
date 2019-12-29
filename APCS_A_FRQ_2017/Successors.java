
/** AP #4 */
public class Successors
{
/**
* Class information for this question
* public class Position
* public Position(int r, int c)
* public class Successors
* public static Position findPosition(int num, int[][] intArr)
* public static Position[][] getSuccessorArray(int[][] intArr)
* Part (a)
* Write a static method findPosition that takes an integer value and a 2D integer array and 
* returns the position of the integer in the given 2D integer array. If the integer is not an element of
* the 2D integer array, the method returns null.
* For example, assume that array arr is the 2D integer array shown below.
* 15  5  9  10
* 12  16 11 6
* 14  8  13 7
* The call findPosition(8, arr) would return the Position object (2,1) because the
* value 8 appears in arr at row 2 and column 1.
* The call findPosition(17, arr) would return null because the value 17 does not appear in arr.
*
* Returns the position of num in intArr;
* returns null if no such element exists in intArr. 
* Precondition: intArr contains at least one row. 
*/
   public static Position findPosition(int num, int[][] intArr){
       // Loop through all rows 
        for (int i = 0; i <intArr.length; i++){
            // Loop through all elements of current row 
            for (int j = 0; j < intArr[i].length; j++){
                if(num == intArr[i][j]){
                    return new Position(i,j);
                }
                
            }
        }
       return null;
    }
    
/** Part (b)
* Write a static method getSuccessorArray that returns a 2D successor array of positions created 
* from a given 2D integer array.
* The successor of an integer value is the integer that is one greater than that value. For example,
* the successor of 8 is 9. A 2D successor array shows the position of the successor of each element 
* in a given 2D integer array. The 2D successor array has the same dimensions as the given 2D integer array. 
* Each element in the 2D successor array is the position (row, column) of the corresponding 2D integer array 
* element’s successor. The largest element in the 2D integer array does not have a successor in the
* 2D integer array, so its corresponding position in the 2D successor array is null.
* The following diagram shows a 2D integer array and its corresponding 2D successor array. 
* To illustrate the successor relationship, the values 8 and 9 in the 2D integer array are shaded. 
* In the 2D successor array, the shaded element shows that the position of the successor of 8 is 
* (0,2) in the 2D integer array. The largest value in the 2D integer array is 16, 
* so its corresponding element in the 2D successor array is null.
*
* * For example, assume that array arr is the 2D integer array shown below.
* 15  5  9  10
* 12  16 11 6
* 14  8  13 7
* 
* Successor Array 
* 
(1,1) (1,3) (0,3) (1,2)
(2,2) null  (1,0) (2,3)
(0,0) (0,2) (2,0)  (2,1)

* Returns a 2D successor array as described in part (b) constructed from intArr.
* Precondition: intArr contains at least one row and contains consecutive values.
* Each of these integers may be in any position in the 2D array.
*/
public static Position[][] getSuccessorArray(int[][] intArr){
    //define successor matrix
    Position[][] successor = new Position[intArr.length][intArr[0].length];
    //The successor of an integer value is the integer that is one greater than that value
    int successorVal;
    // Loop through all rows 
        for (int i = 0; i <intArr.length; i++){
            // Loop through all elements of current row 
            for (int j = 0; j < intArr[i].length; j++){
                //compute successor value
                successorVal = intArr[i][j]+1;
                //fill successor[i][j] with Position object for successorVal
                successor[i][j] = findPosition(successorVal, intArr);
                }    
            } 
       //return Position array
       return successor;
        }    
}
