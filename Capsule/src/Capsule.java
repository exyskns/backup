/**
 *
 */

/**
 * @author testuser
 *
 */
public class Capsule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person hito = new Person("太郎",20);
		System.out.println(hito.getName());

		hito.setName("花子");
		System.out.println(hito.getName());

		System.out.println(hito.getAge());

		hito.setAge(30);
		System.out.println(hito.getAge());
	}
}
