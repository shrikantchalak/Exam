package FileReade_Write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f = new FileWriter("D:\\CDAC22\\AAA\\FileRead.txt");

			try {
				f.write("Hello");
			} finally {
				f.close();
			}
			System.out.println("Succesfull");

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
