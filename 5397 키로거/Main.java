package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	5397 problem 키로거
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '<') {
					if(!stack.isEmpty()) {
						stack2.push(stack.pop());
					}
				}
				else if(str.charAt(j) == '>') {
					if(!stack2.isEmpty()) {
						stack.push(stack2.pop());
					}
				}
				else if(str.charAt(j) == '-') {
					if(!stack.isEmpty()) {
						stack.pop();
					}
				}
				else {
					stack.push(str.charAt(j));
				}
			}
			while(!stack2.isEmpty()) {
				stack.push(stack2.pop());
			}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			sb.reverse();
			bw.write(sb+"\n");
		}
		bw.flush();
		bw.close();
	}
}
