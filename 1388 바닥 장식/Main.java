import java.util.*;
import java.io.*;
public class Main {

	static int n,m;
	static char map[][];
	static int count;
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	map = new char[n][m];
    	for(int i=0; i<n; i++) {
    		String s = br.readLine();
    		for(int j=0; j<m; j++) {	
    			map[i][j] = s.charAt(j);
    		}
    	}
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
    				if(map[i][j] == '-') {
    					count++;
    					while(j<m) {
    						if(map[i][j] == '-') {
    							j++;
    						}
    						else {
    							break;
    						}
    					}
    				}
    			}
    		}
    	
    	for(int i=0; i<m; i++) {
    		for(int j=0; j<n; j++) {
    			if(map[j][i] == '|') {
    				count++;
    				while(j<n) {
    					if(map[j][i] == '|') {
    						j++;
    					}
    					else {
    						break;
    					}
    				}
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(count));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}