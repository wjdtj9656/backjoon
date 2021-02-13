package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1541 problem 잃어버린 괄호
	세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
	그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
	괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		int sum = Integer.MAX_VALUE;
		while(st.hasMoreTokens()) {
			int temp = 0;
			
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
			
			while(st2.hasMoreTokens()) {
				temp += Integer.parseInt(st2.nextToken());
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}
			else {
				sum -= temp;
			}
			
		}
		System.out.println(sum);
		bw.flush();
		bw.close();
	}
}
