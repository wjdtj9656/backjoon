package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1094 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int end = input;
		int count = 0;
		int length = 64;
		int result = 0;
		
		while(true) {
			if(input==64) {
				count++;
				break;
			}
			length /= 2;
			
			if(input>=length) {
				result += length;
				count++;
			if(end == result) {
				break;
			}
			input = input -length;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		br.close();
		bw.close();
	}
}
