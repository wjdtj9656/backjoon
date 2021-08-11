package Baekjoon;

import java.io.*;
import java.util.*;

public class Main { 
	/*
	 * 2812 problem
	 */
	static int[] result;
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		String num = br.readLine();
		
		char[] arr = num.toCharArray();
		Deque<Character> dq = new ArrayDeque<>();
		for(int i = 0; i<arr.length; i++) {
			while( K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
				dq.removeLast();
				K--;
			}
			dq.addLast(arr[i]);
		}
		StringBuilder ans = new StringBuilder();
		while(dq.size() > K) {
			ans.append(dq.removeFirst());
		}
		bw.write(ans.toString());
		
		br.close();
		bw.flush();	
		bw.close();
	}
}