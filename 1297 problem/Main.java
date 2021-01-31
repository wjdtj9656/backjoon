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
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		String measures[] = num.split(" ");
		double dig =Integer.parseInt(measures[0]);
		int height = Integer.parseInt(measures[1]);
		int weigh = Integer.parseInt(measures[2]);
		double k = Math.pow(dig, 2)/(Math.pow(height, 2) + Math.pow(weigh, 2));
		k = Math.sqrt(k);
		height = (int) (k*height);
		weigh = (int) (k*weigh);
		bw.write(height+" "+weigh);
		bw.flush();
		bw.close();
		return ;
	}

}
