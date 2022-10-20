package com.example.codingtest.array;

/* 22.10.20
설명
 A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력,
B가 이기면 B를 출력, 비길 경우에는 D를 출력합니다.
가위바위보 정보는 1:가위 2:바위 3:보 로 정한다. 예를들어 N=5일경우
 횟수   1 2 3 4 5
A정보   2 3 3 1 3
B정보   1 1 2 2 3
승자    A B A B D  이며, 각 회를 누가 이겼는디 출력하는 프로그램을 작성하라.

입력
 첫 번째 줄에 게임 횟수인 자연수 N(1 <= N <= 100)이 주어집니다.
 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

출력
 각 줄에 각 회의 승자를 출력합니다.
 */

import java.util.Scanner;

public class Array03 {

    public String solution(int[] arrA, int[] arrB){

        String answer = "";

        for(int i = 0; i < arrA.length; i++){
            if(arrA[i] == 1 && arrB[i] == 3 ||
                arrA[i] == 2 && arrB[i] == 1 ||
                arrA[i] == 3 && arrB[i] == 2){
                answer += "A";
            }else if(arrA[i] == arrB[i]){
                answer += "D";
            }else{
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array03 test = new Array03();

        int num = sc.nextInt();
        int[] arrA = new int[num];
        int[] arrB = new int[num];

        for(int i = 0; i < num; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++){
            arrB[i] = sc.nextInt();
        }

        String answer = test.solution(arrA, arrB);

        for(int i = 0; i < answer.length(); i++){
            System.out.println(answer.charAt(i));
        }
        sc.close();
    }
}
