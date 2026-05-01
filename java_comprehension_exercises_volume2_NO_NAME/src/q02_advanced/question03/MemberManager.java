package q02_advanced.question03;

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

		// Listの中から1件ずつMemberオブジェクトを取り出す
		for (Member member : members) {
			// Memberのidと引数のtargetIdが一致するか確認
			if (member.getId() == targetId) {
				// 一致した場合、パスワードを新しいものに更新
				member.setPassword(newPassword);
				// ループを抜ける
				break;
			}
		}

	}

}
