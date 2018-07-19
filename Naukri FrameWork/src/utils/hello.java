package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String[]> testdata = new ArrayList<>();
		try {
			FileReader fr = new FileReader("testdata/userdata.csv");
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			String line = null;

			while ((line = br.readLine()) != null) {
				String[] testcase = line.split(",");
				testdata.add(testcase);
				br.close();
				fr.close();
			}
		} catch (Exception e) {
			System.out.println("Invalid File");
		}
	}

}
