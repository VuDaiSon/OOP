package lab5.oop.exercise.ball.and.player;

public class TestSoccerGame {
    public static void main(String[] args) {

        Ball ball = new Ball(50, 50, 0);

        Player a1 = new Player(7, 30, 40);
        Player a2 = new Player(10, 35, 45);
        Player b1 = new Player(9, 60, 40);
        Player b2 = new Player(11, 65, 45);


        System.out.println("\n===== INITIAL STATE =====" + ball);

        a1.move(20, 20);
        System.out.println("\n===== MOVE PLAYERS =====" + a1);

        a1.jump(10);
        System.out.println("\n===== JUMP PLAYER =====" + a1);

        System.out.println("\n===== CHECK NEAR BALL =====" + a1.near(ball)
        );

        a1.kick(ball);
        System.out.println("\n===== PLAYER KICK BALL =====" + ball);

        System.out.println("\n===== FINAL STATE =====" + ball);

    }
}
