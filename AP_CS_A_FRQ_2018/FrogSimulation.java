/**
 * AP #1 FRQ 2018
 */
import java.util.*;
public class FrogSimulation
{
/** Distance, in inches, from the starting position to the goal. */ 
private int goalDistance;
/** Maximum number of hops allowed to reach the goal. */ 
private int maxHops;
/** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
* position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
* Precondition: dist > 0; numHops > 0
*/
public FrogSimulation(int dist, int numHops)
{
    goalDistance = dist;
    maxHops = numHops;
}

/** Returns an integer representing the distance, in inches, 
 * to be moved when the frog hops. */
 public int hopDistance()
{ 
  /** Not required by the AP; 
   * made public for testing
   * return an int in [-6, 6]
   */
  return -6 + (int)(Math.random() * ((12) + 1)); 
}
/** Part (a) 
* Write the simulate method, which simulates the frog attempting to hop in a straight line 
* to a goal from the frog's starting position of 0 within a maximum number of hops. 
* The method returns true if the frog successfully reached the goal within the maximum number of hops; 
* otherwise, the method returns false.
* The FrogSimulation class provides a method called hopDistance that returns an integer 
* representing the distance (positive or negative) to be moved when the frog hops. 
* A positive distance represents a move toward the goal. A negative distance represents a move away from the goal. 
* The returned distance may vary from call to call. Each time the frog hops, its position is adjusted by the 
* value returned by a call to the hopDistance method.
* The frog hops until one of the following conditions becomes true:
*   The frog has reached or passed the goal.
*   The frog has reached a negative position.
*   The frog has taken the maximum number of hops without reaching the goal.
* The following example shows a declaration of a FrogSimulation object for which the goal distance 
* is 24 inches and the maximum number of hops is 5. The table shows some possible outcomes 
* of calling the simulate method.

* FrogSimulation sim = new FrogSimulation(24, 5);
* Values returned by hopDistance() of frog, Final Position Return value of sim.simulate()
* 
* Example 1
* 5, 7,-2, 8, 6 Final =  24 true
 
* Example 2 
* 6, 7, 6, 6 Final = 25 true

* Example 3
* 6, -6, 31 Final = 31 true
* 
* Example 4
* 4, 2, -8 Final = -2 false

* Example 5
* 5, 4, 2, 4, 3 Final = 18 false
  
Class information for this question
public class FrogSimulation
private int goalDistance
private int maxHops
private int hopDistance()
public boolean simulate()
public double runSimulations(int num)
 
   
* Simulates a frog attempting to reach the goal as described in part (a).
* Returns true if the frog successfully reached or passed the goal during 
* the simulation; * false otherwise.
*/
public boolean simulate()
{ 
    int pos = 0;
    for (int i = 0; i < maxHops; i++){
          pos+=hopDistance();
          //System.out.print(pos+" ");//testing
        
          if (pos >= goalDistance){
              return true;
          }
          else if(pos < 0){
            return false;  
          } 
    }
 
   return false;
}
/** Runs num simulations and returns the proportion of simulations 
* in which the frog
* successfully reached or passed the goal.
* Precondition: num > 0 */
        public double runSimulations(int num)
 { 
     int success = 0;
     for(int i = 0; i < num;i++){
         if(simulate()){
            success++;
         }     
     }
     return (double)success/num;
} 
}
