package com.example.codingtest.two_pointers$sliding_window;

/* 22.11.01
설명
 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출 기록을 주고 연속된 K일 동안의
 최대 매출액이 얼마인지 구하라고 했습니다.
 만약 N = 10이고 10일간의 매출기록이 아래와 같습니다. 이떄 K = 3이면
 12 15 11 20 25 10 20 19 13 15
 연속된 3일간의 최대 매출액은 11 + 20 + 25 = 56 만원 입니다.

입력
 첫 줄에 N(5 <= N <= 100,000) 과 k(2 <= K <= N)가 주어집니다.
 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500 이하의 음이 아닌 정수입니다.

출력
 첫 줄에 최대 매출액을 출력합니다.
 */

import java.util.Scanner;

public class SlidingWindow01 {

    public int solution(int[] arr, int winSize){

        int answer = 0;
        int temp = 0;
        for(int i = 0; i < winSize; i++){
            temp += arr[i];
        }
        answer = temp;
        for(int i = winSize; i < arr.length; i++){
            temp = temp - arr[i - winSize] + arr[i];
            if(temp > answer){
                answer = temp;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SlidingWindow01 test = new SlidingWindow01();

        int cnt = sc.nextInt();
        int winSize = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(test.solution(arr, winSize));
        sc.close();
    }
}