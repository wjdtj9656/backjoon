import java.util.*;
import java.io.*;

class Problem implements Comparable<Problem>{
	int no;
	int level;
	Problem(int no, int level){
		this.no = no;
		this.level = level;
	}
	public int compareTo(Problem o1) {
		if(this.level == o1.level) return this.no - o1.no;
		return this.level - o1.level;
	}
}
public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Problem> ts = new TreeSet<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int no = Integer.parseInt(st.nextToken());
			int level = Integer.parseInt(st.nextToken());
			ts.add(new Problem(no,level));
			hm.put(no, level);
		}
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if(input.equals("recommend")) {
				int x = Integer.parseInt(st.nextToken());
				if(x == 1)sb.append(ts.last().no+"\n");
				else sb.append(ts.first().no+"\n");
			}
			else {
				int no = Integer.parseInt(st.nextToken());
				if(input.equals("add")) {
					int level = Integer.parseInt(st.nextToken());
					ts.add(new Problem(no,level));
					hm.put(no,level);
				}
				else {
					ts.remove(new Problem(no,hm.get(no)));
					hm.remove(no);
				}
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}