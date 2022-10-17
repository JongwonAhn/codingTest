package com.example.codingtest.string;
/* 22.10.17
설명
 알파벳 대문자로 이루어진 문자열을 압축받아 같응ㄴ 문자가 연속적으로 반복되는 경우
반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는
프로그램을 작성하시오. 단 반복횟수가 1인 경우 생략합니다

입력
 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
 첫 줄에 압축된 문자열을 출력한다.
 */

import java.util.Scanner;

public class String011 {

    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int count = 1;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                answer += str.charAt(i);
                if(count > 1){
                    answer += Integer.toString(count);
                    count = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String011 test = new String011();

        String input = sc.next();
        System.out.println(test.solution(input));

        sc.close();
    }
}


