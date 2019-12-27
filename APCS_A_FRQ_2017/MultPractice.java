/**
 AP #2
 */
public class MultPractice implements StudyPractice
{
    // instance variables - replace the example below with your own
    private int firstInt;
    private int secondInt;

    /**
     * Constructor for objects of class MultPractice
     */
    public MultPractice(int first, int second)
    {
        // initialise instance variables
        firstInt = first;
        secondInt = second;
    }

public String getProblem(){
    return firstInt+" TIMES "+ secondInt;
}

 public void nextProblem(){
     secondInt++;
    }
}
