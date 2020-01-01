/** AP #2
*This question involves two classes that are used to process log messages. A list of sample log messages is given below.
*     CLIENT3:security alert – repeated login failures
*     Webserver:disk offline
*     SERVER1:file not found
*     SERVER2:read error on disk DSK1
*     SERVER1:write error on disk DSK2
*    Webserver:error on /dev/disk
* Log messages have the format machineId:description, where machineId identifies the computer and description 
* describes the event being logged. Exactly one colon (":") appears in a log message. There are no blanks 
* either immediately before or immediately after the colon.
* The following LogMessage class is used to represent a log message. public class LogMessage
*/
public class LogMessage{
 private String machineId;
 private String description;

/** Part (a)
* Write the constructor for the LogMessage class. It must initialize the private data of the object 
* so that getMachineId returns the machineId part of the message and getDescription returns 
* the description part of the message.
* Precondition: message is a valid log message. 
*/
 
public LogMessage(String message)
{ 
    int indxColon = message.indexOf(":");
    machineId = message.substring(0,indxColon);
    description = message.substring(indxColon+1);
}
/** Part (b) 
* Write the LogMessage method containsWord, which returns true if the description 
* in the log message properly contains a given keyword and returns false otherwise.
* A description properly contains a keyword if all three of the following conditions are true.
* o the key word is a substring of the description;
* o the key word is either at the beginning of the description or it is 
* immediately preceded by a space; 
* o the key word is either at the end of the description or it is immediately followed by a space.
* The followin show several examples. The first descriptions properly 
* contain the keyword "disk". The second descriptions do not properly 
* contain the keyword "disk".
* 
* Descriptions that properly contain "disk"       
* "disk"
* "error on disk"
* "error on /dev/disk disk"
* "error on disk DSK1"
* 
* Descriptions that do not properly contain "disk"
* "DISK"
* "error on disk3"
* "error on /dev/disk"
* "diskette"

* Returns true if the description in this log message properly contains keyword; 
* false otherwise.
*/
public boolean containsWord(String keyword)
{
    if (description.equals(keyword))
   {   
      return true;  
   }
   else if (description.indexOf(keyword + " ") == 0)
   {   
       return true;   
   }
   else if (description.indexOf(" " + keyword + " ") != -1)
   {   
       return true;   
    }
  
    else if (description.length() > keyword.length())
   { 
        if ((description.substring(description.length() - keyword.length() - 1).equals(" " + keyword)))
      { 
          return true;
       }
    }
   return false;
} 
//accessor for machineId
public String getMachineId()
{  
   return machineId;  
}
//accessor for description
public String getDescription()
{  
   return description;  
}

//toString()
public String toString(){
    return machineId+":"+description;  
}
}