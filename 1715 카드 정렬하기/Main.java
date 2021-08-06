package Baekjoon;

import java.io.*;
import java.util.*;
public class Main { 
	/*
	 * 1715 problem
	 */
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		int sum = 0;
		
		for(int i=0; i<input; i++) {
			pq.add(Long.parseLong(br.readLine()));
		}
		while(pq.size() > 1) {
			long temp1 = pq.poll();
			long temp2 = pq.poll();
			
			sum += temp1 + temp2;
			pq.add(temp1 + temp2);
		}
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.flush();
		bw.close();
	}
}