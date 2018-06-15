
public class Person {

	//インスタンス化
	public String name =null;
	//文字列が入る"箱"フィールド変数
	public int age =0;
	//整数が入る"箱"=フィールド変数

	public String phoneNumber =null;
	public String address =null;

	public void walk(){
	System.out.println(this.name + "が歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}


	//２.コンストラクタ（窓口）

	//①
	public Person(){}
	/*デフォルトコンストラクタ
	 *デフォルトコンストラクタは記述しないでも起動する
	 */



	//②
	public Person(String name,int age){
		this.name =name;
		this.age =age;
	}

	//③
	public Person(String name){
		this.name =name;
		this.age =0;
	}

}

