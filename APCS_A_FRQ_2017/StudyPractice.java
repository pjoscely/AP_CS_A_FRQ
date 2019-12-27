/** AP #2
* This question involves the design of a class that will be used to produce practice problems. 
* The following StudyPractice interface represents practice problems that 
* can be used to study some subject.
*/
public interface StudyPractice
 { /** Returns the current practice problem. */ 
     String getProblem();
/** Changes to the next practice problem. */
     void nextProblem();
     }
/** The MultPractice class is a StudyPractice that produces multiplication practice problems. 
* A MultPractice object is constructed with two integer values: first integer and initial second integer. 
* The first integer is a value that remains constant and is used as the first integer in every practice problem.
* The initial second integer is used as the starting value for the second integer in the practice problems. 
* This second value is incremented for each additional practice problem that is produced by the class.
* For example, a MultPractice object created with the call new MultPractice(7, 3) would be used to create 
* the practice problems "7 TIMES 3", "7 TIMES 4", "7 TIMES 5", and so on.
* In the MultPractice class, the getProblem method returns a string in the format of 
* "first integer TIMES second integer". The nextProblem method updates the state of the MultPractice 
* object to represent the next practice problem.
* The following examples illustrate the behavior of the MultPractice class. 
* Each table shows a code segment and the output that would be produced as the code is executed.
* 
* Example 1
* StudyPractice p1 = new MultPractice(7, 3);
* System.out.println(p1.getProblem());
* p1.nextProblem();
* System.out.println(p1.getProblem());
* p1.nextProblem();
* System.out.println(p1.getProblem());
* p1.nextProblem();
* System.out.println(p1.getProblem());
* 7 TIMES 3
* 7 TIMES 4
* 7 TIMES 5
* 7 TIMES 6

* Example 2
* StudyPractice p2 = new MultPractice(4, 12);
* p2.nextProblem();
* System.out.println(p2.getProblem());
* System.out.println(p2.getProblem());
* p2.nextProblem();
* p2.nextProblem();
* System.out.println(p2.getProblem());
* p2.nextProblem();
* System.out.println(p2.getProblem());
* 4 TIMES 13
* 4 TIMES 13
* 4 TIMES 15
* 4 TIMES 16
  
* Interface information for this question
* public interface StudyPractice
* String getProblem()
* void nextProblem()
* Write the complete MultPractice class. Your implementation must be consistent 
* with the specifications and the given examples.
*/