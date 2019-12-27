
/**
 *Test code for StepTracker clss
 */
public class StepTrackerTester
{
   public static void main(String args[])
   {
        StepTracker tr = new StepTracker(10000);
        //Days with at least 10,000 steps are considered active. 
        //Assume that the parameter is positive.
        System.out.println("Days active: "+tr.activeDays());
        //No data have been recorded yet.
        System.out.println("Average number of steps per day: "+tr.averageSteps());
        //When no step data have been recorded, 
        //the averageSteps method returns 0.0.
        tr.addDailySteps(9000);
        //This is too few steps for the day to be considered active.
         tr.addDailySteps(5000);
        //This is too few steps for the day to be considered active.
         System.out.println("Days active: "+tr.activeDays());
        //No day had at least 10,000 steps.
        System.out.println("Average number of steps per day: "+tr.averageSteps());
        //The average number of steps per day is (14000 / 2).
        tr.addDailySteps(13000);
        //This represents an active day.
        System.out.println("Days active: "+tr.activeDays());
        //Of the three days for which step data were entered, 
        //one day had at least 10,000 steps.
         //System.out.println("Average number of steps per day: "tr.averageSteps());
        //The average number of steps per day is (27000 / 3).
         tr.addDailySteps(23000);
        //This represents an active day.
         tr.addDailySteps(1111);
         //This is too few steps for the day to be considered active.
         System.out.println("Days active: "+tr.activeDays());
         //Of the five days for which step data were entered, 
         //two days had at least 10,000 steps.
         System.out.println("Average number of steps per day: "+tr.averageSteps());
         //The average number of steps per day is (51111 / 5).
    }
}
