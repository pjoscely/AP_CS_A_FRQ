
/**
 * Test AP FRQ #1
 */
public class DigitsTester
{
    public static void main(String args[]){
   
System.out.println(new Digits(7).isStrictlyIncreasing());
//true
System.out.println(new Digits(1356).isStrictlyIncreasing());
//true
System.out.println(new Digits(1336).isStrictlyIncreasing());
//false
System.out.println(new Digits(1536).isStrictlyIncreasing());
//false
System.out.println(new Digits(65310).isStrictlyIncreasing());
//false
}
}
