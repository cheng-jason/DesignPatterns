
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;

import com.jason.designPatterns.decorator.LowerCaseInputStream;

public class InputTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			int c;
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream("test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();
			StringBufferInputStream sbin = new StringBufferInputStream("a2b3");
			while ((c = sbin.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
