package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1292 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int count = 1;
		int result = 0;
		for(int i=0; i<end; i++) {
			for(int j=0; j<count; j++) {
				list.add(count);
			}
			count++;
		}
		for(int i=start; i<=end; i++) {
			result += list.get(i-1);
		}
		System.out.println(result);
		bw.flush();
		br.close();
		bw.close();
	}
}
