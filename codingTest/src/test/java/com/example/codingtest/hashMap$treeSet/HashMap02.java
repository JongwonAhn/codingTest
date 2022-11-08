package com.example.codingtest.hashMap$treeSet;

/* 22.11.08
설명
 Anagram이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다.
 예를 들면 AbaAeCe와 baeeACA 는 알파벳의 나열 순서는 다르지만 그 구성을 살펴보면
 A(2), a(1), b(1), C(1), e(2)로 알파벳과 그 개수가 모두 일치합니다.
 즉 어느 한 단어를 재 배열하면 상대편 단어가 될수있는것을 아나그램이라고 합니다.
 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요.
 아나그램 판별시 대소문자가 구분됩니다.

입력
 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
 단어의 길이는 100을 넘지 않습니다.

출력
 두 단어가 아나그램이면 "YES"를 출력하고, 아니면 "NO"를 출력합니다.
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMap02 {

    public String solution(String word1, String word2){

        String answer = "";
        int len = word1.length();
        HashMap<Integer, Character> map1 = new HashMap<>();
        HashMap<Integer, Character> map2 = new HashMap<>();

        for(int i = 0; i < len; i++){
            map1.put(i, word1.charAt(i));
            map2.put(i, word2.charAt(i));
        }
        for (int x : map1.keySet()) {
                if()
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap02 test = new HashMap02();

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(test.solution(word1, word2));

        sc.close();
    }
}

