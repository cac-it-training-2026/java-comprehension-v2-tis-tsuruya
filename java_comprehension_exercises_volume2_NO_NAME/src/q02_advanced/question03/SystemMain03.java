package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader consolereader = new ConsoleReader();

		Member loginuser = null;

		while (!isLogin) {
			try {
				//id入力
				System.out.print("input id>>");
				int id = consolereader.inputNumber();

				//password入力
				System.out.print("input password>>");
				String password = consolereader.inputString();

				//ログインの処理
				loginuser = loginService.doLogin(id, password);

				if (loginuser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力\n"
							+ "してください。");
					continue;
				} else {
					System.out.println("ログインに成功しました");
					//isLoginをtrueにしてループ終了
					isLogin = true;
					break;

				}
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
				continue;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//ログイン成功時
		System.out.println("ログインユーザ情報を表示します。");
		loginuser.showMember();

	}

}
