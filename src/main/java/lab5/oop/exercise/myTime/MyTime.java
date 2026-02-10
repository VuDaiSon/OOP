package lab5.oop.exercise.myTime;

public class MyTime {
    int hour = 0;
    int minute = 0;
    int second = 0;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    private boolean isValid(int hour, int minute, int second) {
        return hour >= 0 && hour <= 23
                && minute >= 0 && minute <= 59
                && second >= 0 && second <= 59;
    }

    public void setTime(int hour, int minute, int second) {
        if (!isValid(hour, minute, second)) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }


    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {

        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }

        return this;
    }

    public MyTime nextHour() {

        if (hour == 24) {
            hour = 0;
        }


        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 00) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {

        minute--;
        if (minute < 0) {
            minute = 59;
            hour--;
            if (hour < 00) {
                hour = 23;
            }

        }
        return this;
    }

    public MyTime previousHour() {

        hour--;
        if (hour < 00) {
            hour = 23;
        }


        return this;
    }
}
