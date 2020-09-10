package file07;

import java.io.File;
import java.io.IOException;

public class File07 {
	public static void main(String[] args) {
		File file = new File("/Users/yui/Desktop/newDirectory/file.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("ファイルの作成に成功しました");
			} else {
				System.out.println("ファイルの作成に失敗しました");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		
		checkPermission(file);
		
		if (file.setReadOnly()) {
			System.out.println("ファイルを読み取り専用にしました");
		} else {
			System.out.println("読み取り専用への変更が失敗しました");
		}
		
		checkPermission(file);
	}
	
	private static void checkPermission(File file) {
		if (file.canRead()) {
			System.out.println("ファイルは読み込み可能です");
		}
		
		if (file.canWrite()) {
			System.out.println("ファイルは書き込み可能です");
		}
	}
}
