package lab5.oop.exercise.ball.and.player;

public class Player {
    int number;
    float x;
    float y;
    float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp, float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public void jump(float zDisp){
        this.z += zDisp;
    }
    public boolean near(Ball ball){
        double distance = Math.sqrt(Math.pow((this.x-ball.getX()),2) + Math.pow((this.y- ball.getY()),2) + Math.pow((this.z- ball.getZ()),2));
        return distance < 8;
    }
    public void kick(Ball ball){
        ball.setXYZ(ball.getX() + 10, ball.getY() +10, 0);
    }
    @Override
    public String toString() {
        return "Player " + number +
                " at (" + x + "," + y + "," + z + ")";
    }

}
