package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	17608 problem �����
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		
		int input = Integer.parseInt(br.readLine());
		int repeatInput = 0;
		int compNum = 0;
		int count = 0;
		//�Է°� �޴� �ݺ���
		for(int i=0;i<input;i++) {
			repeatInput = Integer.parseInt(br.readLine());
			list.add(repeatInput);
		}
		//���� ������ ������� ���̰� ����
		compNum = list.get(input-1);
		
		//���� ������ ����� ���̺��� ��͵� ī��Ʈ��
		for(int i=input-2; i>=0; i--) {
		if(list.get(i) > compNum) {
			compNum = list.get(i);
			count++;
		}
		}
		//������ ����⵵ �����̶� +1�ؼ� �����
		bw.write(String.valueOf(count+1));
		bw.flush();
		bw.close();
	}
}
