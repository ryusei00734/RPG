package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);

	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int dice = Dice.get(1, 10);
		int damage = dice * getOffensive();
		int newHp = target.getHp()-damage;
		target.setHp(newHp);

		// 自分の攻撃力を1だけ減らす,新しい攻撃力としてセット
		int newOf = getOffensive() - 1;
		this.setOffensive(newOf);
		// コンソールにステータスを表示
		System.out.println("「" + this.name + "」" + "が「" + this.weapon + "」で攻撃！「" + target.name  + "」に" + damage + "のダメージを与えた。しかし自分の攻撃力も1減少した。");
	}
}