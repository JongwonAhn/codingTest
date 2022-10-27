package com.example.codingtest.array;

/* 22.10.27
설명
 선생님은 올해 6학년 1반 담임음 맡게 되었다.
 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후 정싱 반장을 선출하려한다
 그는 자기반 학생중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이였던 사람이
 가장 많은 학생을 임시 반장으로 정하려 한다
 그래서 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했는지 나타내는 표를 만들었다.
 예를들어 학생수가 5명일때의 표를 살펴보자
        1학년  2학년  3학년  4학년  5학년
1번학생   2      3     1     7     3
2번학생   4      1     9     6     8
3번학생   5      5     2     4     4
4번학생   6      5     2     6     7
5번학생   8      4     2     2     2
위 같은 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반 이였고,
3번 학생 및 5번 학생과 3학년때 같은반 이였으며 2번 학생과 4학년 때 같은 반
이였음을 알수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
같은 반이였던 사람은 2번학생, 3번학생, 5번학생으로 모두 3명이다
이 예시에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다
각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때 임시 반장을 정하는 프로그램을 작성하세요

입력
 첫째 줄에는 반의 학생수를 나타내는 정수가 주어진다. 학생 수는 3이상 1000이하이다
 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속해있는지를
 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다. 주어지는 정수는 모두 1이상 9이하의 정수이다

출력
 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다
 단 임시반장이 될수있는 학생이 여러명인 경우에는 그중 가장 작은 번호만 출력한다
 */


import java.util.Scanner;

public class Array011 {

    public int solution(int[][] arr){

        int answer = 0;
        int n = arr.length-1;
        int max = 0;

        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array011 test = new Array011();

        int num = sc.nextInt();
        int[][] arr = new int[num+1][6];

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= 5; j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        System.out.println(test.solution(arr));

        sc.close();
    }
}