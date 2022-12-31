package FileReade_Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileBufferWriter {

	public static void main(String[] args) {

		try {
			BufferedWriter r = new BufferedWriter(new FileWriter("D:\\CDAC22\\AAA\\File2.txt"));
			try {

				String string = "Hellooooooooooo";
				r.write(string);
				System.out.println("Successfully");
			} finally {
				r.close();
				System.out.println("Closed");
			}
		} catch (IOException e) {
			System.out.println("Handled");
		}

	}

}
