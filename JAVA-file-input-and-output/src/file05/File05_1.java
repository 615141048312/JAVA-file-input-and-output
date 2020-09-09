package file05;

import java.io.File;

public class File05_1 {
	public static void main(String[] args) {
		File newfile = new File("/Users/yui/Desktop/newDirectory");
		
		if (newfile.mkdir()) {
			System.out.println("ディレクトリの作成に成功しました");
		} else {
			System.out.println("ディレクトリの作成に失敗しました");
		}
	}
}
