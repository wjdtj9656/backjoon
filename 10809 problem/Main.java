import java.io.*;
import java.util.*;

/*
 * backjoon 10809 problem
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
