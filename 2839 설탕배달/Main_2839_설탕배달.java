import java.util.*;
import java.io.*;
public class Main_2839_설탕배달 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(true) {
			if(N % 5 == 0) {
				bw.write(String.valueOf(N/5 + cnt));
				break;
			}
			else if(N <= 0) {
				bw.write(String.valueOf(-1));
				break;
			}
			else {
				N -= 3;
				cnt++;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
