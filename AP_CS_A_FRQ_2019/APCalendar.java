/** AP CS A FRQ #1 2019
* The APCalendar class contains methods used to calculate information about a calendar.
* You will write two methods of the class.
*/

public class APCalendar

{
/** Returns true if year is a leap year and false otherwise.
* Every year that is exactly divisible by four is a leap year,
* except for years that are exactly divisible by 100,
* but these centurial years are leap years if they are exactly divisible by 400.
* For example, the years 1700, 1800, and 1900 are not leap years,
* but the years 1600 and 2000 are.
* Made public for testing
*/

public static boolean isLeapYear(int year)
{ /** implementation not required by the AP */
  if (year % 4 == 0 ){
      if(year % 100 != 0){
          return true;
        }
        else if(year % 100 == 0 && year % 400 == 0){
            return true;
        } 
        else if (year % 100 == 0 && year % 400 != 0){
            return false;
        }
    }
    return false;
  }

/** Part (a)
   * Returns the number of leap years between year1 and year2, inclusive.
   * Precondition: 0 <= year1 <= year2
*/

public static int numberOfLeapYears(int year1, int year2)
{
  int ct = 0;
  for(int i = year1; i<= year2; i++)
  {
      if(isLeapYear(i)){
          ct++;
        }
    }
   return ct;
 }

/** Returns the value representing the day of the week for the first day of year,
* where 0 denotes Sunday, 1 denotes Monday,..., and 6 denotes Saturday.
* Made public for testing
*/
public static int firstDayOfYear(int year)
{ /** implementation not required by the AP */
      /** Gauss formula:

     * R(1+5R(A-1,4)+4(A-1,100)+6R(A-1,400),7)

     * https://en.wikipedia.org/wiki/Determination_of_the_day_of_the_week

     */
    int A = year;
    return (1+5*((A-1)%4) + 4*((A-1)%100) + 6*((A-1)%400))%7;
}

/** Returns n, where month, day, and year specify the nth day of the year.
* Returns 1 for January 1 (month = 1, day = 1) of any year.
* Precondition: The date represented by month, day, year is a valid date.
*  Made public for testing
*/
public static int dayOfYear(int month, int day, int year)

{ /** implementation not required by the AP */
int[] cumlativeMonths = {0, 31, 59, 90,120,151,181,212,243,273,304,334};
   if(month == 1){
       return day;
     }

    else if (month == 2)
     {

      return cumlativeMonths[month-1] +day;
    }
    else{
        if(isLeapYear(year)){
            return cumlativeMonths[month-1] +day +1;
        }
    else{
        return cumlativeMonths[month-1] +day;
     }
   }
}
/** Part (b)
* Returns the value representing the day of the week for the given date
* (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
* and 6 denotes Saturday.
* Precondition: The date represented by month, day, year is a valid date.
*/
public static int dayOfWeek(int month, int day, int year){
     int firstDayOfYr = firstDayOfYear(year);
     int dayOfYr = dayOfYear(month, day, year);
     return(firstDayOfYr + dayOfYr-1)%7;
    }
}