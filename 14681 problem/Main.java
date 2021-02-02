package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

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
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int result = 0;
		
		if( x > 0 && y>0)
			result = 1;
		else if( x < 0 && y>0)
			result = 2;
		else if( x < 0 && y<0)
			result = 3;
		else
			result = 4;
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		return ;
	}
}
