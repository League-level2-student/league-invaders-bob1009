import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
Rocketship rocket;
ArrayList<projctile> lasers = new ArrayList<projctile>();
ArrayList<Alien> creature = new ArrayList<Alien>();
Random ran=new Random();

ObjectManager(Rocketship rocket){
	this.rocket=rocket;
}
void addProjectile(projctile laser) {
	lasers.add(laser);
}
void addAlien() {
	creature.add(new Alien(ran.nextInt(LeagueInvaders.width),0,50,50));
}
void update() {
	for (int i = 0; i < creature.size(); i++) {
		Alien j = creature.get(i);
		if (j.y>LeagueInvaders.height) {
			j.isactive=false;
		}
	}
}
void draw(Graphics g) {
rocket.draw(g);
for (int i = 0; i <creature.size(); i++) {
	Alien j=creature.get(i);
	j.draw(g);
}
for (int i = 0; i < lasers.size(); i++) {
	projctile r=lasers.get(i);
	r.draw(g);
}
}
void purgeObject(){
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	addAlien();
}

}
