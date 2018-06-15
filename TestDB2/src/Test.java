
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	TestUserDAO dao = new TestUserDAO();
	dao.select("hanako","789");
	dao.selectA11();
	dao.selectByName("taro");
	dao.selectByPassword("123");
	dao.updateUseraNameByUserName("taro","saburo");
	dao.insert(4,"shiro","012");
	dao.delete("shiro");
	}

}
