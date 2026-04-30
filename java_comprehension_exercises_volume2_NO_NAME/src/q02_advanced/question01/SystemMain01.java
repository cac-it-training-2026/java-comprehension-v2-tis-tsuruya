package q02_advanced.question01;

import java.util.ArrayList;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2, new ArrayList<>());
		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1, new ArrayList<>());

		member1.showMember();
		member2.showMember();

	}

}
