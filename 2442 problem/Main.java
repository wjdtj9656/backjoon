package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2442 problem 별 찍기 - 5 
	첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제 별은 가운데를 기준으로 대칭이어야 한다.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		int num3 = num;
		for(int i=0; i<num; i++) {
			for(int k=1; k<num2; k++) {
				bw.write(" ");
			}
			for(int j=num3-1; j<num; j++) {
				bw.write("*");	
			}
			num2--;
			num3 -=2;
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		return ;
	}
}
