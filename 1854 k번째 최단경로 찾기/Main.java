import java.io.*;
import java.util.*;
class Vertex implements Comparable<Vertex>{

	int no;
	int distance;
	public Vertex(int no, int distance) {
		this.no = no;
		this.distance = distance;
	}
	
	@Override
	public int compareTo(Vertex o) {
		// TODO Auto-generated method stub
		return this.distance - o.distance;
	}
	
}
public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    

	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    int k = Integer.parseInt(st.nextToken());
	    PriorityQueue<Integer> dijk[] = new PriorityQueue[n];
	    PriorityQueue<Vertex> pq = new PriorityQueue<>();
	    ArrayList<Vertex> list[] = new ArrayList[n];
	    for(int i=0; i<n; i++) {
	    	list[i] = new ArrayList<>();
	    	dijk[i] = new PriorityQueue<>(Collections.reverseOrder());
	    }
	    for(int i=0; i<m; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	int start = Integer.parseInt(st.nextToken())-1;
	    	int end = Integer.parseInt(st.nextToken())-1;
	    	int value = Integer.parseInt(st.nextToken());
	    	list[start].add(new Vertex(end,value));
	    }
	    //int [] dijk = new int[n];
	    //Arrays.fill(dijk, (int)10e9);
	    //dijk[start] = 0;
	    pq.add(new Vertex(0, 0));
	    dijk[0].add(0);
	    while(!pq.isEmpty()) {
	    	Vertex cur = pq.poll();
	    	for(int i=0; i<list[cur.no].size(); i++) {
	    		Vertex next = list[cur.no].get(i);
	    		if(dijk[next.no].size() < k) {
	    			dijk[next.no].add(cur.distance + next.distance);
	    			pq.add(new Vertex(next.no,cur.distance+next.distance));
	    			
	    		}
	    		else if(dijk[next.no].peek() > cur.distance + next.distance) {
	    			dijk[next.no].poll();
	    			dijk[next.no].add(cur.distance + next.distance);
	    			
	    			pq.add(new Vertex(next.no, cur.distance + next.distance));
	    		}
	    	}
	    }
	    for(int j=0; j<n; j++) {
	    	if(dijk[j].size() == k)System.out.println(dijk[j].peek());
	    	else System.out.println(-1);
	    }
	    
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
