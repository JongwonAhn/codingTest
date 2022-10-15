package com.example.codingtest.string;
/* 22.10.15
설명
 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로
자연수를 만듭니다. 만약 "tge0a1h205er"에서 숫자만 추출하면 0, 1, 2, 0, 5 이고
이것을 자연수를 만들면 1205가 됩니다.
추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

입력
 첫 줄에 숫자가 쓰인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.

출력
 첫 줄에 자연수를 출력합니다.
 */

import java.util.Scanner;

public class String09 {

    public int solution(String str) {
        int answer = 0;
        String temp = "";
        char[] c = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(c[i])){
                temp = temp + c[i];
            }
        }
        answer = Integer.parseInt(temp);
        return answer;

//        for(char c : str.toCharArray()){
//            if(c >= 48 && c <= 57 ){
//                answer = answer * 10 + (c-48);
//            }
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String09 test = new String09();

        String input = sc.nextLine();
        System.out.println(test.solution(input));
        sc.close();
    }
}


