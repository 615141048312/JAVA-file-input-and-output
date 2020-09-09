package file06;

import java.io.File;

public class File06_2 {
	public static void main(String[] args) {
		File file = new File("/Users/yui/Desktop/newDirectory/file.txt");
		
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("ファイルを削除しました");
			} else {
				System.out.println("ファイルの削除に失敗しました");
			}
		} else {
			System.out.println("ファイルが見つかりません");
		}
	}
}
