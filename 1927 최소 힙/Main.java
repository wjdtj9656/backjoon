import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp == 0) {
				if(pq.size() == 0) {
					bw.write(String.valueOf(0)+"\n");
				}
				else {
					bw.write(String.valueOf(pq.poll())+"\n");
				}
			}
			else {
				pq.add(temp);
			}
		}
		bw.flush();
		bw.close();
	}
}
