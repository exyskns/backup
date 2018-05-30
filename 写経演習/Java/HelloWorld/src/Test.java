
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro=new Person();
		//taro(変数)に=newで代入

			taro.name="太郎";
			taro.age=20;
			taro.address="東京";
		//taro.（ﾀﾛｰﾄﾞｯﾄ）で上のtaroの機能を呼ぶ

			System.out.println(taro.name);
			System.out.println(taro.age);
			System.out.println(taro.address);
			taro.talk();
	}

}
