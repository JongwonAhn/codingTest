package com.example.codingtest.string;

class Parent{
    public int compute(int num){
        if(num <= 1) return num;
        return compute(num -1) + compute(num -2);
    }
}

class Child extends Parent {
    public int compute(int num) {
        if (num <= 1) return num;
        return compute(num - 1) + compute(num - 3);
    }
}

class test{
    int a(int num){
        return num;
    }
}



public class Test01 {

    public static void main(String[] args) {

//         Parent obj = new Child();
//        System.out.println(obj.compute(4));

        test t1 = new test();

        t1.a(1);
    }
}



