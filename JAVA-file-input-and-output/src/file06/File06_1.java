package file06;

import java.io.File;

public class File06_1 {
	public static void main(String[] args) {
		File file = new File("/Users/yui/Desktop/newDirectory/file.txt");

		if (file.exists()) {
			System.out.println("ファイルは存在します");
		} else {
			System.out.println("ファイルは存在しません");
		}
	}
}
