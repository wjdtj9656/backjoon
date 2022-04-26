import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		//버퍼생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//eight, five, four, nine, one, seven, six, three , two, zero 순으로 출력해야함
		
		//StringTokenizer를 이용해서 숫자 M과 N을 입력받음
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		//숫자 -> 문자열로 바꿔줘서 리스트에 담을 것이므로 리스트 생성
		ArrayList<String> list = new ArrayList<>();
		
		//M ~ N까지 반복문
		for(int i=M; i<=N; i++) {
			//숫자의 십의 자리
			int num1 = i/10;
			
			//숫자의 일의 자리
			int num2 = i%10;
			
			//숫자 => 문자 담을 변수 temp
			String temp = "";
			
			//num1이 0이 아니면 10이상이라는 뜻(두자리 숫자)
			if(num1 != 0) {
				//십의 자리 숫자를 처리해서 문자로 바꿔 temp에 넣음 ( num1 !=0 일때므로 case 0은 존재하지 않음)
				switch(num1) {
				case 1: temp+="one"; break;
				case 2: temp+="two"; break;
				case 3: temp+="three"; break;
				case 4: temp+="four"; break;
				case 5: temp+="five"; break;
				case 6: temp+="six"; break;
				case 7: temp+="seven"; break;
				case 8: temp+="eight"; break;
				case 9: temp+="nine"; break;
				}
				//일의 자리 숫자를 처리해서 문자로 바꿔 temp에 넣음
				switch(num2) {
				case 0: temp+=" zero"; break;
				case 1: temp+=" one"; break;
				case 2: temp+=" two"; break;
				case 3: temp+=" three"; break;
				case 4: temp+=" four"; break;
				case 5: temp+=" five"; break;
				case 6: temp+=" six"; break;
				case 7: temp+=" seven"; break;
				case 8: temp+=" eight"; break;
				case 9: temp+=" nine"; break;
				}
			}
			//10보다 작은 수, 즉 한자리 숫자들을 문자로 바꿔 temp에 넣어줌
			else {
				switch(num2) {
				case 1: temp+="one"; break;
				case 2: temp+="two"; break;
				case 3: temp+="three"; break;
				case 4: temp+="four"; break;
				case 5: temp+="five"; break;
				case 6: temp+="six"; break;
				case 7: temp+="seven"; break;
				case 8: temp+="eight"; break;
				case 9: temp+="nine"; break;
				}
			}
			//숫자 => 문자열 변환이 끝났으므로 리스트에 넣어줌.
			list.add(temp);
		}//M~N까지 모든 숫자=>문자 변환이 끝난 상태
		
		//리스트에 있는 모든 문자들을 정렬해줌(문제에서 원하는 값)
		Collections.sort(list);
		
		//출력을 위한 스트링빌더 생성
		StringBuilder sb = new StringBuilder();
		
		//리스트 안에 있는 값들을 다시 문자열 => 숫자로 변환 해줌
		for(int i=1; i<=list.size(); i++) {
			
			//리스트의 값 하나씩 꺼내기( 두자리가 넘어가는 숫자는 두번 꺼내야 하므로 StringTokenizer 사용)
			st = new StringTokenizer(list.get(i-1));
			
			//숫자를 담을 임시 변수 num
			String num="";
			
			//문자열에서 숫자 하나씩 빼기(일의 자리 숫자라면 한번 빼고, 십의자리 숫자라면 두번 뺌)
			while(st.hasMoreTokens()) {
				
				//임시 temp 변수
				String temp = st.nextToken();
				
				//temp에 넘어온 값에 따라 숫자를 지정해줌
				switch(temp) {
				case "zero":num+="0"; break;
				case "one":num+="1"; break;
				case "two":num+="2"; break;
				case "three":num+="3"; break;
				case "four":num+="4"; break;
				case "five":num+="5"; break;
				case "six":num+="6"; break;
				case "seven":num+="7"; break;
				case "eight":num+="8";break;
				case "nine":num+="9";break;
				}
			}
			//담겨진 숫자를 sb에 넣음
			sb.append(num+" ");
			
			//문제에서 숫자 10개마다 띄어쓰라 햇으므로 10개마다 "\n"추가
			if(i%10 == 0) sb.append("\n");
		}
		
		//결과출력
		System.out.println(sb.toString());
		//버퍼닫기
		br.close();
	}
}
