package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 
 * @author selcuk
 *
 */

public class FileIO {
	/**
	 * Gets an object and and writes it to given file
	 * @param yetToBeWriten :
	 * 			 An object which to be writen into file.
	 * @param filePath :
	 * 			 File path to write object.
	 */
	public void write(Object yetToBeWriten,String filePath){

		ObjectOutputStream out = null;
		File wFile = new File(filePath);

		try {
			FileOutputStream fOut = new FileOutputStream(wFile);
			out = new ObjectOutputStream(fOut);

			out.writeObject(yetToBeWriten);

			fOut.close();
			out.close();

		} catch (Exception e) {
			// If program is here it means file is using
			e.printStackTrace();


		}

	}
	public Object read(String filePath){
		
		ObjectInputStream in = null;
		File rFile = new File(filePath);
		
		Object toReturn = null;
		
		try {
			FileInputStream fIn = new FileInputStream(rFile);
			in = new ObjectInputStream(fIn);
			toReturn = in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Search File or Create It
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return toReturn;
	}
}





















