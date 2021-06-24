package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	17608 problem 막대기
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		
		int input = Integer.parseInt(br.readLine());
		int repeatInput = 0;
		int compNum = 0;
		int count = 0;
		//입력값 받는 반복문
		for(int i=0;i<input;i++) {
			repeatInput = Integer.parseInt(br.readLine());
			list.add(repeatInput);
		}
		//제일 마지막 막대기의 길이값 저장
		compNum = list.get(input-1);
		
		//제일 마지막 막대기 길이보다 긴것들 카운트함
		for(int i=input-2; i>=0; i--) {
		if(list.get(i) > compNum) {
			compNum = list.get(i);
			count++;
		}
		}
		//마지막 막대기도 포함이라 +1해서 출력함
		bw.write(String.valueOf(count+1));
		bw.flush();
		bw.close();
	}
}
