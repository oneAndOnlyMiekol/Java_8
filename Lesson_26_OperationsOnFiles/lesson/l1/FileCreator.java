package l1;

import java.io.File;
import java.io.IOException;

public class FileCreator {
	public static void main(String[] args) {
		String fileName = "testFile.txt";
		File file = new File(fileName);
		
		boolean fileExists = file.exists();
		if(!fileExists) {
			try {
				fileExists = file.createNewFile();
			} catch (IOException e) {
				System.out.println("Nie uda�o si� utworzy� pliku");
			}
		}
		
		if(fileExists)
			System.out.println("Plik " + fileName + " istnieje lub zosta� utworzony");
	}

}
