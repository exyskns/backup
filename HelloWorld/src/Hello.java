import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		//throwsはエラー対策

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String t=br.readLine();//入力待ち
		System.out.println(t);
	}

}
