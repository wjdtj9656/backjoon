import java.io.*;
import java.util.*;

class Enemy{
	int x;
	int y;
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Kill implements Comparable<Kill>{
	int x;
	int y;
	int d;
	public Kill(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.d = d;
	}
	@Override
	public int compareTo(Kill o) {
		// TODO Auto-generated method stub
		if(this.d == o.d) {
			return this.y- o.y;
		}
		return this.d - o.d;
	}
}
public class Main {
	static int N,M,D,map[][],arr[];
	static Queue<Enemy> q;
	static ArrayList<Enemy> list;
	static int result = 0;
	public static void combination(int start, int cnt) {
		if(cnt == 3) {
			for(int i=0; i<3; i++) {
				map[N][arr[i]] = 1;
			}
//			for(int i=0; i<=N; i++) {
//				for(int j=0; j<M; j++) {
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}
			//적 위치 체크?
//			for(int i=0; i<N; i++) {
//				for(int j=0; j<M; j++) {
//					if(map[i][j] == 1) {
//						q.add(new Enemy(i,j));
//					}
//				}
//			}
			int kill = 0;
			while(list.size() != 0) {
				Queue<Enemy> death = new LinkedList<>();
				for(int i=0; i<M; i++) {
					PriorityQueue<Kill> pq = new PriorityQueue<>();
					if(map[N][i] == 1) {
						for(int j=0; j<list.size(); j++) {
							Enemy enemy = list.get(j);
							int distance = Math.abs(enemy.x - N) + Math.abs(enemy.y - i);
							if(distance<=D)
							pq.add(new Kill(enemy.x,enemy.y,distance));
						}
					}
					if(pq.size()>0) {
					Kill temp = pq.peek();
					death.add(new Enemy(temp.x,temp.y));
					}
				}
				int size = death.size();
				//System.out.println(list.size()+"zz1");
				for(int i=0; i<size; i++) {
					Enemy temp = death.poll();
					int size2 = list.size();
					for(int j=0; j<size2; j++) {
						Enemy temp2 = list.get(j);
						if(temp.x == temp2.x && temp.y == temp2.y) {
							list.remove(j);
							kill++;
							break;
						}
					}
				}
				//System.out.println(list.size()+"zz2");
				size = list.size();
				for(int i=0; i<size; i++) {
					Enemy temp = list.remove(0);
					//System.out.println("haha1a "+temp.x+" "+temp.y);
					if(temp.x+1 == N) {
						//System.out.println("Haha"+temp.x+1+" "+temp.y);
						continue;
					}
					else list.add(list.size(),new Enemy(temp.x+1,temp.y));
				}
				//System.out.println(list.size()+"zz3");
			}
			result = Math.max(result, kill);
			for(int i=0; i<3; i++) {
				map[N][arr[i]] = 0;
			}
			initEnemy();
			return;
		}
		
		for(int i=start; i<M; i++) {
			arr[cnt] = i;
			combination(i+1,cnt+1);
		}
	}
	public static boolean check() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] != 0) return true;
			}
		}
		return false;
	}
	public static void initEnemy() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 1) {
					list.add(new Enemy(i,j));
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		map = new int[N+1][M];
		arr = new int[3];
		q = new LinkedList<>();
		list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) {
					list.add(new Enemy(i,j));
				}
			}
		}
		combination(0,0);
		System.out.println(result);
		bw.flush();
		bw.close();
		br.close();
	}
}