package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	1434 problem 책정리
	빈 박스 N개가 한 줄로 놓여져 있고, 박스에 책 M개를 넣으려고 한다. 박스는 1번부터 N번까지 번호가 매겨져 있고, 책도 1번부터 M번까지 번호가 매겨져 있다. 다음은 책을 박스에 넣는 방법이며, 가장 처음에는 1번 박스의 앞에 있고, 손에는 1번 책을 들고 있다.
	1.현재 책이 현재 박스에 들어가지 않으면, 3번으로 간다. 아니면 2번으로 간다.
	2.현재 책을 현재 박스에 넣는다. 다음 책을 손에 집고 1번으로 간다.
	3.현재 박스를 다른 쪽으로 치운 다음에, 테이프로 못 열게 봉인한다. 다음 박스를 앞으로 가져오고 1번으로 간다.
	i번 박스의 용량은 Ai이고, j번 책의 크기는 Bj이다. 책의 크기와 박스에 들어있는 책의 크기의 합이 박스의 용량을 넘지 않으면 책을 박스에 넣을 수 있다.
	위의 방법대로 책을 넣었을 때, 전체 박스의 낭비된 용량의 합을 구하는 프로그램을 작성하시오. 박스의 낭비된 용량은 박스의 용량에서 박스에 들어있는 책의 크기의 합을 뺀 값이다.
	입력으로 주어진 박스와 책의 순서를 변경하면 안된다.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int box[] = new int[N];
		int book[] = new int[M];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			box[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<M; i++) {
			book[i] = Integer.parseInt(st.nextToken());
		}

		int n = 0;
		int m = 0;
		while(true) {
			if(N <= n || M <= m) {
				for(int i=n; i<box.length; i++) {
					sum += box[i];
				}
				break;
			}
			if(box[n] > book[m]) {
				box[n] -= book[m];
				book[m] = 0;
				m++;
			}
			else if(box[n] < book[m]) {
				sum += box[n];
				n++;
			}
			else {
				n++;
				m++;
			}
			
		}
		System.out.println(sum);
		bw.flush();
		bw.close();
	}
}
