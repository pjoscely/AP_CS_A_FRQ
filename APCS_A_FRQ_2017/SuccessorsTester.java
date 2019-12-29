
/** AP #4
* Test the Successors Class
*/
public class SuccessorsTester
{
    public static void main(String args[]){
    //Use AP Example for part (a) test
    int test[][] = {{15, 5, 9, 10}, 
                    {12, 16, 11, 6}, 
                    {14, 8, 13, 7}
                    }; 
   
   //loop through a range of test values
   for(int i = 1; i <= 20; i++){
     System.out.println(i+" is found at "+Successors.findPosition(i, test));
     }
/**
 * 1 is found at null
 * 2 is found at null
 * 3 is found at null
 * 4 is found at null
 * 5 is found at ( 0, 1 )
 * 6 is found at ( 1, 3 )
 * 7 is found at ( 2, 3 )
 * 8 is found at ( 2, 1 )
 * 9 is found at ( 0, 2 )
 * 10 is found at ( 0, 3 )
 * 11 is found at ( 1, 2 )
 * 12 is found at ( 1, 0 )
 * 13 is found at ( 2, 2 )
 * 14 is found at ( 2, 0 )
 * 15 is found at ( 0, 0 )
 * 16 is found at ( 1, 1 )
 * 17 is found at null
 * 18 is found at null
 * 19 is found at null
 * 20 is found at null
*/
//Part (b) test
Position[][] p = Successors.getSuccessorArray(test);
//Display the Position array p
// Loop through all rows 
  for (int i = 0; i <p.length; i++){
      // Loop through all elements of current row 
       for (int j = 0; j < p[i].length; j++){
         System.out.print(p[i][j]+" "); 
       }
          System.out.println();
  }
/**
 * ( 1, 1 ) ( 1, 3 ) ( 0, 3 ) ( 1, 2 ) 
 * ( 2, 2 )  null    ( 1, 0 ) ( 2, 3 ) 
 * ( 0, 0 ) ( 0, 2 ) ( 2, 0 ) ( 2, 1 ) 
*/
 }
}
