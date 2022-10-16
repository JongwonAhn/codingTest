package com.example.codingtest.string;
/* 22.10.16
설명
 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를
출력하는 프로그램을 작성하세요.

입력
 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */

import java.util.Scanner;

public class String010 {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i]= p;
            }
        }
        p = 1000;
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == c){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String010 test = new String010();

        String inputString = sc.next();
        char inputC = sc.next().charAt(0);

        for(int x : test.solution(inputString, inputC)){
            System.out.print(x + " ");
        }
        sc.close();
    }
}


