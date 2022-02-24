import java.io.*;
import java.util.*;
class Home implements Comparable<Home>{
	int idx;
	int weight;
	public Home(int idx, int weight) {
		this.idx = idx;
		this.weight = weight;
	}
	@Override
	public int compareTo(Home o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}
}
public class Main {

	static int N,X;
	static ArrayList<Home> list1[],list2[]; 
	static public int[] dijkstra(ArrayList<Home> list[]) {
		PriorityQueue<Home> pq = new PriorityQueue<>();
	    boolean visit[] = new boolean[N+1];
	    pq.add(new Home(X,0));
	    
	    int dist[] = new int[N+1];
	    Arrays.fill(dist, (int)10e9);
	    dist[X] = 0;
	    while(!pq.isEmpty()) {
	    	Home home = pq.poll();
	    	visit[home.idx] = true;
	    	if(dist[home.idx] < home.weight) continue;
	    	
	    	for(int i=0; i<list[home.idx].size(); i++) {
	    		Home temp = list[home.idx].get(i);
	    		if(!visit[temp.idx]&&dist[temp.idx] > home.weight + temp.weight) {
	    			dist[temp.idx] = home.weight + temp.weight;
	    			pq.add(new Home(temp.idx, dist[temp.idx]));
	    		}
	    	}
	    }
	    return dist;
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    X = Integer.parseInt(st.nextToken());
	    int arr1[] = new int[N+1];
	    int arr2[] = new int[N+1];
	    ArrayList<Home> list[] = new ArrayList[N+1];
	    ArrayList<Home> list2[] = new ArrayList[N+1];
	    for(int i=1; i<=N; i++) {
	    	list[i] = new ArrayList<>();
	    	list2[i] = new ArrayList<>();
	    }
	    for(int i=1; i<=M; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int start = Integer.parseInt(st.nextToken());
	    	int end = Integer.parseInt(st.nextToken());
	    	int weight = Integer.parseInt(st.nextToken());
	    	list[start].add(new Home(end,weight));
	    	list2[end].add(new Home(start,weight));
	    }
	    arr1 = dijkstra(list);
	    arr2 = dijkstra(list2);
	    int result = 0;
	    for(int i=1; i<=N; i++) {
	    	if(arr1[i] == (int)10e9 || arr2[i] == (int)10e9) continue;
	    	result = Math.max(result, arr1[i]+arr2[i]);
	    }
	    bw.write(String.valueOf(result));
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
