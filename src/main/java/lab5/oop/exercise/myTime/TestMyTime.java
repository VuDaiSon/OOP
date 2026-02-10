package lab5.oop.exercise.myTime;

public class TestMyTime {
    public static void main(String[] args) {

        MyTime t1 = new MyTime(23, 59, 59);
        System.out.println("t1 initial: " + t1);

        System.out.println("t1 nextSecond: " + t1.nextSecond());
        System.out.println("t1 after nextSecond: " + t1);

        MyTime t2 = new MyTime(0, 0, 0);
        System.out.println("\nt2 initial: " + t2);

        System.out.println("t2 previousSecond: " +t2.previousSecond() );
        System.out.println("t2 after previousSecond: " + t2);

        MyTime t3 = new MyTime(10, 59, 30);
        System.out.println("\nt3 initial: " + t3);

        System.out.println("t3 nextMinute: " + t3.nextMinute());
        System.out.println("t3 after nextMinute: " + t3);

        MyTime t4 = new MyTime(23, 10, 10);
        System.out.println("\nt4 initial: " + t4);

        System.out.println("t4 nextHour: " + t4.nextHour());
        System.out.println("t4 after nextHour: " + t4);

        MyTime t5 = new MyTime(0, 0, 30);
        System.out.println("\nt5 initial: " + t5);

        System.out.println("t5 previousMinute: " + t5.previousMinute());
        System.out.println("t5 after previousMinute: " + t5);

        MyTime t6 = new MyTime(0, 10, 10);
        System.out.println("\nt6 initial: " + t6);

        System.out.println("t6 previousHour: " + t6.previousHour());
        System.out.println("t6 after previousHour: " + t6);

        System.out.println("\nTest setters:");

        System.out.println("t1 before setters: " + t1);

        t1.setHour(15);
        System.out.println("setHour(15): " + t1);
        System.out.println("after setHour: " + t1);

        t1.setMinute(45);
        System.out.println("setMinute(45): " + t1);
        System.out.println("after setMinute: " + t1);

        t1.setSecond(30);
        System.out.println("setSecond(30): " + t1);
        System.out.println("after setSecond: " + t1);

        System.out.println("\nTest invalid time (expect exception):");

        try {
            t1.setTime(25, 10, 10);
            System.out.println("ERROR: exception not thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
