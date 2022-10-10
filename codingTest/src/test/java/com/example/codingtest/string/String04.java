package com.example.codingtest.string;
/* 22.10.10
설명
 N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요

입력
 첫 줄에 자연수 N(3<= N <= 20)이 주어집니다.

출력
 N개의 단어를 입력된 순서대로 한줄에 하나씩 뒤집어서 출력합니다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class String04 {

    public ArrayList<String> solution(String[] inputWords){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : inputWords ) {
            char[] c = x.toCharArray();
            int lt = 0, rt = c.length-1;
            while(lt < rt){
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(c);
            answer.add(temp);
        }
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String04 test = new String04();

        int inputN = sc.nextInt();
        String[] inputWords = new String[inputN];

        for(int i = 0; i < inputN; i++){
            inputWords[i] = sc.next();
        }
        for (String x: test.solution(inputWords)) {
            System.out.println(x);
        }
        sc.close();
    }
}
