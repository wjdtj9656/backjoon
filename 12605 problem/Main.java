package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Main {

	/*
	 * 12605 problem 단어순서 뒤집기
	 * 스페이스로 띄어쓰기 된 단어들의 리스트가 주어질때, 단어들을 반대 순서로 뒤집어라. 
	 * 각 라인은 w개의 영단어로 이루어져 있으며, 총 L개의 알파벳을 가진다. 각 행은 알파벳과 스페이스로만 이루어져 있다. 
	 * 단어 사이에는 하나의 스페이스만 들어간다.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int stackSize = 0;
		for(int i=0; i<num; i++) {
			Stack<String> stack = new Stack<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				stack.push(st.nextToken());
			}
			stackSize = stack.size();
			bw.write("CASE #" + (i+1) + ": ");
			for(int j=0; j<stackSize; j++) {
				bw.write(stack.pop() + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
