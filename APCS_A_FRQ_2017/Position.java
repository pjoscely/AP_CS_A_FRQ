/** #4
* The following Position class is used to represent positions in the integer array. 
* The notation (r,c) will be used to refer to a Position object with row r and column c.
* Not implemented on the AP, but it is here
*/
  public class Position
   {
      /** not supplied by the AP */ 
      private int r;
      private int c;
      
    /** Constructs a Position object with row r and column c. */   
   public Position(int r, int c)
      { 
          /** not supplied by the AP */
          this.r = r;
          this.c = c; 
      }
    /** Mutators and accessors for the position class */
    public int getRow(){
      return r;
    }
     public int getCol(){
      return c;
    }
    public void changeRow(int row){
      r = row;     
    }
    
     public void changeCol(int col){
      c = col;     
    }

   public String toString(){
     return "( "+r+", "+c+" )";  
     }
}
