package com.example.codingtest.two_pointers$sliding_window;

/* 22.10.30
설명
 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐
 출력하는 프로그램을 작성하세.

입력
 첫 번째 줄에 첫 번째 배열의 크기 N(1 <= N <= 100)이 주어집니다
 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다
 세 번째 줄에 두 번째 배열의 크기 M(1 <= M <= 100)이 주어집니다
 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointers01 {

    public ArrayList<Integer> solution(int[] arrA,int[] arrB){

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        int lenA = arrA.length, lenB = arrB.length;

        while (p1 < lenA && p2 < lenB){
            if(arrA[p1] < arrB[p2]){
                answer.add(arrA[p1++]);
            }else{
                answer.add(arrB[p2++]);
            }
        }
        while (p1 < lenA){
            answer.add(arrA[p1++]);
        }
        while (p2 < lenB){
            answer.add(arrB[p2++]);
        }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TwoPointers01 test = new TwoPointers01();

        int arrACnt = sc.nextInt();
        int[] arrA = new int[arrACnt];
        for(int i = 0; i < arrACnt; i++){
            arrA[i] = sc.nextInt();
        }
        int arrBCnt = sc.nextInt();
        int[] arrB = new int[arrBCnt];
        for(int i = 0; i < arrBCnt; i++){
            arrB[i] = sc.nextInt();
        }
        for (int x : test.solution(arrA, arrB)) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}