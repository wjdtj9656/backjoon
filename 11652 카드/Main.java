package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 11652 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int max = 1;
		long list[] = new long[N];
		for(int i=0; i<N; i++) {
			list[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(list);
		long result = list[0];
		
		for(int i=1 ;i<N; i++) {
			if(list[i] == list[i-1]) {
				count++;
			}
			else {
				count = 1;
			}
		
			if(max<count) {
				max = count;
				result = list[i];
			}
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		br.close();
		bw.close();
	}
}

