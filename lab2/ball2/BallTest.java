package ru.mirea.lab2.ball2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball = new Ball(15.5,2.1);
        System.out.println(ball);
        ball.move(-1, 2);
        System.out.println(ball);
        ball.setX(4.2);
        ball.setY(-4.2);
        System.out.println(ball);
        ball.setXY(1, -1);
        System.out.println(ball);
        System.out.println(ball.getX() + " " + ball.getY());
    }
}
