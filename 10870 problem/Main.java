package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 10870 problem 피보나치 수 5
	피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
	이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
	n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num+1];
		if(num != 0) {
		arr[0] = 0;
		arr[1] = 1;
		}
		int sum = 0;
		for(int i=0; i<num-1; i++) {
			arr[i+2] = arr[i]+arr[i+1];
		}
		System.out.println(arr[num]);
		bw.flush();
		bw.close();
		return ;
	}
}
