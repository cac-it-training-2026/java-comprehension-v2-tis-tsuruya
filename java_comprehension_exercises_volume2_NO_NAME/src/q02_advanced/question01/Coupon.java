package q02_advanced.question01;

public class Coupon {
	//フィールドの定義
	private int id;
	private double discountRate;
	private String description;

	//各フィールドのgetter,setterメソッドを定義
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
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 引数なしのコンストラクタ
	 */
	public Coupon() {
	}

	/**
	 * 引数ありのコンストラクタ
	 * @param id
	 * @param discountRate
	 * @param description
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	//toString メソッドのオーバーライド
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

}
