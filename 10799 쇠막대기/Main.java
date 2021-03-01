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
		
		String str = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				count++;
			}
			else if(str.charAt(i) == ')'){
				if(str.charAt(i-1) == '(') {
					count--;
					result += count;
				}
				else {
					count--;
					result++;
				}
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
