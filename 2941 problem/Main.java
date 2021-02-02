package javaBaekjoon;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	/*
	 * 2941 problem ACM호텔
	예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input =br.readLine();
		int len = input.length();
		int count = len;
		
		for(int i=0; i<len; i++) {
			char ch = input.charAt(i);
			if(i < len-1) {
			if(ch == 'c') {
				if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-')
					count--;
				}
			else if(ch == 'd') {
				if(input.charAt(i+1) == '-') {
					count--;
				}
				else if(i < len-2) {
					if(input.charAt(i+1) == 'z')
						if(input.charAt(i+2) == '=') {
							count -=2; i++;
						}
				}
			}
			else if(ch == 'l') {
				if(input.charAt(i+1) == 'j') {
					count--;
				}
			}
			else if(ch == 'n') {
				if(input.charAt(i+1) == 'j') {
					count--;
				}
			}
			else if(ch == 's') {
				if(input.charAt(i+1) == '=') {
					count--;
				}
			}
			else if(ch == 'z') {
				if(input.charAt(i+1) == '=') {
					count--;
					
				}
			}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		return ;
	}
}
