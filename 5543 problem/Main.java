package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	/*
	 * 1297 problem
	��ž�� TV�� �緯 ���ͳ� ���θ��� ����. ������ �ϴ� �߿�, TV�� ũ��� �� TV�� �밢���� ���̷� ��Ÿ�� �ٴ� ���� �˾Ҵ�. ������, ��ž�� �밢���� ���̰� ���ٰ� �ص�, ���� TV�� ũ��� �ٸ� ���� �ִٴ� ��ǿ� ���� TV�� �������� �� ���ͳ� ������ �밢���� ���̸� �����ִ��� ��ȸ�ϰ� �־���.
	���ͳ� ���θ� �����ڿ��� �̸����� ������ ���� ���̿� ���� �ʺ� �����޶�� ������, �����ڴ� ���� ���̿� ���� �ʺ� ������ �ʰ� �װ��� ������ �����Դ�.
	TV�� �밢�� ���̿�, ���� �ʺ��� ������ �־����� ��, ���� ���̿� �ʺ��� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int ham1 = sc.nextInt();
		int ham2 = sc.nextInt();
		int ham3 = sc.nextInt();
		int bev1 = sc.nextInt();
		int bev2 = sc.nextInt();
		
		int sum = 0;
		int[] ham = new int[3];
		ham[0] = ham1;
		ham[1] = ham2;
		ham[2] = ham3;
		int[] bev = new int[2];
		bev[0] = bev1;
		bev[1] = bev2;
		sum = min(ham) + min(bev) - 50;
		
		System.out.println(sum);
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
