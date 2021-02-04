package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 1157 problem 단어공부
	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int arr[] = new int[26];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				arr[str.charAt(i)-65]++;
			}
			else {
				arr[str.charAt(i)-97]++;
			}
		}
		int max = 0;
		char c = '?';
		for(int i=0; i<26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				c = (char)(i+65);
			}
			else if(max == arr[i]) {
				c = '?';
			}
		}
		bw.write(c);
		bw.flush();
		bw.close();
		return ;
	}
}
