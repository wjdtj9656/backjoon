import java.io.*;
import java.util.*;

/*
 * backjoon 11654 problem
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * https://www.acmicpc.net/problem/11654
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		char asci=sc.next().charAt(0);
		System.out.println(Integer.valueOf(asci));
}//main
}//class main
