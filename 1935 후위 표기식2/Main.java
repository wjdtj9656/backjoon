package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1935 problem 후위표기식2
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Float> stack = new Stack<Float>();
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		float c[] = new float[26];
		
		for(int i=0; i<num; i++) {
			int input = Integer.parseInt(br.readLine());
			c[i] = (float) input;
			}
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <=90) {
				int index = str.charAt(i)-65;
				stack.push(c[index]);
			}
			else {
				float result = 0.f;
				float pop1 = stack.pop();
				float pop2 = stack.pop();
				if(str.charAt(i) == '+') {
					result = pop2 + pop1;
				}
				if(str.charAt(i) == '-') {
					result = pop2 - pop1;
				}
				if(str.charAt(i) == '*') {
					result = pop2 * pop1;
				}
				if(str.charAt(i) == '/') {
					result = pop2 / pop1;
				}
				stack.push(result);
			}
		}
		System.out.format("%.2f", stack.pop());

		bw.flush();
		bw.close();
	}
}
