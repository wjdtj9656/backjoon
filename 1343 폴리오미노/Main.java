package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 1343 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'X') {
				count++;
			}
			else if(str.charAt(i) == '.') {
				sb.append(".");
				count = 0;
				continue;
			}
			if(count == 4) {
				sb.append("AAAA");
				count = 0;
				continue;
			}
			if(count == 1 && i<str.length()-2 && str.charAt(i+2)=='.' && str.charAt(i+1)=='X') {
				sb.append("BB");
				count = 0;
				i+=1;
				continue;
			}
			if(count == 1 && i==str.length()-2 && str.charAt(str.length()-1)=='X') {
				sb.append("BB");
				count = 0;
				break;
			}
			if(count ==3 && i<str.length()-1&& str.charAt(i+1)=='.') {
				break;
			}
			if(count == 1 && i<str.length()-1 && str.charAt(i+1)=='.') {
				break;
			}
		}
		if(count > 0) {
			sb.delete(0, sb.length());
			sb.append(-1);
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		br.close();
		bw.close();
	}
}

