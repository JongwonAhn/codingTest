package com.example.codingtest.string;
/* 22.10.12
설명
 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고
출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
 첫 줄에 중복문자가 제거된 문자열을 입력합니다.
 */

import java.util.Scanner;

public class String06 {

    public String solution(String str){
        String answer = "";

        for(int i = 0; i < str.length(); i++){
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String06 test = new String06();

        String input = sc.next();
        System.out.println(test.solution(input));
        sc.close();
    }

}


