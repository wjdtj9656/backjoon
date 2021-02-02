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
		int[] value =new int[4];
		value[0] = Integer.parseInt(numArr[0]); //x
		value[1] = Integer.parseInt(numArr[1]); //y
		value[2] = Integer.parseInt(numArr[2]) - Integer.parseInt(numArr[0]); //w-x
		value[3] = Integer.parseInt(numArr[3]) - Integer.parseInt(numArr[1]); //h-y
		int max = 1000;
		for(int i=0; i<4; i++) {
			if(max > value[i])
				max = value[i];
		}
		bw.write(String.valueOf(max));
		
		bw.flush();
		bw.close();
		return ;
	}
}
