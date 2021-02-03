package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2231 problem 분해합
	어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
	자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		int len = 0;
		int result = 0;
		int sum = 0;
		int divideNum = 0;
		
		while(true) {
			result++;
			sum = result;
			divideNum = result;
			len = num.length();
		while(len>0) {
			sum += divideNum % 10;
			divideNum /= 10;
			len--;
			}
		if(sum == Integer.parseInt(num)) {
			bw.write(String.valueOf(result));
			break;
			}
		if(result > Integer.parseInt(num)) {
			bw.write("0");
			break;
		}
		}
		
		bw.flush();
		bw.close();
		return ;
	}
}
