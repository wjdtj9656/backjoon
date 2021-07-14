package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 11866 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1 ;i<=N; i++) {
			list.add(i);
		}
		int a =K-1;
		bw.write("<");
		while(!list.isEmpty()) {
			if(a>=list.size()) {
				a %= list.size();
			}
			if(list.size()==1) {
				bw.write(String.valueOf(list.get(a)));
				break;
			}
			bw.write(String.valueOf(list.get(a))+", ");
			list.remove(a);
			a+=K-1;
		}
		bw.write(">");
		bw.flush();
		br.close();
		bw.close();
	}
}
