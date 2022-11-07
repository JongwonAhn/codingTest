package com.example.codingtest.two_pointers$sliding_window;

/* 22.11.02
설명
 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서
 최대 k번을 0을 1로 변경할수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서
 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 만약 길이가 14인 다음과 같은 수열이 주어지고 k = 2라면
 1 1 0 0 1 1 0 1 1 0 1 1 0 1 여러분이 만들수 있는 1비 연속된 연속 부분수열은
 1 1 0 0[1 1 1 1 1 1 1 1]0 1 이며 그 길이는 8 입니다.

입력
 첫 번째 줄에 수열의 길이인 자연수 N(5 <= N < 100,000)이 주어집니다.
 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.

출력
 첫 줄에 최대 길이를 출력하세요.
 */

import java.util.Scanner;

public class TwoPointers04 {

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
        TwoPointers04 test = new TwoPointers04();

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