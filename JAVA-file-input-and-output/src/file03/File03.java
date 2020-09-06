package file03;

import java.io.File;

public class File03 {
	public static void main(String[] args) {
		File file = new File("test.txt");
		String path = file.getAbsolutePath();

		System.out.println("File:" + path);
	}
}
