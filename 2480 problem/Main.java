package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2480 problem
	1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 
	1.���� ���� 3���� ������ 10,000��+(���� ��)*1,000���� ����� �ް� �ȴ�. 
	2.���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)*100���� ����� �ް� �ȴ�. 
	3.��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)*100���� ����� �ް� �ȴ�.  
	���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3*100���� ���Ǿ� 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2�� �־����� 10,000+2*1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6*100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
	3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		String[] numArr = num.split(" ");
		int first = Integer.parseInt(numArr[0]);
		int second = Integer.parseInt(numArr[1]);
		int third = Integer.parseInt(numArr[2]);
		int max = 0;
		int result = 0;
		
		if (first == second && second == third) {
			result = 10000 + first*1000;
		}
		else if (first == second && first != third) {
			result = 1000 + first*100;
		}
		else if (first == third && first != second) {
			result = 1000 + first*100;
		}
		else if (second == third && second != first) {
			result = 1000 + second*100;
		}
		else {
			for(int i= 0; i<3; i++) {
				if(max<Integer.parseInt(numArr[i]))
					max = Integer.parseInt(numArr[i]);
			}
			result = max *100;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		return ;
	}
}
