package lab6.inheritance.composition.vs.inheritance.point.and.line.classes;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line: (" +
                "begin=" + begin +
                ", end=" + end +
                ')';
    }
    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getEndX() {
        return begin.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }
    public int getLength(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();

        if (xDiff == 0) {
            throw new ArithmeticException("Gradient is undefined (vertical line)");
        }
        return  Math.atan2(yDiff, xDiff);
    }
}
