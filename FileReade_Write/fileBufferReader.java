package FileReade_Write;

import java.io.*;

public class fileBufferReader {

	public static void main(String[] args) {

		try {
			BufferedReader f = new BufferedReader(new FileReader("D:\\CDAC22\\AAA\\File2.txt"));

			String string;
			while ((string = f.readLine()) != null) {
				System.out.println(string);
			}
		} catch (IOException e) {
			System.out.println("Handled");
		}
	}

}
