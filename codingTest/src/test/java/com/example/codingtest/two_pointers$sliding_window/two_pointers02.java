package com.example.codingtest.two_pointers$sliding_window;

/* 22.10.31
설명
 A, B 두 집합이 주어지면 두 집합의 공통 원소를 추출하여
 오름차순으로 출력하는 프로그램을 작성하세요.

입력
 첫 번째 줄에 집합 A의 크기 N(1 <= N <= 30,000)이 주어집니다
 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 첫 번째 줄에 집합 A의 크기 N(1 <= N <= 30,000)이 주어집니다
 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 각 집합의 원소는 1,000,000,000 이하의 자연수 입니다.

출력
 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class two_pointers02 {

    public ArrayList<Integer> solution(int[] arrA,int[] arrB){

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        int lenA = arrA.length, lenB = arrB.length;
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        while(p1 < lenA && p2 < lenB){
            if(arrA[p1] < arrB[p2]){
                p1++;
            }else if(arrA[p1] > arrB[p2]){
                p2++;
            }else{
                answer.add(arrA[p1]);
                p1++;
                p2++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        two_pointers02 test = new two_pointers02();

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