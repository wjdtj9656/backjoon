package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
	 * 1003 problem 피보나치 함수
	다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.	
int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}

	fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
    fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
    fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
    두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
    fibonacci(0)은 0을 출력하고, 0을 리턴한다.
    fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
    첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
    fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
	1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int fibo = 0;
		int arr0[] = new int[41];
		int arr1[] = new int[41];
		arr0[0] = 1;
		arr0[1] = 0;
		arr1[0] = 0;
		arr1[1] = 1;
		for(int i=2; i<=40; i++) {
			arr0[i] = arr0[i-1] + arr0[i-2];
			arr1[i] = arr1[i-1] + arr1[i-2];
		}
		for(int i=0; i<num; i++) {
			fibo = Integer.parseInt(br.readLine());
			System.out.println(arr0[fibo]+ " " +arr1[fibo]);
		}
		bw.flush();
		bw.close();
	}
}
