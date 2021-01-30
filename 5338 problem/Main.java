package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 5338 problem
	마이크로소프트 로고를 예제 출력처럼 출력하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String first = "       _.-;;-._";
		String second = "'-..-'|   ||   |";
		String third = "'-..-'|_.-;;-._|";
		String fourth = "'-..-'|   ||   |";
		String fifth = "'-..-'|_.-''-._|";
		
		bw.write(first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
		bw.flush();
		bw.close();
		
		return ;
	}

}
