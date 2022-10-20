package com.example.codingtest.array;

/* 22.10.20
설명
 N(1<= N <= 100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는
프로그램을 작성하세요. (첫 번째 수는 무조건 출력한다)

입력
 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

출력
 첫 줄에 해당 문자의 개수를 출력한다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Array01 {

    public ArrayList<Integer> solution(int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){

                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array01 test = new Array01();

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        for (int x: test.solution(arr)) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
