package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1475 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = 0;
		String input = br.readLine();
		int arr[] = new int[10];
		for(int i=0; i<input.length(); i++) {
			arr[input.charAt(i)-'0']++;
		}
		int sum = arr[6]+arr[9];
		if(sum%2==0) {
			sum /= 2;
		}
		else {
			sum /= 2;
			sum++;
		}
		arr[6] = sum;
		arr[9] = sum;
		for(int i=0; i<input.length(); i++) {
			max = Math.max(max, arr[input.charAt(i)-'0']);
		}
		bw.write(String.valueOf(max));
		bw.flush();
		br.close();
		bw.close();
	}
}
