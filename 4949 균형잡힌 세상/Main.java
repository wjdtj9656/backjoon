package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	4949 problem 균형잡힌세상
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();

		
		while(true) {
			stack.clear();
			String str = br.readLine();

			if(str.equals(".")) {
				break;
			}
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == '(' || str.charAt(i) == '[') {
					stack.push(str.charAt(i));
				}
				else if(str.charAt(i) == ')' || str.charAt(i) == ']') {
					if(stack.isEmpty() || (str.charAt(i) == ')' && stack.peek() != '(') || (str.charAt(i) == ']' && stack.peek() != '[')){
						stack.push(str.charAt(i));
						break;
					}
					stack.pop();
				}
				}

			if(stack.empty()) {
				bw.write("yes" + "\n");
			}
			else {
				bw.write("no" + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
