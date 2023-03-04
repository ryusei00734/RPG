package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	public Wizard(String name, String weapon) {
		super(name, weapon);
		
		//5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		int dice = Dice.get(120, 180);
		int wizardHp = dice;
		setHp(wizardHp);
		//6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		int dice2 = Dice.get(12,18);
		int wizardOf = dice2;
		setOffensive(wizardOf);
	}

}
