package les8HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, write your sentence which you need to format");
		try {
		formatSt(br);
		}
		catch (IOException e) {
			System.out.println("Something goes wrong.Please, write your sentence which you need to format.");
		}
	}

	public static void formatSt(BufferedReader br) throws IOException {
		String s = br.readLine();
		String re = "\\s+";
		String[] sarr = s.split(re);
		for (int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}

	}

}