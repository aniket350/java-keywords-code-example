package com.stackroute.javakeywords.innerclass;

public class MainClass {

    public static void main(String[] args) {
        OuterClass.Inner in = new OuterClass().new Inner();
        in.show();
    }
}


