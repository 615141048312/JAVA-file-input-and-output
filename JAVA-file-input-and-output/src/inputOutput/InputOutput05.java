package inputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput05 {
	public static void main(String args[]) {
		try {
			File file = new File("/Users/yui/Desktop/newDirectory/file.txt");
			
			if (checkBeforeWritefile(file)) {
				FileWriter filewriter = new FileWriter(file, true);
				
				filewriter.write("はい。元気です\n");
				filewriter.write("ではまた\n");
				
				filewriter.close();
			} else {
				System.out.println("ファイルに書き込めません");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private static boolean checkBeforeWritefile(File file) {
		if (file.exists()) {
			if (file.isFile() && file.canWrite()) {
				return true;
			}
		}
		
		return false;
	}
}
