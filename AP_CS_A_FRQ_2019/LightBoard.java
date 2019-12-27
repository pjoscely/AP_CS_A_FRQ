/** AP CS A FRQ #4 2019
*The LightBoard class models a two-dimensional display of lights, 
*where each light is either on or off, as represented by a Boolean value. 
*You will implement a constructor to initialize the display 
*and a method to evaluate a light.
*/
 public class LightBoard
{
 /** The lights on the board, where true represents on 
 * and false represents off.
 */
   private boolean[][] lights;
   //when board is created will count number of on lights
   //not required by AP
   private int numOn;

   /** Constructs a LightBoard object having numRows rows and numCols columns.
    * Precondition: numRows > 0, numCols > 0
    * Postcondition: each light has a 40% probability of being set to on.
    */
public LightBoard(int numRows, int numCols) 
{
    double rand;
    lights = new boolean[numRows][numCols];
    for (int i = 0; i < numRows;i++){
        for(int j = 0; j <numCols;j++){
            rand = Math.random();
            if (rand < .4){
                lights[i][j] = true;
                numOn++;//incrememt the number of lights on counter
            }
            else{
                lights[i][j] = false;
            }
        }
    }
}
/** Displays grid of lights, not required by the AP */
public void displayLights(){
    for (int i = 0; i < lights.length;i++){
        
        for(int j = 0; j <lights[0].length;j++){
            System.out.print(lights[i][j]+" ");
            }
        System.out.println();
        }
    }
  
/** Return the percent of "on" lights, not required by the AP */
public double getPercentOn(){
    
    return (double)numOn/(lights.length*lights[0].length);
    
}

/** Write the method evaluateLight, which computes and returns the status of a light 
 * at a given row and column based on the following rules.
 * 
* 1. If the light is on, return false if the number of lights in its column 
* that are on is even, including the current light.
* 
* 2. If the light is off, return true if the number of lights in its column 
* that are on is divisible by three.
* 
* 3. Otherwise, return the light’s current status. 
 */

  public boolean evaluateLight(int row, int col)
 {  
        int ct = 0;
        if (lights[row][col] == true){
            for(int i = 0; i < lights.length; i++){
                if ( lights[i][col] == true){
                    ct++;
                }
            }
            if(ct%2 == 0){
                return false;
            }
        } 
        else if(lights[row][col] == false){
             for(int i = 0; i < lights.length; i++){
                if ( lights[i][col] == true){
                    ct++; 
                }
             }
            if(ct%3 == 0){
                return true;
            }
          }
       
            return lights[row][col];
}
}