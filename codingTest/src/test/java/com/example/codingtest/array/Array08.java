package com.example.codingtest.array;

/* 22.10.24
설명
 N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
같은 점수가 입력될 경우 높은 점수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 92점이 3명이 존재하면
1등이 3명이고 그 다음 학생은 4등이 된다

입력
 첫 줄에 N(3 <= N <= 100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.


출력
 입력된 순서대로 등수를 출력한다.
 */


import java.util.Scanner;

public class Array08 {

    public int[] solution(int[] arr){

        int num = arr.length;
        int answer[] = new int[num];

        for(int i = 0; i < num; i++){
            int cnt = num + 1;
            for(int j = 0; j < num; j++){
                if(arr[i] >= arr[j]){
                    cnt--;
                }
            }
            answer[i] += cnt;
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array08 test = new Array08();

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : test.solution(arr)) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}