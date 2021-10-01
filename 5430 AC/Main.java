import java.util.*;
import java.io.*;

class Main {
	
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	StringTokenizer st = null;
    	
    	for(int i=0; i<T; i++) {
    	
    		String s = br.readLine();
    		char c[] = s.toCharArray();
    		int n = Integer.parseInt(br.readLine());
    		Deque<String> dq = new LinkedList<>();
    		
    		String input = br.readLine();
    		input = input.substring(1,input.length()-1);
    		if(n != 0) {
    			st = new StringTokenizer(input,",");
    		}
    		else {
    			if(s.contains("D")) {
    				bw.write("error"+"\n");
    			}
    			else {
    				bw.write("[]"+"\n");
    			}
    			continue;
    		}
    		for(int j=0; j<n; j++) {
    			dq.add(st.nextToken());
    		}
    		boolean reverseFlag = true;
    		boolean errorFlag = false;
    		for(int j=0; j<c.length; j++) {
    			if(c[j] == 'R') {
    				reverseFlag = !reverseFlag;
    			}
    			else {
    				if(dq.isEmpty()) {
    					errorFlag = true;
    					break;
    				}
    				if(reverseFlag) {
    					dq.pollFirst();
    				}
    				else {
    					dq.pollLast();
    				}
    			}
    		}

        	if(!errorFlag) {
        		bw.write("[");
        		if(reverseFlag) {
        			while(dq.size() > 1) {
        				bw.write(dq.pollFirst()+",");
        			}
        		}
        		else {
        			while(dq.size() > 1) {
        				bw.write(dq.pollLast()+",");
        			}
        		}
        		if(dq.size() != 0) {
        			bw.write(dq.getFirst());
        		}
        		bw.write("]"+"\n");
        	}
        	else {
        		bw.write("error"+"\n");
        	}
        	
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
}