package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2440 problem 별 찍기 - 3 
	첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		for(int i=0; i<num; i++) {
			for(int j=num2 ; j>0; j--) {
				bw.write("*");	
			}
			num2--;
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		return ;
	}
}
