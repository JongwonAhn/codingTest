package com.example.codingtest.array;

/* 22.10.28
설명
 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서
  모두 B학생보다 등수가 앞서야 합니다.
 M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇가지 인지 출력하는 프로그램을 작성하세요.

입력
 첫 번째 줄에 반 학생수 N(1 <= N <= 20)과 M(1 <= M <= 10)이 주어진다.
 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다.
  학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다
 만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2 로 입력되었다면
  3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.

출력
 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
 */

import java.util.Scanner;

public class Array012 {

    public int solution(int[][] arr){

        int answer = 0;
        int students = arr[0].length;
        int num = arr.length;

        for(int i = 1; i <= students; i++){
            for(int j = 1; j <= students; j++){
                int cnt = 0;
                for(int k = 0; k < num; k++ ){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < students; s++){
                        if(arr[k][s] == i)pi = s;
                        if (arr[k][s] == j)pj = s;
                        }
                    if(pi < pj) cnt++;
                    }
                if(cnt==num){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array012 test = new Array012();

        int students = sc.nextInt();
        int num = sc.nextInt();
        int[][] arr = new int[num][students];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < students; j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        System.out.println(test.solution(arr));

        sc.close();
    }
}