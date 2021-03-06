import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	public static BufferedImage image;
	
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	boolean down=false;
	boolean up = false;
	boolean left=false;
	boolean right=false;
Rocketship(int x, int y, int height, int width){
	super(x,y,width,height);
	this.speed=10;
	if (needImage) {
	    loadImage ("rocket.png");
	}
}
void update() {
	super.update();
	if(up == true) {
		y-=speed;
	}
	if(down==true) {
		y+=speed;
	}
	if(left==true) {
		x-=speed;
	}
	if(right==true) {
		x+=speed;
	}
}

void draw(Graphics g) {
	if (gotImage) {
		g.drawImage(image, x, y, width, height, null);
	} else {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
public void up() {y-=speed;}
public void down() {y+=speed;}
public void left() {x-=speed;}
public void right() {x+=speed;}
void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream("Rocket.png"));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
public projctile getProjectile() {
    return new projctile(x+width/2, y, 10, 10);
} 
}
