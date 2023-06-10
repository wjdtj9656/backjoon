import java.io.*;
import java.math.*;
import java.util.*;
class Value implements Comparable<Value>{
	int v1;
	int v2;
	public Value(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	@Override
	public int compareTo(Value o) {
		// TODO Auto-generated method stub
		if(this.v2 == o.v2) {
			return this.v1 - o.v1;
		}
		return this.v2 - o.v2;
	}
	
}
public class Main {

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    PriorityQueue<Value> pq = new PriorityQueue<>();
	    int N = Integer.parseInt(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    while(N != 0) {
	    	int num = Integer.parseInt(br.readLine());
	    	if(num == 0) {
	    		if(pq.isEmpty()) {
	    			sb.append(0+"\n");
	    		}
	    		else {
	    			sb.append(String.valueOf(pq.poll().v1)+"\n");
	    		}
	    	}
	    	else {
	    		pq.add(new Value(num,Math.abs(num)));
	    	}
	    	N--;
	    }
	    bw.write(sb.toString());
	    
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
