package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 1904 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		for(int i=2; i<N; i++) {
			list.add((list.get(i-1)+list.get(i-2))%15476);
		}
		bw.write(String.valueOf(list.get(N-1)));
		bw.flush();
		br.close();
		bw.close();
	}
}

