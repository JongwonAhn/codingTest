package com.example.codingtest.hashMap$treeSet;

/* 22.11.16
설명
 S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요
 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 S문자열의 길이는 10,000을 넘지 않으며 T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
 S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMap04 {

    public int solution(String s, String t){

        int answer = 0;
        int lt = 0;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0; i<t.length(); i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length()-1; i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int rt=t.length()-1; rt<s.length(); rt++){

            mapS.put(s.charAt(rt), mapS.getOrDefault(s.charAt(rt), 0)+1);

            if(mapS.equals(mapT)) {
                answer++;
            }
            mapS.put(s.charAt(lt), mapS.get(s.charAt(lt))-1);
            if(mapS.get(s.charAt(lt)) == 0){
                mapS.remove(s.charAt(lt));
            }
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap04 test = new HashMap04();

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(test.solution(s, t));

        sc.close();
    }
}

