package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1009 problem 분산 처리
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int result = 1;
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for(int j=0; j<b; j++) {
				result *= a;
				if(result>=10) {
					result %= 10;
				}
				if(result == 0) {
					result = 10;
					break;
				}
			}
			bw.write(String.valueOf(result)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
