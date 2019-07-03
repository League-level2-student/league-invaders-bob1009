import java.awt.Rectangle;

public class GameObject {
	Rectangle collisionbox;
	int x;
	int y;
	int width;
	int height;
	int speed=10;
	boolean isactive=true;
	 GameObject(int x,int y,int width,int height){
		this.x=x;
		this.height=height;
		this.width=width;
		this.y=y;
		 collisionbox = new Rectangle(x,y,width,height);
	 }
	 
	void update(){
        collisionbox.setBounds(x, y, width, height);
	}
}
