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
		int num = 0;
		int sum = 0;
		String arr[] = nums.split(" ");
		String nums2 = br.readLine();
		String arr2[] = nums2.split(" ");
		int arr3[] =new int[5];

		sum = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
		for(int i=0; i<5; i++) {
			arr3[i] = Integer.parseInt(arr2[i])-sum;
			bw.write(arr3[i] + " ");
		}
		
		
		
		bw.flush();
		bw.close();
		
		return ;
	}

}
