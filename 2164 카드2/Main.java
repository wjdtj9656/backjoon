package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 8979 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=num; i++) {
			q.add(i);
		}
		for(int i=0; i<num-1; i++) {
			q.remove();
			int temp = q.poll();
			q.add(temp);
		}
		bw.write(String.valueOf(q.poll()));
		
		bw.flush();
		br.close();
		bw.close();
	}
}
