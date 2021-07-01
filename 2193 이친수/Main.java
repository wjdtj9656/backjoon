package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 2193 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<Long> one = new ArrayList<>();
		ArrayList<Long> zero = new ArrayList<>();
		one.add((long) 1);
		zero.add((long) 0);
		for(int i=1; i<=num; i++) {
			one.add(zero.get(i-1));
			zero.add(zero.get(i-1)+one.get(i-1));
		}
		
		bw.write(String.valueOf(zero.get(num)));
		bw.flush();
		bw.close();
	}
	
}
