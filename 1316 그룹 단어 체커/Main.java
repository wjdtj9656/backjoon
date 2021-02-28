package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1316 problem 그룹 단어 체크
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int result = num;
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			boolean check[] = new boolean[26];
			
			for(int j=1; j<str.length(); j++) {
				if(str.charAt(j) != str.charAt(j-1)) {
					if(check[str.charAt(j)-97] == true) {
						result--;
						break;
					}
					else {
						check[str.charAt(j-1)-97] = true;
					}
				}
			}
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
	}
}
