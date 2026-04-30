package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {
	public int inputNumber() throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String numStr = reader.readLine();
		int num = Integer.parseInt(numStr);
		return num;

	}

}
