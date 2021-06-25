package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	10829 problem 이진수 변환
	*/
	static public StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		long input = Long.parseLong(br.readLine());
		
		//decimal to binary
		dtb(input);
		
		//뒤집어서 출력
		bw.write(String.valueOf(sb.reverse()));
		bw.flush();
		bw.close();
	}
	static long dtb(long num) {
		long remainder = 0;
		if(num>=2) {
		remainder = num%2;
		sb.append(remainder);
		return dtb(num/2);
		}
		else {
			remainder = num%2;
			sb.append(remainder);
			return num;
		}
	}
}
