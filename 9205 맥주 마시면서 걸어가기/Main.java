import java.util.*;
import java.io.*;

class Pos{
	int x;
	int y;
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			int shopNum = Integer.parseInt(br.readLine());
			//int shop[][] = new int[shopNum][2];
			ArrayList<Pos> shop = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j=0; j<shopNum; j++) {
				st = new StringTokenizer(br.readLine());
				shop.add(new Pos(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
			}
			st = new StringTokenizer(br.readLine());
			int ox = Integer.parseInt(st.nextToken());
			int oy = Integer.parseInt(st.nextToken());
			
			Queue<Pos> q = new LinkedList<>();
			q.add(new Pos(x,y));
			boolean flag = false;
			while(!q.isEmpty()) {
				Pos pos = q.poll();
				if(Math.abs(pos.x - ox) + Math.abs(pos.y - oy) <= 1000) flag = true;
				for(int j=0; j<shop.size(); j++) {
					if(Math.abs(shop.get(j).x - pos.x) + Math.abs(shop.get(j).y - pos.y) <=1000) {
						q.add(new Pos(shop.get(j).x,shop.get(j).y));
						shop.remove(j);
					}
				}
			}
			if(flag) bw.write("happy"+"\n");
			else bw.write("sad"+"\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
