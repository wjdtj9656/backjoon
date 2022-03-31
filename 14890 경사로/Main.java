import java.io.*;
import java.util.*;

public class Main {
	static int N,L,map[][];
	
	public static int checkUp(int cnt) {
		if(cnt>=L) {
			return 0;
		}
		else {
			return -1;
		}
	}
	public static int checkDown(int i,int j,boolean sw) {
		int temp = map[i][j];
		int tempCnt = 0;
		if(sw) {
		for(int y=j; y<N; y++) {
			if(map[i][y] == temp) {
				tempCnt++;
				if(tempCnt == L) return L;
			}
			else return -1;
		}
		return -1;
		}
		else {
			for(int x=i; x<N; x++) {
				if(map[x][j] == temp) {
					tempCnt++;
					if(tempCnt == L) return L;
				}
				else return -1;
			}
			return -1;
		}
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    L = Integer.parseInt(st.nextToken());
	    map = new int[N][N];
	    int result = 0;
	    for(int i=0; i<N; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j=0; j<N; j++) {
	    		map[i][j] = Integer.parseInt(st.nextToken());
	    	}
	    }
	    //가로
	    for(int i=0; i<N; i++) {
	    	int cnt = 1;
	    	for(int j=1; j<N; j++) {
	    		if(map[i][j] == map[i][j-1]) {
	    			cnt++;
	    		}
	    		else if(map[i][j] == map[i][j-1]+1) {
	    			if(checkUp(cnt) != 0) {
	    				//System.out.println(i+" "+j);
	    				result++;
	    				break;
	    			}
	    			else {
	    				cnt = 1;
	    			}
	    		}
	    		else if(map[i][j] == map[i][j-1]-1) {
	    			if(checkDown(i,j,true) == -1) {
	    				//System.out.println(i+" "+j+"haha");
	    				result++;
	    				break;
	    			}
	    			else {
	    				j += L-1;
	    				cnt = 0; 
	    			}
	    		}
	    		//1단계 이상 차이날 때
	    		else {
	    			result++;
	    			break;
	    		}
	    	}
	    }
	    //System.out.println(result);
	    //세로
	    for(int j=0; j<N; j++) {
	    	int cnt = 1;
	    	for(int i=1; i<N; i++) {
	    		if(map[i][j] == map[i-1][j]) {
	    			cnt++;
	    		}
	    		else if(map[i][j] == map[i-1][j]+1) {
	    			if(checkUp(cnt) != 0) {
	    				//System.out.println(i+" "+j);
	    				result++;
	    				break;
	    			}
	    			else {
	    				cnt = 1;
	    			}
	    		}
	    		else if(map[i][j] == map[i-1][j]-1) {
	    			if(checkDown(i,j,false) == -1) {
	    				//System.out.println(i+" "+j+"haha");
	    				result++;
	    				break;
	    			}
	    			else {
	    				i += L-1;
	    				cnt = 0; 
	    			}
	    		}
	    		//1단계 이상 차이날 때
	    		else {
	    			result++;
	    			break;
	    		}
	    	}
	    }
	    
	    bw.write(String.valueOf(N+N-result));
	    bw.flush();
	    bw.close();
	    br.close();
	    }
	}
