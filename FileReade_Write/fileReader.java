package FileReade_Write;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("D:\\CDAC22\\AAA\\FileRead.txt");

			try {
				int i;

				while ((i = f.read()) != -1) {
					System.out.print((char) i);
				}
			} finally {
				f.close();
			}

		} catch (IOException e) {
			System.out.println("Handled........");
		}
	}

}
