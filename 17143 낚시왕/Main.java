import java.util.*;
import java.io.*;

class Shark implements Comparable<Shark>{
	int r;
	int c;
	int s;
	int d;
	int z;
	public Shark(int r, int c, int s, int d, int z) {
		this.r = r;
		this.c = c;
		this.s = s;
		this.d = d;
		this.z = z;
	}
	@Override
	public int compareTo(Shark o) {
		// TODO Auto-generated method stub
		return o.z-this.z;
	}
}
public class Main {
	static Shark map[][];
	static int R,C;
	static int result = 0;
	static PriorityQueue<Shark> pq;
	static ArrayList<Shark> list;
	static int dx[] = {0,-1,1,0,0};
	static int dy[] = {0,0,0,1,-1};
	public static void killFish(int c) {
		for1:
		for(int i=1; i<=R; i++) {
			if(map[i][c] != null) {
				for(int j=0; j<list.size(); j++) {
					if(list.get(j).r == map[i][c].r && list.get(j).c == map[i][c].c) {
						result += map[i][c].z;
						list.remove(j);
						map[i][c] = null;
						break for1;
					}
				}
			}
		}
	}
	public static void moveShark() {
		for(int i=0; i<list.size(); i++) {
			Shark shark = list.remove(0);
			map[shark.r][shark.c] = null;
			int size = 0;
			if(shark.d == 1 || shark.d == 2) {
				size = shark.s % ((R-1)*2);
			}
			else {
				size = shark.s %((C-1)*2);
			}
			while(size --> 0) {
				if(shark.r == R && shark.d == 2) {
					shark.d = 1;
				}
				else if(shark.c == 1 && shark.d==4) {
					shark.d = 3;
				}
				else if(shark.c == C && shark.d == 3) {
					shark.d = 4;
				}
				else if(shark.r == 1 && shark.d ==1) {
					shark.d = 2;
				}
				else if(shark.r == R && shark.c == 1 && shark.d == 4) {
					shark.d = 3;
				}
				else if(shark.r == R && shark.c == C && shark.d == 3 ) {
					shark.d = 4;
				}
				else if(shark.r == R && shark.c == 1 && shark.d == 2) {
					shark.d = 1;
				}
				else if(shark.r == R && shark.c == C && shark.d == 2 ) {
					shark.d = 1;
				}
				else if(shark.r ==1 && shark.c == 1 && shark.d == 4) {
					shark.d = 3;
				}
				else if(shark.r == 1 && shark.c == C && shark.d == 3) {
					shark.d = 4;
				}
				else if(shark.r ==1 && shark.c == 1 && shark.d == 1) {
					shark.d = 2;
				}
				else if(shark.r == 1 && shark.c == C && shark.d == 1) {
					shark.d = 2;
				}
				shark.r = shark.r + dx[shark.d];
				shark.c = shark.c + dy[shark.d];
			}
			
			list.add(shark);
		}
		Collections.sort(list);

		for(int i=0; i<list.size(); i++) {
			Shark shark = list.get(i);
			if(map[shark.r][shark.c] != null) {
				list.remove(i--);
			}
			else {
				map[shark.r][shark.c] = shark;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		pq = new PriorityQueue<>();
		map = new Shark[R+1][C+1];
		list = new ArrayList<>();
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			//pq.add(new Shark(r,c,s,d,z));
			list.add(new Shark(r,c,s,d,z));
			map[r][c] = new Shark(r,c,s,d,z);
		}
		for(int pos=1; pos<=C; pos++) {
			killFish(pos);
			moveShark();
		}
		System.out.println(result);
		br.close();
	}
}
