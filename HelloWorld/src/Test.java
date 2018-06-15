public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//①
		Person taro=new Person();
		//taro(変数)に=newで代入

			taro.name="太郎";
			taro.age=18;
			taro.address="東京";
		//taro.（ﾀﾛｰﾄﾞｯﾄ）で上のtaroの機能を呼ぶ


			System.out.println(taro.name);
			System.out.println(taro.age);
			System.out.println(taro.address);
			taro.walk();
			taro.run();

		//②
		Person jiro =new Person("次郎",20);
			System.out.println(jiro.name);
			System.out.println(jiro.age);

		//③
		Person saburo = new Person("三郎");
			System.out.println(saburo.name);
			System.out.println(saburo.age);
	}
}




