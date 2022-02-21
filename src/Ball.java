import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Timer;
import java.util.TimerTask;

public class Ball implements GameConstants {

    private int inAction;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int radius;
    private int dRadius;
    private Color color;
    private static int count;
    public final int id = count++;
    private static int score;
    private Timer gameTimer;
    private TimerTask gameTimerTask;


    Ball(int x, int y, int dx, int dy, int radius, Color color, int inAction, int dRadius) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
        this.color = color;
        this.inAction = inAction;
        this.dRadius = dRadius;
        gameTimer = new Timer();
    }

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x - radius, y - radius, radius * 2, radius * 2);
    }
}

