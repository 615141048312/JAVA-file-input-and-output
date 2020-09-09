package file05;

import java.io.File;

public class File05_2 {
	public static void main(String[] args) {
		File newfile = new File("/Users/yui/Desktop/new1/new2");
		
		if (newfile.mkdirs()) {
			System.out.println("ディレクトリの作成に成功しました");
		} else {
			System.out.println("ディレクトリの作成に失敗しました");
		}
	}
}
