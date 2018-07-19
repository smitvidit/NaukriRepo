package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Readfile {

	public static Iterator<String[]> csv(String filename, String splitter) throws IOException {

		ArrayList<String[]> testdata = new ArrayList<>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] testcase = line.split(splitter);
				testdata.add(testcase);
				br.close();
				fr.close();
			}
		} catch (Exception e) {
			System.out.println("Invalid File");
		}
		return testdata.iterator();
	}
}
