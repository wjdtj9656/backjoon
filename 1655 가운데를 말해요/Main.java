import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2) -> o2-o1);
        
        for(int i=0; i<N; i++) {
        	int num = Integer.parseInt(br.readLine());
        	if(i%2 == 1) minHeap.add(num);
        	else maxHeap.add(num);
        	if(!minHeap.isEmpty() && !maxHeap.isEmpty()) {
        	if(minHeap.peek()<maxHeap.peek()) {
        		int temp = minHeap.poll();
        		minHeap.add(maxHeap.poll());
        		maxHeap.add(temp);
        		}
        	}
        	bw.write(maxHeap.peek()+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

