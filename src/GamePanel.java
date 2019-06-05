import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener,KeyListener{

final int MENU = 0;
final int GAME = 1;
final int END = 2;
int currentState = MENU;
Rocketship ship=new Rocketship(250,700,50,50);
Timer frameDraw;
Font titleFont;
Font extratext;
Font extratext2;
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
		GamePanel meme=new GamePanel();
	}
	void updateMenuState() {  }
	
	void updateGameState() {  }
	
	void updateEndState()  {  }
	
	void drawMenuState(Graphics g) { g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("League Invaders", 40, 50);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("press enter to start", 50, 150);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("press space for rules", 50, 250);}
	
	void drawGameState(Graphics g) { g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT); 
	ship.draw(g);
	}
	
	void drawEndState(Graphics g)  { g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	GamePanel(){
		titleFont = new Font("Arial", Font.PLAIN, 48);
	extratext = new Font("Arial", Font.PLAIN,30);
	extratext2 = new Font("Arial", Font.PLAIN,20);
	 frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		repaint();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState > END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}   
		if (e.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("UP");
		    ship.up();
		}if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		    ship.down();
		}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    ship.left();}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	    ship.right();}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
