import java.io.*;
import java.util.*;


public class Main {
	static int arr[],N,M;
	public static void makeSet() {
		arr = new int[N+1];
		for(int i=1; i<=N; i++) {
			arr[i] = i;
		}
	}
	public static int findSet(int a) {
		if(a==arr[a]) return a;
		else return arr[a] = findSet(arr[a]);
	}
	public static boolean union(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);
		if(aRoot == bRoot) return false;
		
		arr[bRoot] = aRoot;
		for(int i=1; i<=N; i++) {
			if(arr[i] == bRoot) {
				arr[i] = aRoot;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		boolean visit[] = new boolean[N+1];
		int map[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(i==j) continue;
				map[i][j] = (int)1e9;
			}
		}
		makeSet();
		int result = 0;
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(union(a,b)) result++;
			map[a][b] = 1;
			map[b][a] = 1;
		}
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					if(map[i][j] > map[i][k] + map[k][j]) map[i][j] = map[i][k] + map[k][j];
				}
			}
		}
//		for(int i=1; i<=N; i++) {
//			for(int j=1; j<=N; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for (int a : arr) {
//			System.out.println(a);
//		}
		//총개수 - union이 성공한 수
		bw.append(String.valueOf(N-result)+"\n");
		int answer[] = new int[N-result];
		for(int n=0; n<N-result; n++) {
			boolean flag = false;
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=1; i<=N; i++) {
				if(!flag && !visit[i]) {
					arr[0] = arr[i];
					flag = true;
				}
				if(arr[i] == arr[0] && !visit[i]) {
					visit[i] = true;
					list.add(i);
				}
			}
			int min = (int)10e9;
			int max[] = new int[list.size()];
			int saveIndex = 0;
			for(int i=0; i<list.size(); i++) {
				int tempMax = 0;
				for(int j=0; j<list.size(); j++) {
					tempMax = Math.max(tempMax, map[list.get(i)][list.get(j)]);
				}
				max[i] = tempMax;
			}
			for(int i=0; i<max.length; i++) {
				if(max[i] < min) {
					min = max[i];
					saveIndex = list.get(i);
				}
			}
			answer[n] = saveIndex;
		}
		Arrays.sort(answer);
		for(int i=0; i<N-result; i++) {
			bw.append(String.valueOf(answer[i])+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}