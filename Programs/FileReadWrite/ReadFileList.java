package Programs.FileReadWrite;

import java.io.File;

public class ReadFileList {

	public static void main(String[] args) {

		File directoryPath = new File("G:\\Documents");

		String listofFiles[] = directoryPath.list();
		File[] FilewithFolder = directoryPath.listFiles();
		System.out.println("List of files in the specified directory:");
		for (int i = 0; i < listofFiles.length || i < FilewithFolder.length; i++) {
			System.out.println(listofFiles[i]); // displays file name
			System.out.println(FilewithFolder[i]); // displays folder and file name
		}
	}

}
