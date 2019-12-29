
/**
 * Test Code for AP #3 
 */
public class phraseTester
{
  public static void main(String args[]){
      //Part a test
      Phrase phrase1 = new Phrase("A cat ate late.");
      phrase1.replaceNthOccurrence("at", 1, "rane");
      System.out.println(phrase1);

      //A crane ate late.

      Phrase phrase2 = new Phrase("A cat ate late.");
      phrase2.replaceNthOccurrence("at", 6, "xx");
      System.out.println(phrase2);
      //A cat ate late.

      Phrase phrase3 = new Phrase("A cat ate late.");
      phrase3.replaceNthOccurrence("bat", 2, "xx");
      System.out.println(phrase3);
      //A cat ate late.

      Phrase phrase4 = new Phrase("aaaa");
      phrase4.replaceNthOccurrence("aa", 1, "xx");
      System.out.println(phrase4);
     //xxaa

      Phrase phrase5 = new Phrase("aaaa");
      phrase5.replaceNthOccurrence("aa", 2, "bbb");
      System.out.println(phrase5);
      //abbba
      Phrase phrase6 = new Phrase("aaaa");
      //check for possible error at end of string
      phrase6.replaceNthOccurrence("aa", 3, "xx");
      System.out.println(phrase6);
     //aaxx
      Phrase phrase1b = new Phrase("A cat ate late.");
     //Part b test
      System.out.println(phrase1b.findLastOccurrence("at"));
     //11
      System.out.println(phrase1b.findLastOccurrence("cat"));
     // 2
       System.out.println(phrase1b.findLastOccurrence("bat"));
     //-1
    }
}
