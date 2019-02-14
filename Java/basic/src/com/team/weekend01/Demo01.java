package com.team.weekend01;

public class Demo01 {

    public String method() {
        return "class 1";
    }
}

class Demo2 extends Demo01 {
    public String method(int x) {
        return "class 2";
    }
    public static void main(String[] args) {
        Demo01 x = new Demo2();
        System.out.println(x.method());
    }
}
