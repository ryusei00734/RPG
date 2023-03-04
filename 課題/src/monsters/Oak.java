package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		super(name, weapon);
		int dice = Dice.get(170, 230);
		int oakHp = dice;
		setHp(oakHp);
		int dice2 = Dice.get(9,15);
		int oakOf = dice2;
		setOffensive(oakOf);
	}

}
