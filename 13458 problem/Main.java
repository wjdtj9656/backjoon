package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 13458 problem 시험감독
	총 N개의 시험장이 있고, 각각의 시험장마다 응시자들이 있다. i번 시험장에 있는 응시자의 수는 Ai명이다.
	감독관은 총감독관과 부감독관으로 두 종류가 있다. 총감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 B명이고, 부감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 C명이다.
	각각의 시험장에 총감독관은 오직 1명만 있어야 하고, 부감독관은 여러 명 있어도 된다.
	각 시험장마다 응시생들을 모두 감시해야 한다. 이때, 필요한 감독관 수의 최솟값을 구하는 프로그램을 작성하시오.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testClass = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[testClass];
		for(int i=0; i<testClass; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long result = 0;
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<testClass; i++) {
			arr[i] = arr[i] - b;
			result++;
			if(arr[i] <= 0) continue;
			if(arr[i] %c == 0) {
				result +=arr[i]/c;
			}
			else {
				result +=arr[i]/c;
				result++;
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		return ;
	}
}
