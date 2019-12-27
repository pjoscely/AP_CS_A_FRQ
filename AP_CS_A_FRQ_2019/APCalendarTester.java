/**
*APCalendarTeste
*/

public class APCalendarTester

{
    public static void main(String args[])
    {
        //test famous and not so famous dates
        System.out.println("06/20/1955 fell on a "+getDayName(APCalendar.dayOfWeek(6, 20, 1955)));

        System.out.println("12/7/1941 fell on a "+getDayName(APCalendar.dayOfWeek(12, 7, 1941)));

        System.out.println("12/25/2018 fell on a "+getDayName(APCalendar.dayOfWeek(12, 25, 2018)));

        System.out.println("1/23/1985 fell on a "+getDayName(APCalendar.dayOfWeek(1, 23, 1985)));

        System.out.println("6/9/1977 fell on a "+getDayName(APCalendar.dayOfWeek(6, 9, 1977)));

        System.out.println("4/15/1952 fell on a "+getDayName(APCalendar.dayOfWeek(4, 15, 1952)));

        System.out.println("11/22/1963 fell on a "+getDayName(APCalendar.dayOfWeek(11, 22, 1963)));

        System.out.println("9/11/2011 fell on a "+getDayName(APCalendar.dayOfWeek(9, 11, 2001)));

        System.out.println("10/15/2003 fell on a "+getDayName(APCalendar.dayOfWeek(10, 15, 2003)));
        
        System.out.println("7/27/2004 fell on a "+getDayName(APCalendar.dayOfWeek(7, 27, 2004)));
        /**
         * 06/20/1955 fell on a Monday
         * 12/7/1941 fell on a Sunday
         * 12/25/2018 fell on a Tuesday
         * 1/23/1985 fell on a Wednesday
         * 6/9/1977 fell on a Thursday
         * 4/15/1952 fell on a Tuesday
         * 11/22/1963 fell on a Friday
         * 9/11/2011 fell on a Tuesday
         * 10/15/2003 fell on a Wednesday
         * 8/8/1951 fell on a Wednesday
           */
        }   
    public static String getDayName(int day){
    if(day == 0)
     return "Sunday";
    else if(day == 1)
     return "Monday";
    else if (day == 2)
     return "Tuesday";
    else if(day == 3)
     return "Wednesday";
    else if (day == 4)
     return "Thursday";
    else if(day == 5)
     return "Friday";
    else
     return "Saturday";
}
}