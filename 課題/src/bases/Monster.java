package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int dice = Dice.get(1, 10);
		int damage = dice * getOffensive();
		
		// 相手のHPをダメージ値だけ減らす
		int newHp = target.getHp()-damage;
		target.setHp(newHp);
		// コンソールにステータスを表示
		System.out.println("「" + this.name + "」" + "が「" + this.weapon + "」で攻撃！「" + target.name  + "」に" + damage + "のダメージを与えた。");
	}
}