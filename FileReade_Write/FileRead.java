package FileReade_Write;

import java.io.File;

public class FileRead {

	public static void main(String[] args) {
		File f = new File("D:\\CDAC22\\AAA\\FileRead.txt");

		if (f.exists()) {
			System.out.println("File Name " + f.getName());
			System.out.println("Location " + f.getAbsolutePath());
			System.out.println("File Writable " + f.canWrite());
			System.out.println("File Redable " + f.canRead());
			System.out.println("File Size " + f.length());
			// System.out.println("File Delete "+ f.delete());
		}

		else {
			System.out.println("File Not Exists");

		}

	}

}
