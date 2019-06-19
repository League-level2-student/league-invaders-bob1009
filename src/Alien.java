import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Alien extends GameObject {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	

Alien(int X, int Y, int WIDTH, int HEIGHT){
	super(X,Y,WIDTH,HEIGHT);
	this.speed=1;
	if (needImage) {
	    loadImage ("rocket.png");
	}
}
void update() {
	y+=speed;
}
void draw(Graphics g) {
	if (gotImage) {
		g.drawImage(image, x, y, width, height, null);
	} else {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
	}

void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream("Alien.png"));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
}
