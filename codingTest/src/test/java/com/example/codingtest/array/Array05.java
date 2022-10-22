package com.example.codingtest.array;

/* 22.10.22
설명
 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19 로 총 8개 입니다.
제한시간은 1초 입니다

입력
 첫 줄에 자연수의 개수 N (2 <= N <= 200,000)이 주어집니다


출력
 첫 줄에 소수의 개수를 출력합니다
 */


import java.util.Scanner;

public class Array05 {

    public int solution(int num){

        int answer = 0;
        int[] arr = new int[num+1];

        for(int i = 2; i <= num; i++){
            if(arr[i] == 0){
                answer++;
                for(int j = i; j <= num; j= j+i){
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array05 test = new Array05();

        int num = sc.nextInt();

        System.out.println(test.solution(num));
        sc.close();
    }
}