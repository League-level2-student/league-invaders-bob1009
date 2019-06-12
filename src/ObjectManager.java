import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
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
	creature.add(new Alien(ran.nextInt(LeagueInvaders.WIDTH),0,50,50));
}
void update() {
	for (int i = 0; i < creature.size(); i++) {
		Alien j = creature.get(i);
		if (j.y>LeagueInvaders.HEIGHT) {
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
}
