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
		
		int x = Integer.parseInt(br.readLine());
		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			
			if( x <= cross_count + prev_count_sum) {
				
				if(cross_count % 2 == 1) {
					bw.write(cross_count - (x - prev_count_sum - 1) + "/" + (x - prev_count_sum));
					break;
				}
			
			else {
					bw.write(x - prev_count_sum + "/" + (cross_count - (x - prev_count_sum -1)));
					break;
			}
				
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		bw.flush();
		bw.close();
		return ;
	}
}
