/** AP #2
 * Test LogMessage here.
 */
import java.util.*;
public class LogMessageTester
{
    public static void main(String args[]){
    //Part a, b tests
    //true outcomes
    LogMessage m1 = new LogMessage("web:disk");
    LogMessage m2 = new LogMessage("web:error on disk");
    LogMessage m3 = new LogMessage("web:error on /dev/disk disk");
    LogMessage m4 = new LogMessage("web:error on disk DSK1");
    
    System.out.println(m1.containsWord("disk"));
    System.out.println(m2.containsWord("disk"));
    System.out.println(m3.containsWord("disk"));
    System.out.println(m4.containsWord("disk"));
    /**
     true
     true
     true
     true
     */
    //false outcomes
    LogMessage m5 = new LogMessage("web:DISK");
    LogMessage m6 = new LogMessage("web:error on disk3");
    LogMessage m7 = new LogMessage("web:error on /dev/disk");
    LogMessage m8 = new LogMessage("web:diskette");
    
    System.out.println(m5.containsWord("disk"));
    System.out.println(m6.containsWord("disk"));
    System.out.println(m7.containsWord("disk"));
    System.out.println(m8.containsWord("disk"));
    /**
     false
     false
     false
     false
     */
    //Part c tests
    ArrayList<LogMessage> log = new ArrayList<LogMessage>();
    log.add(new LogMessage("CLIENT3:security alert – repeated login failures"));
    log.add(new LogMessage("Webserver:disk offline"));
    log.add(new LogMessage("SERVER1:file not found"));
    log.add(new LogMessage("SERVER2:read error on disk DSK1"));
    log.add(new LogMessage("SERVER1:write error on disk DSK2"));
    log.add(new LogMessage("Webserver:error on /dev/disk"));
    
    SystemLog l = new SystemLog(log);
    l.printLog();
    List<LogMessage> removed = new ArrayList<LogMessage>();
    removed = l.removeMessages("disk");
    System.out.println(removed);
    l.printLog();
/**
CLIENT3:security alert – repeated login failures
Webserver:disk offline
SERVER1:file not found
SERVER2:read error on disk DSK1
SERVER1:write error on disk DSK2
Webserver:error on /dev/disk

[Webserver:disk offline, SERVER2:read error on disk DSK1, SERVER1:write error on disk DSK2]

CLIENT3:security alert – repeated login failures
SERVER1:file not found
Webserver:error on /dev/disk
*/

    

    
    
    }
}
