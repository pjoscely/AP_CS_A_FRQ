
/** AP #2
* The SystemLog class represents a list of LogMessage objects and provides a method 
* that removes and returns a list of all log messages (if any) that properly contain a given keyword. 
* The messages in the returned list appear in the same order in which they originally appeared 
* in the system log. If no message properly contains the keyword, an empty list is returned. 
* The declaration of the SystemLog class is shown below.
*/
import java.util.*;
   public class SystemLog
   {
/** Contains all the entries in this system log.
* Guaranteed not to be null and to contain only non-null entries. 
*/
      private List<LogMessage> messageList;
/** Basic constructor */      
      public SystemLog(ArrayList<LogMessage> arr){
          messageList = arr;
        }
/**
Removes from the system log all entries whose descriptions properly contain keyword, 
and returns a list (possibly empty) containing the removed entries.
Postcondition:
* - Entries in the returned list properly contain keyword and
* are in the order in which they appeared in the system log.
* - The remaining entries in the system log do not properly contain keyword and 
* are in their original order.
* - The returned list is empty if no messages properly contain keyword.
* Write the SystemLog method removeMessages, which removes from the system log all entries 
* whose descriptions properly contain keyword and returns a list of the removed entries in their original order. 
* For example, assume that theLog is a SystemLog object initially containing six LogMessage objects 
* representing the following list of log messages.
*   CLIENT3:security alert – repeated login failures
*   Webserver:disk offline
*    SERVER1:file not found
*    SERVER2:read error on disk DSK1
*    SERVER1:write error on disk DSK2
*    Webserver:error on /dev/disk
* The call theLog.removeMessages("disk") would return a list containing the LogMessage objects 
* representing the following log messages.
*    Webserver:disk offline
*    SERVER2:read error on disk DSK1
*    SERVER1:write error on disk DSK2
* After the call, theLog would contain the following log messages.
*    CLIENT3:security alert – repeated login failures
*    SERVER1:file not found
*    Webserver:error on /dev/disk
*/
   public List<LogMessage> removeMessages(String keyword)
{ 
 /** AP Code below has index i modified inside the foor loop NOT GOOD!
  * Concurrent Modification Exception is a possible issue
  */
   List<LogMessage> removals = new ArrayList<LogMessage>();
      for (int i = 0; i < messageList.size(); i++)
      {
            if (messageList.get(i).containsWord(keyword))
            {
                //imo Should not have code like this on the AP 
                removals.add(messageList.remove(i));
                i--;
            } 
           
       } 
      return removals;
}
//Print method for testing

public void printLog(){
    for(LogMessage m:messageList){
     System.out.println(m);
    }
}

}
