package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 10610 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<>();
		String str = br.readLine();
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			list.add((int)str.charAt(i)-'0');
		}
		if(!list.contains(0)) {
			System.out.println(-1);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			sum += list.get(i);
		}
		if(sum%3 != 0) {
			System.out.println(-1);
			return;
		}
		Collections.sort(list,Comparator.reverseOrder());
		
		for(int i=0; i<str.length();i++) {
			bw.write(String.valueOf(list.get(i)));
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
