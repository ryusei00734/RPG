package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	public Dragon(String name, String weapon) {
		super(name, weapon);
		int dice = Dice.get(270, 330);
		int dragonHp = dice;
		setHp(dragonHp);
		int dice2 = Dice.get(12,18);
		int dragonOf = dice2;
		setOffensive(dragonOf);
	}

}
