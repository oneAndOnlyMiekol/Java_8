package l2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
	public static void main(String[] args) {
		String fileName = "person.obj";
		Person p1 = new Person("Jan", "Kowalski");
		
		try(
				FileOutputStream fs = new FileOutputStream(fileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);
				) {
			os.writeObject(p1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Zapisano obiekt do pliku");
	}
}
