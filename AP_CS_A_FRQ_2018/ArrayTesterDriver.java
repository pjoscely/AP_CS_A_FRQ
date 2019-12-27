
/**
* Test cases for the ArrayTester Class
 */
public class ArrayTesterDriver
{
   public static void main(String args[]){
    int[][] latin1 = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
    ArrayTester.printArr(latin1[0]);
    ArrayTester.printArr(latin1[1]);
    ArrayTester.printArr(latin1[2]);
    System.out.println(ArrayTester.isLatin(latin1));
    int[][] latin2 = {{10 ,30, 20, 0,},{0,  20, 30, 10},
    {30, 0,  10, 20}, {20, 10, 0 , 30}};
     ArrayTester.printArr(latin2[0]);
    ArrayTester.printArr(latin2[1]);
    ArrayTester.printArr(latin2[2]);
    ArrayTester.printArr(latin2[2]);
    System.out.println(ArrayTester.isLatin(latin2));
    int[][] latin3 = {{1, 2, 2}, {2, 3, 1}, {3, 1, 2}};
    ArrayTester.printArr(latin3[0]);
    ArrayTester.printArr(latin3[1]);
    ArrayTester.printArr(latin3[2]);
    System.out.println(ArrayTester.isLatin(latin3));
     int[][] latin4 = {{1, 2, 2}, {2, 3, 1}, {7, 8, 9}};
    ArrayTester.printArr(latin4[0]);
    ArrayTester.printArr(latin4[1]);
    ArrayTester.printArr(latin4[2]);
    System.out.println(ArrayTester.isLatin(latin4));
    int[][] latin5 = {{1, 2},{1,2}};
    ArrayTester.printArr(latin5[0]);
    ArrayTester.printArr(latin5[1]);
    System.out.println(ArrayTester.isLatin(latin5));
    
/** Test Output
1 2 3 
2 3 1 
3 1 2 
true
10 30 20 0 
0 20 30 10 
30 0 10 20 
30 0 10 20 
true
1 2 2 
2 3 1 
3 1 2 
false
1 2 2 
2 3 1 
7 8 9 
false
1 2 
1 2 
false
 */
    
    
    
    }
}
