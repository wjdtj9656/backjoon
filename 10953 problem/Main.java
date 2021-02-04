package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 10953 problem a+b-6
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			String abNum = br.readLine();
			String ab[] = abNum.split(",");
			int sum = Integer.parseInt(ab[0]) + Integer.parseInt(ab[1]);
			bw.write(String.valueOf(sum)+"\n");
		}
		bw.flush();
		bw.close();
		return ;
	}
}
