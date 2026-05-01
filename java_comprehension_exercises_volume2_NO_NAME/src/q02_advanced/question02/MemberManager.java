package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		// 拡張for文でListの中身を1つずつ取り出す
		for (Member member : members) {
			// 各MemberオブジェクトのshowMemberメソッドを呼び出して表示
			member.showMember();
		}

	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		// 該当する会員が見つかったかどうかを判定するフラグ
		boolean flag = false;
		// Listの中から1件ずつMemberオブジェクトを取り出す
		for (Member member : members) {
			// Memberのidと引数のtargetIdが一致するか確認
			if (member.getId() == targetId) {
				// 一致した場合、パスワードを新しいものに更新
				member.setPassword(newPassword);
				// 見つかったのでフラグをtrueにする
				flag = true;
				// ループを抜ける
				break;
			}
		}
		// ループ終了後、該当者が見つからなかった場合
		if (!flag) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
