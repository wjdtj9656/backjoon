package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 2845 problem
	 * ��Ƽ�� ������ ����, ������� ���� ��Ƽ�� �Դ����� �󸶳� ���� ������� �Դ����� �ñ����Ѵ�. ���� ��Ƽ�� �ſ� ũ�� ������ ������, ��Ȯ�ϰ� �� ���� �����ߴ��� �� ���� ����.
	 * ������ ����Ͽ� ����̴� �ڽ��� 3�г� ������ ����ϸ鼭 �ſ� ������ ��Ƽ�� ������. �׸���, ����̴� 1m2�� �� ���� ����� �־����� �˰��ִ�.	
	 * ������� ��Ƽ�� ���� ��û�� �Ը𿴱� ������, ��κ��� �Ź����� ��簡 �Ƿȴ�. ����̴� ���� �ٸ� 5���� �Ź��� ���鼭 �� ��翡 �������ִ� �������� ���� ������.
	 * ����̴� �ڽ��� �˰��ִ� �������� ���� ��Ȯ�ϴٰ� �����Ѵ�. �� �Ź� ��翡 �Ƿ��ִ� �������� ���� �� �� ��ŭ �߸��Ǿ��ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nums = br.readLine();
		String num[] = nums.split(" ");
		
		int accNum [] = new int[6];
		accNum[0] = 1; //ŷ
		accNum[1] = 1; //��
		accNum[2] = 2; //��
		accNum[3] = 2; //���
		accNum[4] = 2; //����Ʈ
		accNum[5] = 8; //��
		
		for(int i=0; i<6; i++) {
			accNum[i] = accNum[i] - Integer.parseInt(num[i]);
			bw.write(accNum[i]+ " ");
		}
		
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
