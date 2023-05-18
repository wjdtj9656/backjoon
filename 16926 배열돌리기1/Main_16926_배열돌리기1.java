import java.util.*;
import java.io.*;
public class Main_16926_배열돌리기1 {

	//오 아래 왼 위
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int map[][] = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int groupNum = Math.min(N, M)/2;
		
		for(int r=0; r<R; r++) {
			for(int num=0; num<groupNum; num++) {
				int x = num;
				int y = num;
				int temp = map[x][y];
				for(int see=0; see<4; see++) {
					while(true) {
						int nx = x + dx[see];
						int ny = y + dy[see];
						if(nx>=num && ny>=num && nx<N-num && ny<M-num) {
							map[x][y] = map[nx][ny];
							x = nx;
							y = ny;
						}
						else {
							break;
						}
					}
				}
				map[num+1][num] = temp;
			}
		}
		for(int []arr : map) {
			for(int num : arr) {
				sb.append(String.valueOf(num+" "));
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
