import java.util.*;
import java.io.*;

class Node{
	int goal;
	int cost;
	public Node(int goal, int cost) {
		this.goal = goal;
		this.cost = cost;
	}
}
public class Main {
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int arr[][] = new int[V][V];
			for(int i=0; i<V; i++) {
				for(int j=0; j<V; j++) {
					if(i==j)continue;
					arr[i][j] = (int)1e9;
				}
			}
			for(int i=0; i<E; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				int cost = Integer.parseInt(st.nextToken());
				arr[a][b] = cost;
				arr[b][a] = cost;
			}
			st = new StringTokenizer(br.readLine());
			int one = Integer.parseInt(st.nextToken())-1;
			int two = Integer.parseInt(st.nextToken())-1;
			for(int k=0; k<V; k++) {
				for(int i=0; i<V; i++) {
					for(int j=0; j<V; j++) {
						if(arr[i][j] > arr[i][k] + arr[k][j]) {
							arr[i][j] = arr[i][k] + arr[k][j];
						}
					}
				}
			}
			int temp1 = arr[0][one] + arr[one][two] + arr[two][V-1];
			int temp2 = arr[0][two] + arr[two][one] + arr[one][V-1];
			
			int result = (temp1>= (int)1e9 && temp2>=(int)1e9) ? -1 : Math.min(temp1, temp2);
			if(arr[0][one] == (int)1e9 || arr[one][two] == (int)1e9 || arr[two][V-1] == (int)1e9 || arr[0][two] == (int)1e9 || arr[one][V-1] ==(int)1e9) result = -1;
			System.out.println(result);
			br.close();
		}
	}
