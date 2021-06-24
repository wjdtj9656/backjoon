package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	20001 problem 고무오리 디버깅
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		
		String input = br.readLine();
		String str = "고무오리 디버깅 시작";
		String repeatInput ="";
		int count = 0;
		
		while(str.equals(input)) {
			repeatInput = br.readLine();
			if(repeatInput.equals("고무오리") && count==0) {
				count += 2;
			}
			else if(repeatInput.equals("문제")) {
				count++;
			}
			else if(repeatInput.equals("고무오리")){
				count--;
			}
			
			if(repeatInput.equals("고무오리 디버깅 끝")) {
				input ="고무오리 디버깅 끝";
				if(count==0) {
					bw.write("고무오리야 사랑해");
				}
				else {
					bw.write("힝구");
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
