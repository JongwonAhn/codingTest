package com.example.codingtest.string;

public class Test07 {

    public static void main(String[] args) {

//        Parent1 p = new Parent1();
//        p.m();
//        System.out.println("----");
//        Parent1 c = new Child1();
//        c.m();
//        System.out.println("----");
//        Child1 c2 = new Child1();
//        c2.m();
//        c2.m1("Test");
        Parent2 c = new child2(1);
    }
}

class Parent1{
    public Parent1() {
        System.out.println("A");
    }
    public void m(){
        System.out.println("C");
    }
    public void m1(String a){
        System.out.println("E");
    }
}
class Child1 extends Parent1{
    public Child1() {
        System.out.println("B");
    }
    public void m(){
        System.out.println("D");
    }
    public void m1(){
        System.out.println("F");
    }
}

class Parent2 {
    public Parent2() {
        System.out.println("A");
    }
    public Parent2(int a){
        System.out.println("B");
    }
}

class child2 extends Parent2{
    public child2() {
        System.out.println("C");
    }

    public child2(int a) {
        this();
        System.out.println("D");
    }
}
