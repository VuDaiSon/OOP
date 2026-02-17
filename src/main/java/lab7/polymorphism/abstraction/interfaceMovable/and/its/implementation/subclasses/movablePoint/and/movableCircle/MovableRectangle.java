package lab7.polymorphism.abstraction.interfaceMovable.and.its.implementation.subclasses.movablePoint.and.movableCircle;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle: " +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight;
    }

    @Override
    public void moveUp() {
topLeft.y -= topLeft.ySpeed;
    bottomRight.y -= bottomRight.ySpeed;
    }
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
