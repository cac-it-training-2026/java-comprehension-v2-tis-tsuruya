package q02_advanced.question01;

import java.util.List;

public class Member {
	//フィールドの定義
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	//各フィールドのgetter,setter メソッド
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * 引数なしのコンストラクタ
	 */
	public Member() {
	}

	/**
	 * 引数ありのコンストラクタ
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 * @param coupons
	 */
	public Member(int id, String password, String name, int age, int rank, List<Coupon> coupons) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = coupons;

		//2 つの Coupon クラスオブジェクトを生成し、コンストラクタを使用して、id、discountRate、description フィールドに
		//値を代入
		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");

		//各生成オブジェクトを List 型の coupons フィールドに追加
		this.coupons.add(coupon1);
		this.coupons.add(coupon2);
	}

	//toString メソッドをオーバーライド
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	//showMember メソッドを定義
	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

}
