package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2441 problem 별 찍기 - 4 
	첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
	하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int num2 = num;
		for(int i=0; i<num; i++) {
			for(int k=num2; k<num; k++) {
				bw.write(" ");
			}
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
