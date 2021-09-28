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
    	//��Ƽ�� ���� ���� 100�� �̹Ƿ� �迭 101����.
    	boolean[] use = new boolean[101];
    	//�����.
    	int count = 0;
    	//���� ���� �ִ� �ڵ� ��
    	int put = 0;
    	
    	for(int i=0; i<k; i++) {
    		int temp = arr[i];
    		//���� �ش� �ڵ带 ��� ���ϰ� ���� �� (����ϰ� ������ ��ŵ)
    		if(!use[temp]) {
    			//��Ƽ�� ���� ����ŭ ä���ش�.
    			if(put < n) {
    				use[temp] = true;
    				put++;
    			}
    			//��Ƽ�� ������ ���ڶ���.
    			else {
    				ArrayList<Integer> list = new ArrayList<>();
    				//use[arr[j]] => ���� ������� �ڵ�
    				//!list.contains(arr[j]) => ����Ʈ�� �������� �ʴ� ��.(�ߺ����� ���ֱ� ����)
    				for(int j=i; j<k; j++) {
    					if(use[arr[j]] && !list.contains(arr[j])) {
    						//��, ���� ������̸� �����ε� �����ڵ��� �̹� �� ���� �ڵ带 �߰���.
    						list.add(arr[j]);
    					}
    				}
    				
    				//���� ������̸� �����ε� �����ڵ尡 ��Ƽ�� ���ۼ����� ���� ��
    				if(list.size() < n) {
    					for(int j=0; j<use.length; j++) {
    						//����Ʈ�� ���� ���� ������ΰ��� �̴´�.use[j] = false
    						if(use[j] && !list.contains(j)) {
    							use[j] = false;
    							break;
    						}
    					}
    				}
    				//���� ������̸� �����ε� �����ڵ尡 ��Ƽ�� ���ۺ��� Ŭ �� (������ ���ο� �ڵ带 �žƾ��ϴ�)
    				//=>����Ʈ ���������� �����մϴ�.(����Ʈ�� ������� �����Ƿ� �׸��� ����)
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