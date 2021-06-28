package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	 1269 problem
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> hs = new HashSet<>();
		
		//2��°�� ������ 3��°�� ������ �Է�
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aNum = Integer.parseInt(st.nextToken());
		int bNum = Integer.parseInt(st.nextToken());
		int size = 0;
		int count = 0;
		
		//2��°�� �� �ޱ�
		StringTokenizer a = new StringTokenizer(br.readLine());
		for(int i=0; i<aNum; i++) {
			hs.add(Integer.parseInt(a.nextToken()));
		}
		
		//3��°�� �� �ޱ�
		StringTokenizer b = new StringTokenizer(br.readLine());
		for(int i=0; i<bNum; i++) {
			int value = Integer.parseInt(b.nextToken());
			if(hs.contains(value)) {
				count++;
			}
			else {
			hs.add(value);
			}
		}
		//a�� + b�� ���� -�ߺ��Ǵ� ����
		bw.write(String.valueOf(aNum+bNum-count*2));
		bw.flush();
		bw.close();
	}
	
}
