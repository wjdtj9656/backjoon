import java.io.*;
import java.util.*;

public class Main {
	static int H;
	static int W;
	static int map[][];
	static int result;
	public static void search(int line) {
		boolean flag = false;
		int cnt = 0;
		//�޾� �� ���� �� �˻�
		for(int i=0; i<W; i++) {
			//ó������ �� ������ ��
			if(map[line][i] == 1 && !flag) flag = true;
			//�� ���� �Ŀ� ���� ������ ��
			else if(map[line][i]==0 && flag) {
				cnt++;
			}
			//���� �����ٰ� ���� �ٽ� ������ ��
			else if(map[line][i]==1 && flag) {
				//���� �����µ� ���� ĭ�� 0�̿��� ��
				if(map[line][i-1]==0) {
					result += cnt;
					cnt = 0;
					flag = false;
				}
				//���� �����ٰ� ���� ������ �� ������ �ٷ� ������ ��
				if(i<W-1) {
					if(map[line][i+1] == 0) {
						flag = true;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    H = Integer.parseInt(st.nextToken());
	    W = Integer.parseInt(st.nextToken());
	    map = new int[H][W];
	    st = new StringTokenizer(br.readLine());
	    
	    //�Է¹����� ������
	    for(int i=0; i<W; i++) {
	    	int temp = Integer.parseInt(st.nextToken());
	    	for(int j=H-1; j>=0; j--) {
	    		if(temp == 0) break;
	    		map[j][i] = 1;
	    		temp--;
	    	}
	    }
//	    for (int i = 0; i < map.length; i++) {
//	    	System.out.println();
//	    	for (int j = 0; j < map[i].length; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//		}
	    //���پ� �˻�
	    for(int i=0; i<H; i++) {
	    	search(i);
	    }
	    bw.write(String.valueOf(result));
	    br.close();
	    bw.flush();
	    bw.close();
	    }
	}
