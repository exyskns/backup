/**
 *
 */
package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusuke
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String t= br_readLine();
		System.out.println(t);
	}

}
