package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1932 problem 정수 삼각형
	위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
	맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
	삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int dp[][] = new int[num][num];
		int tokenSize = 0;
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			tokenSize = st.countTokens();
			for(int j=0; j<tokenSize; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=num-1; i>0; i--) {
			for(int j=0; j<num-1; j++) {
				dp[i-1][j] = Math.max(dp[i][j] + dp[i-1][j], dp[i][j+1] + dp[i-1][j]);
			}
		}
		System.out.println(dp[0][0]);
		
		bw.flush();
		bw.close();
	}
}
