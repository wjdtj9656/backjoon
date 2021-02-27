package javaBaekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1946 problem 신입 사원
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i));
				count ++;
				if(count == 10) {
					System.out.println();
					count = 0;
			}
		}
		bw.flush();
		bw.close();
	}
}
