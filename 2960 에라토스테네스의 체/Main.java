package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 2960 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		boolean check[] = new boolean[N+1];
		int count = 0;
		
		for(int i=2; i<=N; i++) {
			for(int j=i; j<=N; j+=i) {
				if(check[j] ==false) {
					count++;
					check[j] = true;
				}
				
				if(count==K) {
					bw.write(String.valueOf(j));
					bw.flush();
					br.close();
					bw.close();
					return;
				}
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}

