import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int map[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<N; i++) {
			Arrays.sort(map[i]);
		}
		//포인터가 가르키는 인덱스 나타냄
		int arr[] = new int[N];
		int result = (int)10e9;
		int minArray = 0;
		while(true) {
			int max = 0;
			int min = (int)10e9;
			for(int i=0; i<N; i++) {
				//최대값 찾기
				if(map[i][arr[i]] > max) {
					max = map[i][arr[i]];
				}
				//최소값 찾기
				if(map[i][arr[i]] < min) {
					min = map[i][arr[i]];
					minArray = i;
				}
			}
			//제일 작은 값 선택.
			result = Math.min(result, max-min);
			arr[minArray]++;
			if(arr[minArray] == M) break;
		}
		System.out.println(result);
		br.close();
	}
}
