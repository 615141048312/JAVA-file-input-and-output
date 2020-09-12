package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput02 {
	public static void main(String[] args) {
		try {
			File file = new File("newfile.txt");
			
			if (checkBeforeReadfile(file)) {
				FileReader filereader = new FileReader(file);
			
				int ch;
				while((ch = filereader.read()) != -1) {
				System.out.print((char)ch);
				}
			
				filereader.close();
			} else {
				System.out.println("ファイルが見つからないか開ません");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	private static boolean checkBeforeReadfile(File file) {
		if (file.exists()) {
			if (file.isFile() && file.canRead()) {
				return true;
			}
		}
		
		return false;
	}
}
