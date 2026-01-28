package homework3.method;

/**
 * Utilities for Date Manipulation
 */
public class DateUtility {

    // Month’s name – for printing
    public static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    // Number of days in each month (for non-leap years)
    public static int[] daysInMonths = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Returns true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    // Return true if the given year, month, day is a valid date
    // year: 1-9999
    // month: 1 (Jan) - 12 (Dec)
    // day: 1 - 28|29|30|31 depending on year and month
    public static boolean isValidDate(int year, int month, int day) {
        int maxDay = daysInMonths[month - 1];
        if (!(0 < year && year < 10000 && 0 < month && month < 13 && 0 < day)) {
            return true;
        }  if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day <=maxDay;
    }

    // Return the day of the week, 0: Sun, 1: Mon, ..., 6: Sat
    public static int getDayOfWeek(int year, int month, int day) {
        // TODO
        int century = year / 100;
        int centuryCode = (6 - (century % 4) * 2) % 7;
        int y = year % 100;
        int yDiv4 = y/4;
        int[]  monthCodesNonLeap = {0,3,3,6,1,4,6,2,5,0,3,5};
        int[] monthCodesLeap = {6,2,3,6,1,4,6,2,5,0,3,5};
        int monthCode;
        if(isLeapYear(year)){
            monthCode = monthCodesLeap[month-1];
        }
        else{
            monthCode = monthCodesNonLeap[month-1];
        }
        int sum = centuryCode + y + yDiv4 + monthCode + day;
        return sum % 7;
    }

    // Return String "xxxday d mmm yyyy"
    // e.g. "Tuesday 14 Feb 2012"
    public static String toString(int year, int month, int day) {
        String[] strDays = {
                "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"
        };

        return strDays[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month-1] + " " + year;
    }

    // Test Driver
    public static void main(String[] args) {

        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2011)); // false
        System.out.println(isLeapYear(2012)); // true

        System.out.println(isValidDate(2012, 2, 29)); // true
        System.out.println(isValidDate(2011, 2, 29)); // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false

        System.out.println(getDayOfWeek(1982, 4, 24)); // 6 : Sat
        System.out.println(getDayOfWeek(2000, 1, 1));  // 6 : Sat
        System.out.println(getDayOfWeek(2054, 6, 19)); // 5 : Fri
        System.out.println(getDayOfWeek(2012, 2, 17)); // 5 : Fri

        System.out.println(toString(2012, 2, 14)); // Tuesday 14 Feb 2012
    }
}
