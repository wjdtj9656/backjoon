import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int N = Integer.parseInt(br.readLine());
	    ArrayList list[] = new ArrayList[N+1];
	    int result[] = new int[N+1];
	    int time[] = new int[N+1];
	    boolean visit[] = new boolean[N+1];
	    for(int i=1; i<=N; i++) {
	    	list[i] = new ArrayList<Integer>();
	    }
	    for(int i=1; i<=N; i++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	while(st.hasMoreTokens()) {
		    	int next = Integer.parseInt(st.nextToken());
		    	if(next == -1) continue;
		    	else list[i].add(next);
	    	}
	    	time[i] = (int) list[i].remove(0);
	    	result[i] = time[i];
	    }
	    Queue<Integer> q = new LinkedList<>();
	    for(int i=1; i<=N; i++) {
	    	if(list[i].size() == 0) {
	    		visit[i] = true;
	    		q.add(i);
	    	}
	    }
	    while(!q.isEmpty()) {
	    	int temp = q.poll();
	    	for(int i=1; i<=N; i++) {
	    		if(list[i].remove(Integer.valueOf(temp))) {
	    			//포함된 건물중 가장 긴시간 선택
	    			result[i] = Math.max(result[i],result[temp]+time[i]);
	    		}
	    		if(list[i].size() == 0 && !visit[i]) {
	    			visit[i] = true;
	    			q.add(i);
	    		}
	    	}
	    }
	    for(int i=1; i<=N; i++) {
	    	bw.write(String.valueOf(result[i] + "\n"));
	    }
	    
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
