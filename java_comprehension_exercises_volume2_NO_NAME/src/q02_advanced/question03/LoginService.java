package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		//引数で受け取ったMemberStorageオブジェクトをフィールドに代入
		this.memberStorage = memberStorage;
	}

	//ログイン処理
	public Member doLogin(int id, String password) {
		//MemberStorageから会員リストを取得
		//拡張for文で1件ずつ取り出し
		for (Member member : memberStorage.getMembers()) {
			//入力されたidとpasswordが会員情報と一致するか確認
			//idは==で比較
			//passwordはequals()で文字列比較
			if (member.getId() == id && member.getPassword().equals(password)) {

				//一致した場合にmemberオブジェクトを返す
				return member;
			}
		} //一致しなかった場合nulを返す
		return null;
	}
}
