package com.example.codingtest.array;

/* 22.10.21
설명
 피보나치 수열을 출력한다.
피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

입력
 첫 줄에 총 항수 (3 <= N <= 45)이 입력된다.

출력
 각 줄에 각 회의 승자를 출력합니다.
 */

import java.util.Scanner;

public class Array04 {

    public int[] solution(int num){

        int[] answer;
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
//        int a = 1, b = 1, c;
//        System.out.println(a + " " + b + " ");
//        for(int i = 2; i < n; i++){
//            c = a + b;
//            System.out.println(c + " ");
//            a = b;
//            b = c;
//        }
        return answer = arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array04 test = new Array04();

        int num = sc.nextInt();

        for (int x: test.solution(num)) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
