package control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Company;

public class FileManager {
	
	public static final String FILENAME="Company.obj";
	
	public FileManager() {}
	
	public void saveFile(Company company) {
		try( FileOutputStream fileOutput = new FileOutputStream(FILENAME);
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);){
			objectOutput.writeObject(company);
		}catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Saving file is impossible!");
		}
	}
	
	public Company loadFile() {
		Company company=null;
		try( FileInputStream fileInput = new FileInputStream(FILENAME);
				ObjectInputStream objectInput = new ObjectInputStream(fileInput);){
			company = (Company) objectInput.readObject();
			
		}catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}catch (IOException e) {
			System.out.println("Loading file is impossible!");
		} catch (ClassNotFoundException e) {
			System.out.println("Object in file has different Class!");
		}
		
		return company;
	}
	

}
