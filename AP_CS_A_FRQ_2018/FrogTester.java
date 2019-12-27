
/**
 * FrogSimulation Tester
 * Add more tests as desired
 */
public class  FrogTester
{
    public static void main(String args[]){
    FrogSimulation sim = new FrogSimulation(10, 10);//new simulation
    boolean result=sim.simulate();
    System.out.println(result);//print simualtionoutcome
    
    System.out.println(sim.runSimulations(400)*100+"% sucesses");//simulate 400 times
    }
}
