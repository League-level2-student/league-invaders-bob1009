import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	int score = 0;
	Rocketship rocket;
	ArrayList<projctile> lasers = new ArrayList<projctile>();
	ArrayList<Alien> creature = new ArrayList<Alien>();
	Random ran = new Random();

	ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}

	void addAlien() {
		creature.add(new Alien(ran.nextInt(LeagueInvaders.width), 0, 50, 50));
	}

	void update() {
		rocket.update();
		for (int i = 0; i < creature.size(); i++) {
			Alien j = creature.get(i);
			j.update();
			if (j.y > LeagueInvaders.height) {
				j.isactive = false;
				
			}

		}
		for (int i = 0; i < lasers.size(); i++) {
			projctile t = lasers.get(i);
			t.update();
			if (t.y > LeagueInvaders.height) {
				t.isactive = false;
			}
		}
		checkCollision();
		purgeObject();
	}

	void draw(Graphics g) {
		rocket.draw(g);
		for (int i = 0; i < creature.size(); i++) {
			Alien j = creature.get(i);
			j.draw(g);
		}
		for (int i = 0; i < lasers.size(); i++) {
			projctile r = lasers.get(i);
			r.draw(g);
		}
	}

	void purgeObject() {
		for (int i = 0; i < creature.size(); i++) {
			Alien singleAlien = creature.get(i);
			if (singleAlien.isactive == false) {
				creature.remove(singleAlien);
			}
		}
		for (int i = 0; i < lasers.size(); i++) {
			projctile onelaser = lasers.get(i);
			if (onelaser.isactive == false) {
				lasers.remove(onelaser);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
	}

	void addProjectile(projctile projectile) {
		lasers.add(projectile);

	}

	void checkCollision() {
		for (int i = 0; i < creature.size(); i++) {
			Alien c = creature.get(i);
			if (rocket.collisionbox.intersects(c.collisionbox)) {
				rocket.isactive = false;
				c.isactive = false;
				System.out.println(";afjsdfkjals;kfjalksdjf");
			}
			for (int j = 0; j < lasers.size(); j++) {
				projctile laser = lasers.get(j);
				if (c.collisionbox.intersects(laser.collisionbox)) {
					c.isactive = false;
					laser.isactive = false;
					System.out.println("hit");
					score=score+1;
				}
			}
		}
	}

	int getscore() {
		return score;
	}
}
