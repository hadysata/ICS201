package Labs.Lab06.src;

import java.util.*;
import java.io.*;

public class Lab06 {

	public static void main(String[] args) throws IOException {

		FileInputStream instream = new FileInputStream("IDsWithDuplicates.txt");

		ArrayList<String> list = new ArrayList<>();

		Scanner instreamScanner = new Scanner(instream);

		while (instreamScanner.hasNext()) {
			String id = instreamScanner.nextLine();
			if (!list.contains(id)) {
				list.add(id);
			}
		}

		instreamScanner.close();
		instream.close();

		FileOutputStream outstream = new FileOutputStream("IDsWithoutDuplicates.txt");
		PrintWriter printWriter = new PrintWriter(outstream);

		for (int i = 0; i < list.size(); i++) {
			printWriter.println(list.get(i));
		}

		printWriter.close();
		outstream.close();

		System.out.printf("Process done, new IDs saved in 'IDsWithoutDuplicates.txt' file");

	}

}
