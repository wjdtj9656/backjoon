package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	private static final Reader InputStream = null;

	/*
	 * 10039 problem
	�����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.
	���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. �⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
	�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = 0;
		int score = 0;
		for(int i=0; i<5; i++) {
			score = Integer.parseInt(br.readLine());
			if(score<40)
				score = 40;
			total += score;
		}
		bw.write(String.valueOf(total/5));
		bw.flush();
		bw.close();
		return ;
	}

	static int min(int a[]) {
		int min = a[0];
		for(int i=0; i<a.length-1; i++) {
			if(min > a[i+1]) {
				min = a[i+1];
			}
		}
		return min;
	}
}
