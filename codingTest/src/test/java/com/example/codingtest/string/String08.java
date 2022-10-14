package com.example.codingtest.string;
/* 22.10.14
설명
 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬 이라고 한다
입력한 문자열이 팰린드롬이면 "YES", 아니면 "NO" 를 출력하는 프로그램을 작성하세요.
단 화문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
알파벳 이외의 문자들은 무시합니다.

입력
 첫 줄에 길이가 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

출력
 첫 번째 줄에 팰린드롬 인지의 결과를 YES 또는 NO 로 출력합니다.
 */

import java.util.Scanner;

public class String08 {

    public String solution(String str){
        String answer = "";
        char[] c = str.toUpperCase().toCharArray();
        int lt = 0;
        int rt = c.length-1;

        while(lt < rt){
            if(c[lt] == c[rt]){
                lt++;
                rt--;
            }else if(!Character.isAlphabetic(c[lt])){
                lt++;
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{
                return answer = "NO";
            }
            answer = "YES";
        }
        return answer;

//        str = str.toUpperCase().replaceAll("[^A-Z]","");
//        System.out.println(str);
//        String temp = new StringBuilder(str).reverse().toString();
//        if(str.equals(temp)){
//            answer = "YES";
//        }else{
//            answer = "NO";
//        }
//        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String08 test = new String08();

        String input = sc.nextLine();
        System.out.println(test.solution(input));
        sc.close();
    }
}


