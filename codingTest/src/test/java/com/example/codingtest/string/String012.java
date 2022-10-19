package com.example.codingtest.string;
/* 22.10.19
설명
 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
알파벳 한 문자마다 #또는 *이 일곱 개로 구성
1. #은 이진수의 1로, *은 이진수의 0으로 변환
2. 바뀐 2진수를 10진수화
3. 아스키 번호가 65문자로 변환.

입력
 첫 줄에는 보낸 문자의 개수(10을 넘지 않습니다)가 입력된다. 다음 줄에는
문자의 개수의 일곱 배 만큼의 # 또는 * 신호가 입력됩니다. 현수는 항상 대문자로
해석할 수 있는 신호를 보낸다고 가정합니다.
#****###**#####**#####**##**

출력
 영희가 해석한 문자열을 출력합니다.
 */

import java.util.Scanner;

public class String012 {

    public String solution(int num, String str) {
        String answer = "";
        int count = 0;

        str = str.replace("#", "1")
                 .replace("*", "0");

        for(int i = 0; i < num; i++) {
            String temp = str.substring(count, count += 7);
            int temp2 = Integer.parseInt(temp, 2);
            answer += (char) temp2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String012 test = new String012();

        int inputN = sc.nextInt();
        String inputStr = sc.next();
        System.out.println(test.solution(inputN, inputStr));

        sc.close();
    }
}
















