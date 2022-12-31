package FileReade_Write;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fr = new File("D:\\CDAC22\\fileDemo1.txt");

		try {
			if (fr.createNewFile())
				System.out.println("Successfuly created");
			else {
				System.out.println("Not Crated ");
			}
		} catch (IOException i) {
			System.out.println("Exeption handle");

		}

	}

}
