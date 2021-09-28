import java.util.*;
import java.io.*;

class Main {
	
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int arr[] = new int[k];
    	st= new StringTokenizer(br.readLine());
    	for(int i=0; i<k; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	//멀티탭 구멍 수가 100개 이므로 배열 101까지.
    	boolean[] use = new boolean[101];
    	//결과값.
    	int count = 0;
    	//현재 꼽혀 있는 코드 수
    	int put = 0;
    	
    	for(int i=0; i<k; i++) {
    		int temp = arr[i];
    		//현재 해당 코드를 사용 안하고 있을 때 (사용하고 있으면 스킵)
    		if(!use[temp]) {
    			//멀티탭 구멍 수만큼 채워준다.
    			if(put < n) {
    				use[temp] = true;
    				put++;
    			}
    			//멀티탭 구멍이 모자랄때.
    			else {
    				ArrayList<Integer> list = new ArrayList<>();
    				//use[arr[j]] => 현재 사용중인 코드
    				//!list.contains(arr[j]) => 리스트에 존재하지 않는 값.(중복으로 값넣기 방지)
    				for(int j=i; j<k; j++) {
    					if(use[arr[j]] && !list.contains(arr[j])) {
    						//즉, 현재 사용중이며 앞으로도 나올코드중 이미 안 넣은 코드를 추가함.
    						list.add(arr[j]);
    					}
    				}
    				
    				//현재 사용중이며 앞으로도 나올코드가 멀티탭 구멍수보다 낮을 때
    				if(list.size() < n) {
    					for(int j=0; j<use.length; j++) {
    						//리스트에 없는 것중 사용중인것을 뽑는다.use[j] = false
    						if(use[j] && !list.contains(j)) {
    							use[j] = false;
    							break;
    						}
    					}
    				}
    				//현재 사용중이며 앞으로도 나올코드가 멀티탭 구멍보다 클 때 (하지만 새로운 코드를 꼽아야하는)
    				//=>리스트 마지막값을 제거합니다.(리스트를 순서대로 넣으므로 그리디 성립)
    				else {
    					int remove = list.get(list.size()-1);
    					use[remove] = false;
    				}
    				use[temp] = true;
    				count++;
    			}
    		}
    	}
    	bw.write(String.valueOf(count));
    	br.close();
    	bw.flush();
    	bw.close();
    }
}