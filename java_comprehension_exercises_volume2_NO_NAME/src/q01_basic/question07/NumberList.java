package q01_basic.question07;//

import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 * 
 */
class NumberList {

	/**
	 * 整数のList
	 * 
	 */
	private List<Integer> numbers = new ArrayList<>();

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */
	public void addFromOneTo(Integer limit) {
		//TODO ここから実装する
		for (int i = 1; i <= limit; i++) {
			numbers.add(i);//addメソッドでリストに要素を追加
		}

	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */
	public Integer calcSumOfList() {
		Integer sum = 0;
		//TODO ここから実装する
		//i=0から引数までget(i)で値を取得しsumに加算
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}

		return sum;
	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	public void doubleListEachValue() {
		//TODO ここから実装する
		for (int i = 0; i < numbers.size(); i++) {
			//list.set(a,b)でa位置の要素をbに置き換え
			numbers.set(i, numbers.get(i) * 2);

		}
	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	public void removeIndexOfFirstHalf() {
		//TODO ここから実装する
		int halfsaize = (numbers.size() / 2);
		//リストの半分のサイズまで削除
		for (int i = 0; i < halfsaize; i++) {
			//０番目を消していくからインデックスが自動でずれる
			numbers.remove(0);
		}

	}

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}
