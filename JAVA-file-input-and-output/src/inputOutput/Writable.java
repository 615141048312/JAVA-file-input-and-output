package inputOutput;

import java.io.File;

public class Writable {
	public static void main(String[] args) {
		File file = new File("/Users/yui/Desktop/newDirectory/file.txt");
		
		checkPermission(file);
		
		if (file.setWritable(true)) {
			System.out.println("ファイルの書き込みを許可しました");
		} else {
			System.out.println("書き込み許可に失敗しました");
		}
		
		checkPermission(file);
	}
	
	private static void checkPermission(File file){
		if (file.canRead()){
	      System.out.println("ファイルは読み込み可能です");
	    }

	    if (file.canWrite()){
	      System.out.println("ファイルは書き込み可能です");
	    }
	}
}
