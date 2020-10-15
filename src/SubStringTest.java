import java.io.ObjectInputStream.GetField;
import java.math.BigInteger;

public class SubStringTest {

	public static void main(String[] args) {
		String url = "/member/mem_serch.do";
		String rootPath = "";
		String controller = url.substring(rootPath.length() + 1, url.lastIndexOf('/'));
		
		System.out.println(controller);

	}
}
