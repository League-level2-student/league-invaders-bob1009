import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel gamepanel=new GamePanel();
	JFrame frame=new JFrame();
	public static final int width=500;
	public static final int height=800;
public static void main(String[] args) {
	LeagueInvaders invader=new LeagueInvaders();
	invader.setup();
	
}
void invader(){
	
}
void setup() {
	frame.add(gamepanel);
	frame.setVisible(true);
	frame.setSize(width,height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(gamepanel);
}
}
