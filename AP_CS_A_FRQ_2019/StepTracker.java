
/** AP FRQ #2 2019
*This question involves the implementation of a fitness tracking system 
*that is represented by the StepTracker class. 
*A StepTracker object is created with a parameter that 
*defines the minimum number of steps that must be taken for a 
*day to be considered active.
*The StepTracker class provides a constructor and the following methods.
*addDailySteps, which accumulates information about steps, 
*in readings taken once per day
*activeDays, which returns the number of active days
*averageSteps, which returns the average number of steps per day, 
*calculated by dividing the total number of steps taken by the number of days tracked
*The following table contains a sample code execution sequence and the corresponding results.

StepTracker tr = new StepTracker(10000);
Days with at least 10,000 steps are considered active. Assume that the parameter is positive.
tr.activeDays();
0

No data have been recorded yet.
tr.averageSteps();
0.0

When no step data have been recorded, the averageSteps method returns 0.0.
tr.addDailySteps(9000);

This is too few steps for the day to be considered active.
tr.addDailySteps(5000);

This is too few steps for the day to be considered active.
tr.activeDays();
0

No day had at least 10,000 steps.
tr.averageSteps();
7000.0 The average number of steps per day is (14000 / 2).
tr.addDailySteps(13000);

This represents an active day.
tr.activeDays();
1

Of the three days for which step data were entered, one day had at least 10,000 steps.
tr.averageSteps();
9000.0

The average number of steps per day is (27000 / 3).
tr.addDailySteps(23000);
This represents an active day.

tr.addDailySteps(1111);
This is too few steps for the day to be considered active.

tr.activeDays();
2

Of the five days for which step data were entered, two days had at least 10,000 steps.
tr.averageSteps();
10222.2

The average number of steps per day is (51111 / 5).
 */

public class StepTracker
{
    // instance variables - replace the example below with your own
    private int minNumSteps;
    private int numDaysActive;
    private int dailySteps;
    private int numDays;

    /**
     * Constructor for objects of class AP_2_2019
     */
    public StepTracker(int minNumSteps)
    {
        // initialise instance variables
        this.minNumSteps = minNumSteps;
        numDaysActive = 0;
        dailySteps = 0;
        numDays = 0;
        
    }

    /**
     * activeDays, returns the number of active days
     */
    public int activeDays()
    {
        // put your code here
        return numDaysActive;
    }
    
    /**
     * addDailySteps, which accumulates information about steps, 
     * in readings taken once per day
     */
    
    public void addDailySteps(int dailySteps){
        if (dailySteps>=minNumSteps){
           numDaysActive++; 
            
        }
        numDays++;
        this.dailySteps+=dailySteps;  
    }
    /**
     * averageSteps, returns the average number of steps per day, 
     * calculated by dividing the total number of steps 
     * taken by the number of days tracked
     */

    public  double averageSteps(){
        if ( numDays == 0){
            return 0;
        }
        else{
        return (double)dailySteps/numDays;
    }
    }
       
}
