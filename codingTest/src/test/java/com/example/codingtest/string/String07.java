package com.example.codingtest.string;
/* 22.10.13
설명
 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다
문자열이 입력되면 해당 문자열이 화문 문자열이면 "YES",
아니면 "NO"를 출력하는 프로그램을 작성하세요.
단 화문 검사를 할 때 대소문자를 구분하지 않습니다.

입력
 첫 줄에 길이가 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

출력
 첫 번째 줄에 화문 문자열인지의 결과를 YES 또는 NO 로 출력합니다.
 */

import java.util.Scanner;

public class String07 {

    public String solution(String str){
        String answer = "";
        char[] c = str.toUpperCase().toCharArray();
        int lt = 0;
        int rt = c.length-1;

        while(lt < rt){
            if(c[lt] == c[rt]){
                lt++;
                rt--;
            }else{
                return answer = "NO";
            }
            answer = "YES";
        }

//        String temp = new StringBuilder(str).reverse().toString();
//        if(temp.equalsIgnoreCase(str)){
//            answer = "YES";
//        }else{
//            answer = "NO";
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String07 test = new String07();

        String input = sc.next();
        System.out.println(test.solution(input));
        sc.close();
    }
}


