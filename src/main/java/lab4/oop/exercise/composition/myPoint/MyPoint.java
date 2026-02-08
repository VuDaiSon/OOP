package lab4.oop.exercise.composition.myPoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;
    public MyPoint(){}
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int[] getXY(){
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another){
        double distance = Math.sqrt(Math.pow((another.x - this.x),2) + Math.pow((another.y-this.y),2));
        return distance;
    }
    public double distance(){
        double distance = Math.sqrt(this.x * this.x + this.y * this.y);
        return distance;
    }
}
