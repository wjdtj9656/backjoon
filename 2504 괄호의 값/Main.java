package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	2504 problem 괄호의 값
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		
		String str = br.readLine();
		int value = 1;
		int result = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(stack.isEmpty() && (str.charAt(i) == ')' || str.charAt(i) == ']')) {
				result = 0;
				break;
			}
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
				value *= 2;
			}
			else if(str.charAt(i) == '[') {
				stack.push(str.charAt(i));
				value *= 3;
			}
			if(str.charAt(i) == ')' && i>=1) {
				if(str.charAt(i-1) == '(') {
					result += value;
				}
				stack.pop();
				value /= 2;
			}
			else if(str.charAt(i) == ']' && i>=1) {
				
				if(str.charAt(i-1) == '[') {
					result += value;
				}
				stack.pop();
				value /= 3;
			}
		}
		if(stack.empty()) {
			bw.write(String.valueOf(result));
		}
		else {
			bw.write(String.valueOf(0));
		}
		bw.flush();
		bw.close();
	}
}
