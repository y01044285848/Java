package step3;

import java.io.*;

public class Main3_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		for (int i = 0; i < num; i++) {
			String str = bf.readLine();
			String[] numarr = str.split(" ");
			int a = Integer.parseInt(numarr[0]);
			int b = Integer.parseInt(numarr[1]);
			bw.write(a + b + "\n");
		}
		bw.flush();
		bw.close();
	}
}