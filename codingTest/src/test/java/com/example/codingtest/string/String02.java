package com.example.codingtest.string;
/* 22.10.08
설명
 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

출력
 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */


import java.util.Scanner;

public class String02 {

    public String solution(String str){
        String answer = "";

        for (char x: str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                char a = Character.toLowerCase(x);
                answer += String.valueOf(a);
                //String + char 에도 자동으로 String으로 형변환 한다.
            }else if(Character.isLowerCase(x)){
                char a = Character.toUpperCase(x);
                answer += String.valueOf(a);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String02 test = new String02();

        String input = sc.next();

        System.out.println(test.solution(input));
        sc.close();
    }
}
