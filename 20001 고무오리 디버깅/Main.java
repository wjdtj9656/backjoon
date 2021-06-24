package Baekjoon;
import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	/*
 	20001 problem ������ �����
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		
		String input = br.readLine();
		String str = "������ ����� ����";
		String repeatInput ="";
		int count = 0;
		
		while(str.equals(input)) {
			repeatInput = br.readLine();
			if(repeatInput.equals("������") && count==0) {
				count += 2;
			}
			else if(repeatInput.equals("����")) {
				count++;
			}
			else if(repeatInput.equals("������")){
				count--;
			}
			
			if(repeatInput.equals("������ ����� ��")) {
				input ="������ ����� ��";
				if(count==0) {
					bw.write("�������� �����");
				}
				else {
					bw.write("����");
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
