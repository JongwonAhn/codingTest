package com.example.codingtest.array;

/* 22.10.20
설명
 선생님이 N명의 학생을 일렬로 세워, 학생의 키가 앞에서부터 순서대로 주어질 때,
맨 앞에서 서있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
(어떤 학생이 자기 앞 학생보다 크면 보이고, 작거나 같으면 보이지 않는다)

입력
 첫 줄에 정수 N(5 <= N <= 100,000)이 입력된다.
그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.

출력
 선생님이 볼 수 있는 최대 학생수를 출력한다.
 */

import java.util.Scanner;

public class Array02 {

    public int solution(int[] arr){

        int answer = 1;
        int temp = arr[0];

        for (int i = 0; i < arr.length-1; i++){
            if(temp < arr[i+1]){
                temp = arr[i+1];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array02 test = new Array02();

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(test.solution(arr));
        sc.close();
    }
}
