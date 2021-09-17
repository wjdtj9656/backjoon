import java.util.*;
import java.io.*;

class Node{
	int x;
	int y;
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
    private static int r,c;
    private static char[][] graph;

    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    private static boolean flag;
    private static int result = 1;
    static void bfs() {
    	Queue<Node> q = new LinkedList<>();
    	for(int i=0; i<r; i++) {
    		for(int j=0; j<c; j++) {
    			if(graph[i][j] == 'W') {
    				q.add(new Node(i,j));
    			}
    		}
    	}
    	while(!q.isEmpty()) {
    		Node node = q.poll();
    		int nodex = node.x;
    		int nodey = node.y;
    		
    		for(int i=0; i<4; i++) {
    			int nx = nodex + dx[i];
    			int ny = nodey + dy[i];
    			
    			if(nx>=0 && nx<r && ny>=0 && ny<c) {
    				if(graph[nx][ny] =='S') {
    					result = 0;
    					return;
    				}
    				else if(graph[nx][ny] =='.') {
    					graph[nx][ny] = 'D';
    					
    				}
    			}
    		}
    	}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        graph = new char[r][c];
        

        for(int i=0;i<r;i++) {
            String str = br.readLine();
            for(int j=0;j<c;j++) {
                graph[i][j] = str.charAt(j);
            }
        }
        bfs();
        bw.write(String.valueOf(result)+"\n");
        if(result == 1) {
        for(int i=0; i<r; i++) {
        	for(int j=0; j<c; j++) {
        		bw.write(graph[i][j]);
        	}
        	bw.write("\n");
        }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

