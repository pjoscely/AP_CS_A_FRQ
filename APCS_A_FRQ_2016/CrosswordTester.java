
/**
* AP #3 CrosswordTester .
*/
public class CrosswordTester
{
  public static void main(String args[]){
   /** Test 1
    * ww
    * bb
    * W:1 W:2 
    * B:0 B:0 
    */
    boolean[][] s1 = new boolean[2][2];
    s1[0][0] = false;
    s1[0][1] = false;
    s1[1][0] = true;
    s1[1][1] = true;
    Crossword p1 = new Crossword(s1);
    p1.printPuzzle();
    
    /** Test 2
     * bw
     * wb
    * B:0 W:1 
    * W:2 B:0
    */
    boolean[][] s2 = new boolean[2][2];
    s2[0][0] = true;
    s2[0][1] = false;
    s2[1][0] = false;
    s2[1][1] = true;
    Crossword p2 = new Crossword(s2);
    p2.printPuzzle();
    
    /** Test 3
    * bwb
    * wwb
    * www
    * B:0 W:1 B:0 
    * W:2 W:0 B:0 
    * W:3 W:0 W:4 
    */
    boolean[][] s3 = new boolean[3][3];
    s3[0][0] = true;
    s3[0][1] = false;
    s3[0][2] = true;
    
    s3[1][0] = false;
    s3[1][1] = false;
    s3[1][2] = true;
    
    s3[2][0] = false;
    s3[2][1] = false;
    s3[2][2] = false;
    
    Crossword p3 = new Crossword(s3);
    p3.printPuzzle();
    
    
    
    
    
    
    
    
}




}
