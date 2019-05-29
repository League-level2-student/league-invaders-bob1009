import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel gamepanel=new GamePanel();
	JFrame frame=new JFrame();
	public static final int WIDTH=500;
	public static final int HEIGHT=800;
public static void main(String[] args) {
	LeagueInvaders invader=new LeagueInvaders();
	invader.setup();
	
}
void invader(){
	
}
void setup() {
	frame.add(gamepanel);
	frame.setVisible(true);
	frame.setSize(WIDTH,HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(panel);
}
}
