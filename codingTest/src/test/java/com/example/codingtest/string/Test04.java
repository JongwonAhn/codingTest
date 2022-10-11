package com.example.codingtest.string;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test04 {

    public static void main(String[] args) {

//        Test05 test05 = new Test05();
//        test05.sum("T", "E");

        ArrayList<String> arr = new ArrayList<>();
        arr.add("가");
        arr.add("나");
        arr.add("다");
        System.out.println(arr);

        LinkedList<String> list = new LinkedList<>();
        list.add("가");
        list.add("나");
        list.add("다");
        System.out.println(list);
    }
}

class Test05{

    static private void instance(){

    }

    void sum(String...strings){
        System.out.println(strings.length);
    }
}

