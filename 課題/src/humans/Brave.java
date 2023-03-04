package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		super(name, weapon);
		
		//5. コンストラクタの中で、ヒットポイントの値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		int dice = Dice.get(170, 230);
		int braveHp = dice;
		setHp(braveHp);
		//6. コンストラクタの中で、攻撃力の値は乱数を振って決定します。（乱数の具体的は範囲は後述）
		int dice2 = Dice.get(7,13);
		int braveOf = dice2;
		setOffensive(braveOf);
	}

}
