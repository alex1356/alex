package fighting;

import javax.swing.JOptionPane;

public class fighting {

	public static void main(String[] args) {
		int health, maxhealth, monsterhealth, buff, attack, damage, heal, monster, stun;
		String name;
		name = JOptionPane.showInputDialog("what is your name young one?");
		JOptionPane.showMessageDialog(null, "well then " + name);
		JOptionPane.showMessageDialog(null, "You are a child on a advanture ");
		maxhealth = (int) (Math.random() * 71);
		attack = (int) (Math.random() * 50);
		maxhealth = maxhealth + 100;
		String[] yourlist = { "yes", "no" };
		JOptionPane.showMessageDialog(null, "You encounter a golden apple that shines brighter than the sun ");
		int userchoice = (int) JOptionPane.showOptionDialog(null, "Do you take the magic apple?", "choice",
				JOptionPane.WARNING_MESSAGE, 0, null, yourlist, yourlist[0]);

		if (userchoice == 1) {
			JOptionPane.showMessageDialog(null, "you get no buff");
			JOptionPane.showMessageDialog(null,
					"your stats are now " + maxhealth + " for health " + attack + " for your attack ");

		}
		if (userchoice == 0) {
			buff = (int) (Math.random() * 50);
			JOptionPane.showMessageDialog(null, "good you attack went up by " + buff);
			attack = attack + buff;
			JOptionPane.showMessageDialog(null,
					"your stats are now " + maxhealth + " for health " + attack + " for your attack ");

		}

		do {
			JOptionPane.showMessageDialog(null, "now lets begin your advanture");
			JOptionPane.showMessageDialog(null, "You are walking down a road when a monster attacks you");
			health = maxhealth;
			monsterhealth = (int) (Math.random() * 50);
			monsterhealth = monsterhealth + 200;
			JOptionPane.showMessageDialog(null, "he has " + monsterhealth + " hp");
			String[] list = { "run", "fight" };
			int user = (int) JOptionPane.showOptionDialog(null, "what do you do?", "choice",
					JOptionPane.WARNING_MESSAGE, 0, null, list, list[0]);
			if (user == 1) {
				JOptionPane.showMessageDialog(null, "good luck");
				do {
					String[] fight = { "fire", "water", "earth", "lighting" };
					int element = (int) JOptionPane.showOptionDialog(null, "what do you do?", "choice",
							JOptionPane.WARNING_MESSAGE, 0, null, fight, fight[0]);
					if (element == 0) {
						damage = attack / 4;
						JOptionPane.showMessageDialog(null, "you did " + damage);
						monsterhealth = monsterhealth - damage;
						JOptionPane.showMessageDialog(null, "the monster now has " + monsterhealth + " hp ");
						monster = (int) (Math.random() * 20);
						health = health - monster;
						JOptionPane.showMessageDialog(null, "the monster attacks and does " + monster + " damage");
						JOptionPane.showMessageDialog(null, "you now have " + health + " hp");
					}
					if (element == 1) {
						damage = attack / 2;
						JOptionPane.showMessageDialog(null, "you did " + damage);
						monsterhealth = monsterhealth - damage;
						JOptionPane.showMessageDialog(null, "the monster now has " + monsterhealth + " hp ");
						monster = (int) (Math.random() * 20);
						health = health - monster;
						JOptionPane.showMessageDialog(null, "the monster attacks and does " + monster + " damage");
						JOptionPane.showMessageDialog(null, "you now have " + health + " hp");
					}
					if (element == 2) {
						damage = attack / 10;
						heal = damage * 4;
						JOptionPane.showMessageDialog(null, "you did " + damage + " and you heal for " + heal);
						health = health + heal;
						monsterhealth = monsterhealth - damage;

						JOptionPane.showMessageDialog(null, "the monster now has " + monsterhealth + " hp ");
						monster = (int) (Math.random() * 20);
						health = health - monster;
						JOptionPane.showMessageDialog(null, "the monster attacks and does " + monster + " damage");
						JOptionPane.showMessageDialog(null, "you now have " + health + " hp");
						if (health > maxhealth) {
							health = maxhealth;
						}
					}
					if (element == 3) {
						damage = attack / 2;
						stun = (int) (Math.random() * 2);

						if (stun == 0) {
							JOptionPane.showMessageDialog(null, "you did " + damage + " and did not stun");
							monsterhealth = monsterhealth - damage;
							JOptionPane.showMessageDialog(null, "the monster now has " + monsterhealth + " hp ");
							monster = (int) (Math.random() * 20);
							health = health - monster;
							JOptionPane.showMessageDialog(null, "the monster attacks and does " + monster + " damage");
							JOptionPane.showMessageDialog(null, "you now have " + health + " hp");
						}
						if (stun == 1) {
							JOptionPane.showMessageDialog(null, "you did " + damage + " and you stuned the enemy");
							monsterhealth = monsterhealth - damage;
							JOptionPane.showMessageDialog(null, "the monster now has " + monsterhealth + " hp ");
							JOptionPane.showMessageDialog(null, "the monster did not attack");

						}
					}

				} while (monsterhealth > 0 && health > 0);

				if (user == 0) {
					JOptionPane.showMessageDialog(null, "sorry no room for people that run");
					JOptionPane.showMessageDialog(null, "GAME OVER");
					monsterhealth = monsterhealth - monsterhealth;

				}

			}
			if (user == 0) {
				JOptionPane.showMessageDialog(null, "sorry no room for people that run");
				JOptionPane.showMessageDialog(null, "GAME OVER");
				monsterhealth = monsterhealth - monsterhealth;
			}

		} while (monsterhealth > 0 && health > 0);
		JOptionPane.showMessageDialog(null, "See you later hope you come and play again");
	}

}