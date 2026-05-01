package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		//文字入力を受け取るために呼び出し
		ConsoleReader consolereader = new ConsoleReader();

		//Memberオブジェクト生成
		//
		Member member1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		//作成されたmember(会員)をmembersリストで管理
		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);

		System.out.println("===会員情報を表示します===");
		//MemberManagerクラスのshowAllMembersメソッドを呼び出し、
		//？リストを引数？にして全員表示
		MemberManager.showAllMembers(members);

		//パスワード変更処理
		try {
			System.out.println("===パスワードを変更します===");
			//どの会員を変更するかidを入力
			System.out.print("input target id>>");
			//ConReaクラスで読み取った値をidに代入
			int id = consolereader.inputNumber();

			//パスワードをなにに変更するか入力
			System.out.print("input new password>>");
			//ConReaクラスで読み取った値をnewPasswordに代入
			String newPassword = consolereader.inputString();

			//updatePasswordメソッドを呼び出し、idが一致した場合
			//新しくパスワードに変更
			MemberManager.updatePassword(members, id, newPassword);

			//例外処理
		} catch (IOException | NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		//変更後会員情報を表示
		MemberManager.showAllMembers(members);

	}

}
