package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1789 problem
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long num = Long.parseLong(br.readLine());
		long result =1;
		long count = 1;
		long add = 2;
		while(true) {
			if(num<count) {
				break;
			}
			result = add-1;
			count+=add;
			add++;
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.close();
	}
}
