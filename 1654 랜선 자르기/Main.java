package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 1654 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		int min = 1000000;
		
		for(int i=0; i<k; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		

		for(int i=0; i<k; i++) {
			min = Math.min(min,list.get(i));
		}
		
		long start = 0;
		long end = min;
		long mid = (start+end)/2;
		
		while(start<=end) {
			int sum = 0;
			for(int i=0; i<k; i++) {
				sum += list.get(i)/mid;
			}
			if(sum>=n) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		bw.write(String.valueOf(end));
		bw.flush();
		br.close();
		bw.close();
	}
}
