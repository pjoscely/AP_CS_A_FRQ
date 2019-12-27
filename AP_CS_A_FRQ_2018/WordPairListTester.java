
/**
 *class WordPairListTester

 */
public class WordPairListTester
{
    public static void main(String args[]){
     //Part a test
     System.out.println("*** Part a Test 1 ***");
     String[] wordNums = {"one", "two", "three"};
     WordPairList exampleOne = new WordPairList(wordNums); 
     exampleOne.printAllPairs();
     System.out.println("*** Part b Test 2 ***");
     String[] phrase = {"the", "more", "the", "merrier"};
     WordPairList exampleTwo = new WordPairList(phrase);
     exampleTwo.printAllPairs();
     
     //Part b test
     System.out.println("*** Part b Test ***");
     String[] moreWords = {"the", "red", "fox", "the", "red"};
     WordPairList exampleThree = new WordPairList(moreWords);
     exampleThree.printAllPairs();
     System.out.println("Number of matches: "+exampleThree.numMatches());
    /**
    *** Part a Test 1 ***
    (one, two) (one, three) (two, three) 
    *** Part b Test 2 ***
    (the, more) (the, the) (the, merrier) (more, the) (more, merrier) (the, merrier) 
    *** Part b Test ***
    (the, red) (the, fox) (the, the) (the, red) (red, fox) (red, the) 
    (red, red) (fox, the) (fox, red) (the, red) 
    Number of matches: 2
     */ 
   }
}
