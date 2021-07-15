package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 15829 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		long sum = 0;
		double r = 0;
		r = Math.pow(31, 0);
		for(int i=0; i<num; i++) {
		sum += (str.charAt(i)-96)* r;
		r = r*31%1234567891;
		}
		bw.write(String.valueOf(sum%1234567891));
		bw.flush();
		br.close();
		bw.close();
	}
}
