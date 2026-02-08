package lab4.oop.exercise.composition.myLine.and.myPoint;

import lab4.oop.exercise.composition.myPoint.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine linear1 = new MyLine(5,1,7,9);
        MyPoint begin = new MyPoint(6,2);
        MyPoint end = new MyPoint(3,8);
        MyLine linear2 = new MyLine(begin, end);

        System.out.println("the beginning point of linear 1: " + linear1.getBegin());
        System.out.println("the ending point of linear 1: " + linear1.getEnd());
        System.out.println("get begin x of linear 1: " +  linear1.getBeginX());
        System.out.println("get begin xy of linear 1: " + linear2.getBeginXY()[0]);
        System.out.println("length of linear 1: " + linear1.getLength());
        System.out.println("Gradient of linear 1: " + linear1.getGradient());
    }
}
