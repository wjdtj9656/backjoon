package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 9461 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		ArrayList<Long> list = new ArrayList<>();
		
			list.add((long) 0);
			list.add((long) 1);
			list.add((long) 1);
			list.add((long) 1);
			list.add((long) 2);
		for(int i=5; i<=100; i++) {
			list.add(list.get(i-1) + list.get(i-5));
		}
		for(int i=0; i<tc; i++) {
			int num = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(list.get(num))+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
