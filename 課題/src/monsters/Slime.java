package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon) {
		super(name, weapon);
		int dice = Dice.get(70, 130);
		int slimeHp = dice;
		setHp(slimeHp);
		int dice2 = Dice.get(5,11);
		int slimeOf = dice2;
		setOffensive(slimeOf);
	}

}
