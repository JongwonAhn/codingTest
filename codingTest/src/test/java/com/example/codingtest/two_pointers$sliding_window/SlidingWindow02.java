package com.example.codingtest.two_pointers$sliding_window;

/* 22.11.01
설명
 N개의 수로 이루어진 수열이 주어집니다.
 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요
 만약 N = 8, M = 6 이고 수열이 다음과 같다면
 1 2 1 3 1 1 1 2
 합이 6이 되는 연속부분수열은 {2, 1, 3},{1, 3, 1, 1},{3, 1, 1, 1}로 총 3가지 입니다.

입력
 첫째 줄에 N(1 <= N <= 100,000), M(1 <= M <= 100,000,000)이 주어진다.
 수열의 원소값은 1,000 을 넘지 않는 자연수 이다.

출력
 첫 줄에 최대 매출액을 출력합니다.
 */

import java.util.Scanner;

public class SlidingWindow02 {

    public int solution(int[] arr, int Size){

        int answer = 0;
        int len = arr.length;
        int start = 0, sum = 0;

        for(int end = 0; end < len; end++){
            sum += arr[end];
            if(sum == Size){
                answer++;
            }
            while (sum > Size){
                sum -= arr[start];
                start++;
                if(sum == Size){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SlidingWindow02 test = new SlidingWindow02();

        int cnt = sc.nextInt();
        int Size = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(test.solution(arr, Size));
        sc.close();
    }
}