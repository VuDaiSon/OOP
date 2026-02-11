package lab5.oop.exercise.myDate;

public class MyDate {
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    // Number of days in each month (for non-leap years)
    public static int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (!(0 < year && year < 10000 && 0 < month && month < 13 && 0 < day)) {
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            maxDay = 29;
        }
        return day <= maxDay;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int century = year / 100;
        int centuryCode = (6 - (century % 4) * 2) % 7;
        int y = year % 100;
        int yDiv4 = y / 4;
        int[] monthCodesNonLeap = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] monthCodesLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int monthCode;
        if (isLeapYear(year)) {
            monthCode = monthCodesLeap[month - 1];
        } else {
            monthCode = monthCodesNonLeap[month - 1];
        }
        int sum = centuryCode + y + yDiv4 + monthCode + day;
        return sum % 7;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("invalid date");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (0 > year || year > 9999) {
            throw new IllegalArgumentException("invalid year");
        } else {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (0 > month || month > 12) {
            throw new IllegalArgumentException("invalid month");
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (isLeapYear(year) && month == 2) {
            maxDay = 29;
        }
        if (0 > day || day > maxDay) {
            throw new IllegalArgumentException("invalid day");
        } else {
            this.day = day;
        }
    }

    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate previousDay() {

        day--;
        if (day < 1) {
            month--;

            if (month < 1) {
                month = 12;
                year--;
            }
            int maxDay = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                maxDay = 29;
            }
            day = maxDay;
        }

        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (!isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        return this;
    }

    public MyDate nextDay() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        day++;
        if (day > maxDay) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;

            year++;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (!isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        return this;
    }
}
