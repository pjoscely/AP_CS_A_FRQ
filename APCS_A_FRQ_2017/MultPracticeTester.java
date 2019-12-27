
/** AP #2
 *class MultPracticeTester tests MultPractice.
*/
public class MultPracticeTester
{
    public static void main(String args[]){
     //Example 1
     StudyPractice p1 = new MultPractice(7, 3);
     System.out.println(p1.getProblem());
     p1.nextProblem();
     System.out.println(p1.getProblem());
     p1.nextProblem();
     System.out.println(p1.getProblem());
     p1.nextProblem();
     System.out.println(p1.getProblem());
     /**
        7 TIMES 3
        7 TIMES 4
        7 TIMES 5
        7 TIMES 6
      */
     //Example 2
     StudyPractice p2 = new MultPractice(4, 12);
     p2.nextProblem();
     System.out.println(p2.getProblem());
     System.out.println(p2.getProblem());
     p2.nextProblem();
     p2.nextProblem();
     System.out.println(p2.getProblem());
     p2.nextProblem();
     System.out.println(p2.getProblem());
     /**
     4 TIMES 13
     4 TIMES 13
     4 TIMES 15
     4 TIMES 16
     */
   }
}
