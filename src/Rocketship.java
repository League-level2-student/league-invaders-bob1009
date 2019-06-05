import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
Rocketship(int x, int y, int height, int width){
	super(x,y,width,height);
	this.speed=10;
}
void draw(Graphics g) {
	 g.setColor(Color.BLUE);
     g.fillRect(X, Y, WIDTH, HEIGHT);
}
public void up() {Y-=speed;}
public void down() {Y+=speed;}
public void left() {X-=speed;}
public void right() {X+=speed;}
}
