package com.example.codingtest.array;

/* 22.10.25
설명
 5x5 격자판에 아래와 같이 숫자가 적혀있습니다.
 10 13 10 12 15
 12 30 30 28 11
 11 25 50 53 15
 19 27 29 37 27
 19 13 30 13 19
 NxN개의 격자판이 주어지면 각 행의 합, 각 열의합, 두 대각선의 합 중 가장 큰 합을 출력합니다.

입력
 첫 줄에 자연수 N이 주어진다.(2 <= N <= 50)
 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
 최대 합을 출력합니다.
 */


import java.util.Scanner;

public class Array09 {

    public int solution(int[][] arr){

        int answer = 0;
        int temp1, temp2;

        for(int i = 0; i < arr.length; i++){
                temp1 = temp2 = 0;
            for(int j = 0; j < arr.length; j++){
                temp1 += arr[i][j];
                temp2 += arr[j][i];
                if(temp1 > answer){answer = temp1;}
                if(temp2 > answer){answer = temp2;}
            }
        }
        temp1 = temp2 = 0;
        for(int i = 0; i < arr.length; i++){
                temp1 += arr[i][i];
                temp2 += arr[i][arr.length-i-1];
                if(temp1 > answer) {answer = temp1;}
                if(temp2 > answer) {answer = temp2;}
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array09 test = new Array09();

        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        System.out.println(test.solution(arr));

        sc.close();
    }
}