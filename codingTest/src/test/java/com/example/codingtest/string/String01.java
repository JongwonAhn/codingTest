package com.example.codingtest.string;
/* 22.10.07
설명
 한개의 문자열을 입력받고 특정 문자를 입력받아 해당 특정 문자가 입력받은
문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소구분은 하지 않으며 뭄ㄴ자열의 길이는 100을 넘지 않음.

입력
 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있다.

출력
 첫 줄에 해당 문자의 개수를 출력한다.
 */


import java.util.Scanner;

public class String01 {

    public int solution(String str, char t){
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == t){
//                answer++;
//            }
//        }

        for (char x : str.toCharArray()){
            if(x == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String01 test = new String01();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        //Scanner는 String으로 받으므로 charAt(0)을 사용하여 한글자만 받음.
        char c = sc.next().charAt(0);

        System.out.println(test.solution(str, c));

        sc.close();
    }
}
