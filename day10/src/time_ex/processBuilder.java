package time_ex;

import java.io.IOException;

public class processBuilder {

	public static void main(String[] args) {
		ProcessBuilder pro = new ProcessBuilder();
		String s = "calc";
		pro.command(s);
		
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
