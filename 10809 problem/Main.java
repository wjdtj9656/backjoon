import java.io.*;
import java.util.*;

/*
 * backjoon 10809 problem
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * https://www.acmicpc.net/problem/10809
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char eng[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int num[]=new int[26];
		for(int i=0;i<eng.length;i++){
			num[i]=s.indexOf(eng[i]);
		}
		for(int i=0;i<eng.length;i++){
			System.out.print(num[i]+" ");
		}
}//main
}//class main
