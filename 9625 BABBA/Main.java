package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 9625 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(0);
		b.add(1);
		if(num>=2) {
			a.add(1);
			b.add(1);
		}
		if(num>=3) {
			a.add(1);
			b.add(2);
		}
		if(num>=4) {
			for(int i=3; i<num; i++) {
				a.add(b.get(i-1));
				b.add(a.get(i-1) + b.get(i-1));
			}
		}
		bw.write(String.valueOf(a.get(num-1)+" "+b.get(num-1)));
		bw.flush();
		bw.close();
	}
	
}
