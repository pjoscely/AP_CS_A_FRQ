/** AP #1
 *  Test code for Diverse Array
 */
public class DiverseArrayTester
{
    public static void main(String args[]){
    //Part (a) Test
    int[] a = {1, 3, 2, 7, 3};
    System.out.print(DiverseArray.arraySum(a)); //prints 16 
    //Part (b) Test
    int[][] b = {{1,3,2,7,3},{10,10,4,6,2},{5,3,5,9,6},{7,6,4,2,1}};
    printArray(DiverseArray.rowSums(b));//prints 16 32 28 20 
    //Part (c) Test
    System.out.println(DiverseArray.isDiverse(b));//prints true
    int[][] c = {{1,1,5,3,4},{12,7,6,1,9},{8,11,10,2,5},{3,2,3,0,6}};
    System.out.println(DiverseArray.isDiverse(c));//prints false
    int [][] d ={{1}};//edge case
    System.out.println(DiverseArray.isDiverse(d));//prints true
    }
    //Displays 1D array; used for testing
    public static void printArray(int[] arr){
        System.out.println();  
       for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i]+ " ");  
    }     
      System.out.println();  
    }
}
