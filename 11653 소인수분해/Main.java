package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 11653 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int a = 2;
		while(num !=1) {
			if(num %a == 0) {
				num /= a;
				bw.write(a+"\n");
				a=2;
			}
			else {
				a++;
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
