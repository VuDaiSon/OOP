package lab7.polymorphism.abstraction.movableInterface.and.its.implementation.movablePointClass.and.movableCircle;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return center.toString() + ",radius=" + radius;
    }
@Override
    public void moveUp() {
        center.moveUp();
    }
@Override
    public void moveDown() {
        center.moveDown();
    }
@Override
    public void moveLeft() {
        center.moveLeft();
    }
@Override
    public void moveRight() {
        center.moveRight();
    }
}
