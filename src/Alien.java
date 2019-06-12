import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
Alien(int X, int Y, int WIDTH, int HEIGHT){
	super(X,Y,WIDTH,HEIGHT);
	this.speed=1;
}
void update() {
	y+=speed;
}
void draw(Graphics g) {
	 g.setColor(Color.YELLOW);
     g.fillRect(x, y, width, height);
}
}
